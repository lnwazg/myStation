package com.lnwazg.controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.lnwazg.kit.anno.Anno;
import com.lnwazg.kit.cache.JvmMemCacheLite;
import com.lnwazg.kit.controllerpattern.Controller;
import com.lnwazg.kit.list.Lists;
import com.lnwazg.service.GuokeRssService;

@Controller("/rss")
public class RssController extends ParentController {

	@SuppressWarnings("unchecked")
	@Anno("查看Rss列表")
	void viewRss() {
		List<String> contentList = (List<String>) JvmMemCacheLite.get("rssList", 5, TimeUnit.MINUTES);
		if (Lists.isEmpty(contentList)) {
			GuokeRssService.refreshRssContentCache();
		}
		okJson(contentList);
	}
}
