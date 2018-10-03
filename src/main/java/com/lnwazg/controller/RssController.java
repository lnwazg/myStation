package com.lnwazg.controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.lnwazg.kit.anno.Anno;
import com.lnwazg.kit.cache.JvmMemCacheLite;
import com.lnwazg.kit.common.model.FrontObj;
import com.lnwazg.kit.controllerpattern.Controller;
import com.lnwazg.kit.list.Lists;
import com.lnwazg.kit.singleton.B;
import com.lnwazg.service.GuokeRssService;

@Controller("/rss")
public class RssController extends ParentController
{
    GuokeRssService guokeRssService = B.g(GuokeRssService.class);
    
    @SuppressWarnings("unchecked")
    @Anno("查看Rss列表")
    void viewRss()
    {
        List<String> contentList = (List<String>)JvmMemCacheLite.get("rssList", 5, TimeUnit.MINUTES);
        if (Lists.isEmpty(contentList))
        {
            guokeRssService.refreshRssContentCache();
            contentList = (List<String>)JvmMemCacheLite.get("rssList", 5, TimeUnit.MINUTES);
        }
        okJson(contentList);
    }
    
    @SuppressWarnings("unchecked")
    @Anno("查看全部的Rss列表")
    void viewRssAll()
    {
        try
        {
            //加载从db中查询的结果，若查不到，则主动查一次db
            List<String> contentList = (List<String>)JvmMemCacheLite.get("rssListSqlite", 2, TimeUnit.MINUTES);
            if (contentList == null)
            {
                guokeRssService.refreshRssContentCacheFromSqliteDB();
                contentList = (List<String>)JvmMemCacheLite.get("rssListSqlite", 2, TimeUnit.MINUTES);
            }
            okJson(contentList);
        }
        catch (Exception e)
        {
            processFail(e, FrontObj.newInstance());
        }
    }
}
