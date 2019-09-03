package com.lnwazg.rpc.service.impl;

import com.lnwazg.rpc.service.UserService;

public class UserSericeImpl implements UserService
{
    public String queryUser(String name)
    {
        return name + " is very good!";
    }
}
