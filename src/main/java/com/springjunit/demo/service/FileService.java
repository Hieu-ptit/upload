package com.springjunit.demo.service;

import com.springjunit.demo.model.bo.TypeMedia;
import com.springjunit.demo.model.response.FileResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileService {

    List<FileResponse> upload(MultipartFile[] files, TypeMedia type);
}
