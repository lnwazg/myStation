package com.lnwazg.controller;

import com.lnwazg.httpkit.controller.BaseController;
import com.lnwazg.kit.controllerpattern.Controller;
import com.lnwazg.kit.singleton.B;
import com.lnwazg.service.WorkInfoService;

@Controller("/workinfo")
public class WorkInfoController extends BaseController
{
    WorkInfoService workInfoService = B.g(WorkInfoService.class);
    
    void hello()
    {
        okHtml("helloWorld");
    }
}
