package com.markcwg.dubbodemoprovider.service;

import com.markcwg.dubbo.interfaces.entity.User;
import com.markcwg.dubbo.interfaces.service.IUserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author markcwg
 * @date 2022/9/16 16:01
 */
@Service
@DubboService
public class UserService implements IUserService {

    @Override
    public User queryUserInfo(Long userId) {
        return User.builder().userId(userId).age(18).username("markcwg").build();
    }
}
