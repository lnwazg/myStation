package com.lnwazg.controller;

import java.util.Date;

import com.lnwazg.entity.WorkInfo;
import com.lnwazg.kit.common.model.FrontObj;
import com.lnwazg.kit.controllerpattern.Controller;
import com.lnwazg.kit.singleton.B;
import com.lnwazg.kit.validate.Validates;
import com.lnwazg.service.WorkInfoService;

/**
 * Controller类
 * @author nan.li
 * @version 2018年9月19日
 */
@Controller("/workinfo")
public class WorkInfoController extends ParentController
{
    WorkInfoService workInfoService = B.g(WorkInfoService.class);
    
    /**
     * 测试HelloWorld
     * @author nan.li
     */
    void hello()
    {
        okHtml("helloWorld");
    }
    
    /**
     * 保存工作信息
     * @author nan.li
     */
    void saveWorkInfo()
    {
        FrontObj frontObj = new FrontObj();
        try
        {
            String content = getParam("content");
            Validates.validateNotEmpty(content, "content参数不能为空！");
            WorkInfo workInfo = new WorkInfo();
            workInfo.setContent(content).setCreateTime(new Date());
            workInfoService.saveWorkInfo(workInfo);
            okJson(frontObj.success().setErrmsg("工作信息保存成功"));
        }
        catch (Exception e)
        {
            processFail(e, frontObj);
        }
    }
}
