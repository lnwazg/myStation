package com.lnwazg.rpc.service;

import com.lnwazg.rpc.service.dto.UserRequest;
import com.lnwazg.rpc.service.dto.UserResponse;

public interface UserService
{
    UserResponse processUserRequest(UserRequest userRequest);
    
    String queryUser(String name);
    
    void processAsync(UserRequest userRequest);
}
