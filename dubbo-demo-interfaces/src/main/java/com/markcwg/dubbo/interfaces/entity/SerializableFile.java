package com.markcwg.dubbo.interfaces.entity;

import lombok.Builder;
import lombok.Data;

import java.io.InputStream;
import java.io.Serializable;

/**
 * 创建一个实现序列化接口的类用于存储MultipartFile接口中的文件数据
 *
 * @author markcwg
 * @date 2022/9/19 14:59
 */
@Data
@Builder
public class SerializableFile implements Serializable {
    byte[] bytes;
    String contentType;
    String name;
    InputStream inputStream;
    String originalFilename;
    Long size;
}
