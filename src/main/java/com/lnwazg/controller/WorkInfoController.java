package com.lnwazg.controller;

import java.util.Date;

import org.apache.commons.lang3.Validate;

import com.lnwazg.entity.WorkInfo;
import com.lnwazg.kit.common.model.FrontObj;
import com.lnwazg.kit.controllerpattern.Controller;
import com.lnwazg.kit.singleton.B;
import com.lnwazg.service.WorkInfoService;

@Controller("/workinfo")
public class WorkInfoController extends ParentController
{
    WorkInfoService workInfoService = B.g(WorkInfoService.class);
    
    void hello()
    {
        okHtml("helloWorld");
    }
    
    void saveWorkInfo()
    {
        FrontObj frontObj = new FrontObj();
        try
        {
            String content = getParam("content");
            Validate.notEmpty(content);
            WorkInfo workInfo = new WorkInfo();
            workInfo.setContent(content).setCreateTime(new Date());
            workInfoService.workInfoDao.insert(workInfo);
            okJson(frontObj.success().setErrmsg("工作信息保存成功"));
        }
        catch (Exception e)
        {
            processFail(e, frontObj);
        }
    }
}
