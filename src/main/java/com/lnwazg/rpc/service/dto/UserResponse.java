package com.lnwazg.rpc.service.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class UserResponse
{
    private String msg;
    
    public String getMsg()
    {
        return msg;
    }
    
    public UserResponse setMsg(String msg)
    {
        this.msg = msg;
        return this;
    }
    
    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
