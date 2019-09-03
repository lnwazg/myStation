package com.lnwazg.rpc.service.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 用户请求
 * @author nan.li
 * @version 2019年9月2日
 */
public class UserRequest
{
    private String name;
    
    private String age;
    
    public String getName()
    {
        return name;
    }
    
    public UserRequest setName(String name)
    {
        this.name = name;
        return this;
    }
    
    public String getAge()
    {
        return age;
    }
    
    public UserRequest setAge(String age)
    {
        this.age = age;
        return this;
    }
    
    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
