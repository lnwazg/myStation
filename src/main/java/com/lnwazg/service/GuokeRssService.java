package com.lnwazg.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lnwazg.dao.RssInfoDao;
import com.lnwazg.entity.RssInfo;
import com.lnwazg.kit.cache.JvmMemCacheLite;
import com.lnwazg.kit.log.Logs;
import com.lnwazg.kit.rss.GuokeRss;
import com.lnwazg.kit.singleton.B;

public class GuokeRssService
{
    RssInfoDao rssInfoDao = B.g(RssInfoDao.class);
    
    /**
     * 刷新内容缓存
     */
    public void refreshRssContentCache()
    {
        Logs.i("refreshRssContentCache...");
        List<String> contentList = GuokeRss.getNowRssList();
        JvmMemCacheLite.put("rssList", contentList);
    }
    
    public void refreshRssContentCacheFromSqliteDB()
        throws SQLException
    {
        Logs.i("refreshRssContentCacheFromSqliteDB...");
        List<String> contentList = new ArrayList<String>();
        List<RssInfo> rssInfos = rssInfoDao.queryByOrderByIdDesc();
        for (RssInfo rssInfo : rssInfos)
        {
            contentList.add(rssInfo.getContent());
        }
        JvmMemCacheLite.put("rssListSqlite", contentList);
    }
    
}
