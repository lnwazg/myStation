package com.lnwazg.job;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.quartz.JobExecutionContext;

import com.lnwazg.dao.RssInfoDao;
import com.lnwazg.entity.RssInfo;
import com.lnwazg.kit.job.PromptJob;
import com.lnwazg.kit.job.Scheduled;
import com.lnwazg.kit.rss.GuokeRss;
import com.lnwazg.kit.singleton.B;

@Scheduled(cron = "0 */1 * * * ?")
public class QueryRssInfo2SqliteDbJob extends PromptJob
{
    RssInfoDao rssInfoDao = B.g(RssInfoDao.class);
    
    @Override
    public void executeCustom(JobExecutionContext context)
    {
        List<String> contentList = GuokeRss.getNowRssList();
        for (String content : contentList)
        {
            //若数据库中存在，则忽略；否则，插入
            try
            {
                if (rssInfoDao.contains(RssInfo.class, "content", content))
                {
                    //do nothing
                }
                else
                {
                    rssInfoDao.insert(new RssInfo().setContent(content).setCreateTime(new Date()));
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}
