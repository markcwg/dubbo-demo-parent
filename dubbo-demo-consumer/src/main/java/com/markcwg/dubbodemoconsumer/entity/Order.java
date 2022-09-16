package com.markcwg.dubbodemoconsumer.entity;

import com.markcwg.dubbo.interfaces.entity.User;
import lombok.Builder;
import lombok.Data;

/**
 * @author markcwg
 * @date 2022/9/16 16:06
 */
@Data
@Builder
public class Order {
    private User user;
    private String orderId;
}
