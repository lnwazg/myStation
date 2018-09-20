package com.lnwazg;

import com.lnwazg.boot.BootApplication;
import com.lnwazg.kit.handlerseq.HandlerSequence;
import com.lnwazg.service.GuokeRssService;

/**
 * 以Boot的方式启动
 * @author nan.li
 * @version 2018年9月20日
 */
public class BootMain
{
    public static void main(String[] args)
    {
        BootApplication.run(BootMain.class, args);
        
        //启动后立即要做的一系列事情
        HandlerSequence.getInstance()
            .addHandler(() -> {
                GuokeRssService.refreshRssContentCache();
            })
            .execAll();
    }
}
