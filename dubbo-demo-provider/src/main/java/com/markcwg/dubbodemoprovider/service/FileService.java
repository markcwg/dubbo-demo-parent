package com.markcwg.dubbodemoprovider.service;

import com.markcwg.dubbo.interfaces.entity.SerializableFile;
import com.markcwg.dubbo.interfaces.service.IFileService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author markcwg
 * @date 2022/9/19 11:46
 */
@Service
@DubboService
public class FileService implements IFileService {

    @Override
    public String simpleUpload(MultipartFile file) {
        return file.getOriginalFilename();
    }

    @Override
    public String simpleUploadSerializable(SerializableFile file) {
        return file.getOriginalFilename();
    }
}
