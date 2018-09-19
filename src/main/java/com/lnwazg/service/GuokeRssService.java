package com.lnwazg.service;

import java.util.List;

import com.lnwazg.kit.cache.JvmMemCacheLite;
import com.lnwazg.kit.log.Logs;
import com.lnwazg.kit.rss.GuokeRss;

public class GuokeRssService {

	/**
	 * 刷新内容缓存
	 */
	public static void refreshRssContentCache() {
		Logs.i("refreshRssContentCache...");
		List<String> contentList = GuokeRss.getNowRssList();
		JvmMemCacheLite.put("rssList", contentList);
	}

}
