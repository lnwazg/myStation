package com.lnwazg.job;

import java.util.List;

import org.quartz.JobExecutionContext;

import com.lnwazg.kit.cache.JvmMemCacheLite;
import com.lnwazg.kit.job.PromptJob;
import com.lnwazg.kit.job.Scheduled;
import com.lnwazg.kit.rss.GuokeRss;

@Scheduled(cron = "0 */5 * * * ?")
public class RefreshRssCacheJob extends PromptJob
{
    @Override
    public void executeCustom(JobExecutionContext context)
    {
        List<String> contentList = GuokeRss.getNowRssList();
        JvmMemCacheLite.put("rssList", contentList);
    }
}
