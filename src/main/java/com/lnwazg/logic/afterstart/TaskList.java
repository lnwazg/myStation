package com.lnwazg.logic.afterstart;

import com.lnwazg.kit.anno.Anno;
import com.lnwazg.kit.handlerseq.Task;
import com.lnwazg.service.GuokeRssService;

/**
 * 任务列表
 * @author nan.li
 * @version 2018年9月20日
 */
public class TaskList
{
    @Task
    @Anno("刷新RSS")
    void refreshRss()
    {
        GuokeRssService.refreshRssContentCache();
    }
}
