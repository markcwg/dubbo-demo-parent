package com.markcwg.dubbo.interfaces.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author markcwg
 * @date 2022/9/16 15:56
 */
@Data
@Builder
public class User implements Serializable {
    private Long userId;
    private String username;
    private Integer age;
}
