package com.markcwg.dubbo.interfaces.service;

import com.markcwg.dubbo.interfaces.entity.SerializableFile;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件相关接口
 *
 * @author markcwg
 * @date 2022/9/19 11:39
 */
public interface IFileService {

    /**
     * 简单上传
     *
     * @param file 文件
     * @return {@code String}
     */
    String simpleUpload(MultipartFile file);

    /**
     * 通过消费者使用上面这个接口 simpleUpload 上传文件时会报需要序列化的异常
     * 此处复制出一个类,用于装载 MultipartFile 接口中的文件数据
     *
     * @param file 文件
     * @return {@code String}
     */
    String simpleUploadSerializable(SerializableFile file);
}
