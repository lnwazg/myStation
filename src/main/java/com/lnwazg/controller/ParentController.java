package com.lnwazg.controller;

import org.apache.commons.lang3.StringUtils;

import com.lnwazg.httpkit.controller.BaseController;
import com.lnwazg.kit.common.model.FrontObj;
import com.lnwazg.kit.log.Logs;

public class ParentController extends BaseController
{
    /**
     * 统一处理失败信息
     * @author nan.li
     * @param e
     * @param frontObj
     */
    protected void processFail(Exception e, FrontObj frontObj)
    {
        Logs.e(e);
        if (StringUtils.isNotEmpty(e.getMessage()) && e.getMessage().indexOf("未登录") != -1)
        {
            okJson(frontObj.fail(10024, e.getMessage()));
        }
        else
        {
            okJson(frontObj.fail(e.getMessage()));
        }
    }
}
