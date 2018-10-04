package com.lnwazg.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.lnwazg.httpkit.anno.JsonResponse;
import com.lnwazg.kit.cache.JvmMemCacheLite;
import com.lnwazg.kit.controllerpattern.Controller;
import com.lnwazg.kit.singleton.B;
import com.lnwazg.service.GuokeRssService;

@Controller("/json")
@JsonResponse
public class JsonController extends ParentController
{
    GuokeRssService guokeRssService = B.g(GuokeRssService.class);
    
    String sayHello()
    {
        return "hello";
    }
    
    @SuppressWarnings("unchecked")
    List<String> rss()
        throws SQLException
    {
        List<String> contentList = (List<String>)JvmMemCacheLite.get("rssListSqlite", 1, TimeUnit.MINUTES);
        if (contentList == null)
        {
            guokeRssService.refreshRssContentCacheFromSqliteDB();
            contentList = (List<String>)JvmMemCacheLite.get("rssListSqlite", 1, TimeUnit.MINUTES);
        }
        return contentList;
    }
    
}
