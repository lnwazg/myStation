package com.lnwazg;

import java.io.IOException;

import com.lnwazg.dbkit.jdbc.MyJdbc;
import com.lnwazg.dbkit.utils.DbKit;
import com.lnwazg.httpkit.filter.CtrlFilterChain;
import com.lnwazg.httpkit.server.HttpServer;
import com.lnwazg.kit.log.Logs;
import com.lnwazg.kit.platform.Platforms;
import com.lnwazg.kit.singleton.B;
import com.lnwazg.util.Constants;

public class LocalMain {
	public static void main(String[] args) {
		// 日志中是否打开时间戳记录
		Logs.TIMESTAMP_LOG_SWITCH = true;

		// 文件日志开关
		Logs.FILE_LOG_SWITCH = true;

		// 打印的数据库操作日志是否是详细模式
		DbKit.DEBUG_MODE = true;
		// 慢sql监控工具打开
		DbKit.SQL_MONITOR = true;

		// 获取jdbc对象
		MyJdbc jdbc = null;
		if (!Platforms.IS_WINDOWS) {
			jdbc = DbKit.getJdbc(String.format("jdbc:sqlite://%s/myStation.db", Platforms.USER_HOME), "", "");
		} else {
			jdbc = DbKit.getJdbc(Constants.DB_CONFIG_FILE_NAME);
		}

		B.s(MyJdbc.class, jdbc);

		// 自动初始化表结构
		DbKit.packageSearchAndInitTables("com.lnwazg.entity", jdbc);

		// 初始化DAO层
		DbKit.packageSearchAndInitDao("com.lnwazg.dao", jdbc);

		// 初始化service层
		DbKit.packageSearchAndInitService("com.lnwazg.service", jdbc);

		// 起一个server实例，并初始化controller层
		int port = 8080;
		HttpServer server;
		try {
			server = HttpServer.bind(port);
			// server之所以没做成单例模式的，是因为我要支持多实例的server对象在一个项目中共存
			server.setControllerSuffix("do");
			server.setMyZooGroupName("mystation");
			// 读配置文件，初始化过滤器链条
			CtrlFilterChain ctrlFilterChain = server.initFilterConfigs();
			// 为controller设置动态代理
			// 最终初始化controller
			server.packageSearchAndInit("com.lnwazg.controller", ctrlFilterChain);
			// 监听在这个端口处
			server.listen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
