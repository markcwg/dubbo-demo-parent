package com.markcwg.dubbodemoconsumer.controller;

import com.markcwg.dubbo.interfaces.entity.SerializableFile;
import com.markcwg.dubbo.interfaces.service.IFileService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author markcwg
 * @date 2022/9/19 14:44
 */
@RestController
public class FileController {

    @DubboReference
    IFileService fileService;

    @PostMapping("simple")
    public String simpleUpload(MultipartFile file) {
        return fileService.simpleUpload(file);
    }

    @PostMapping("serializableUpload")
    public String serializableUpload(MultipartFile file) throws Exception {
        return fileService.simpleUploadSerializable(SerializableFile.builder()
                .bytes(file.getBytes())
                .contentType(file.getContentType())
                .size(file.getSize())
                .inputStream(file.getInputStream())
                .originalFilename(file.getOriginalFilename())
                .name(file.getName())
                .build());
    }
}
