package com.lnwazg.job;

import org.quartz.JobExecutionContext;

import com.lnwazg.kit.job.PromptJob;
import com.lnwazg.kit.job.Scheduled;
import com.lnwazg.kit.singleton.BeanMgr;
import com.lnwazg.service.GuokeRssService;

@Scheduled(cron = "0 */5 * * * ?")
public class RefreshRssCacheJob extends PromptJob
{
    @Override
    public void executeCustom(JobExecutionContext context)
    {
        BeanMgr.g(GuokeRssService.class).refreshRssContentCache();
    }
}
