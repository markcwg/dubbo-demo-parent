package com.markcwg.dubbo.interfaces.service;

import com.markcwg.dubbo.interfaces.entity.User;

/**
 * @author markcwg
 * @date 2022/9/16 15:58
 */
public interface IUserService {

    /**
     * 查询用户信息
     *
     * @param userId 用户id
     * @return {@code User}
     */
    User queryUserInfo(Long userId);
}
