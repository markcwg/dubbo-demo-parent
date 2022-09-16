package com.markcwg.dubbodemoprovider.controller;

import com.markcwg.dubbo.interfaces.entity.User;
import com.markcwg.dubbo.interfaces.service.IUserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author markcwg
 * @date 2022/9/16 16:00
 */
@RestController
@RequestMapping
@Setter(onMethod_ = {@Autowired})
public class UserController {

    private IUserService userService;

    @GetMapping("/user")
    public User queryUserInfo(Long userId) {
        return userService.queryUserInfo(userId);
    }
}
