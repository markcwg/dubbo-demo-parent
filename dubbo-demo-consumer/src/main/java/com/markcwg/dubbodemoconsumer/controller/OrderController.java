package com.markcwg.dubbodemoconsumer.controller;

import com.markcwg.dubbo.interfaces.service.IUserService;
import com.markcwg.dubbodemoconsumer.entity.Order;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author markcwg
 * @date 2022/9/16 16:05
 */
@RestController
@RequestMapping
public class OrderController {

    @DubboReference
    IUserService userService;

    @GetMapping("order")
    public Order queryOrderInfo(Long userId) {
        return Order.builder().orderId(UUID.randomUUID().toString()).user(userService.queryUserInfo(userId)).build();
    }
}
