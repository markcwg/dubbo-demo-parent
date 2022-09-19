package com.markcwg.dubbodemoprovider.controller;

import com.markcwg.dubbo.interfaces.service.IFileService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author markcwg
 * @date 2022/9/19 11:46
 */
@RestController
@Setter(onMethod_ = {@Autowired})
public class FileController {

    IFileService fileService;

    @PostMapping("simple")
    public String simpleUpload(MultipartFile file) {
        return fileService.simpleUpload(file);
    }
}
