package com.lnwazg.rpc.service.impl;

import com.lnwazg.rpc.service.UserService;
import com.lnwazg.rpc.service.dto.UserRequest;
import com.lnwazg.rpc.service.dto.UserResponse;

public class UserSericeImpl implements UserService
{
    public String queryUser(String name)
    {
        return name + " is very good!";
    }
    
    @Override
    public UserResponse processUserRequest(UserRequest userRequest)
    {
        return new UserResponse().setMsg("This is reply from " + userRequest.getName() + " and age is " + userRequest.getAge());
    }
}
