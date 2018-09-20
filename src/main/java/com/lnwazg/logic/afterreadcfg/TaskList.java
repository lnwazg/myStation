package com.lnwazg.logic.afterreadcfg;

import java.util.Map;

import com.lnwazg.kit.anno.Anno;
import com.lnwazg.kit.handlerseq.Task;
import com.lnwazg.kit.platform.Platforms;

/**
 * 任务列表
 * 
 * @author nan.li
 * @version 2018年9月20日
 */
public class TaskList {
	@Task
	@Anno("修正配置信息")
	void modifyApplicationCfgs(Map<String, String> appConfigs) {
		if (!Platforms.IS_WINDOWS) {
			//如果是mac等机器，那么手动修正相关的配置参数
			appConfigs.put("db.url", String.format("jdbc:sqlite://%s/myStation.db", Platforms.USER_HOME));
		}
	}
}
