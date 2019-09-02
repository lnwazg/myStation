package com.lnwazg.controller;

import com.lnwazg.controller.api.UserService;
import com.lnwazg.httpkit.anno.JsonResponse;
import com.lnwazg.kit.controllerpattern.Controller;

@Controller("/UserService")
@JsonResponse
public class UserSericeController extends ParentController implements UserService
{
    @Override
    public String queryUser(String name)
    {
        return name + " is very good!";
    }
    
}
