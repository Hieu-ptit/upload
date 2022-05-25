package com.springjunit.demo.controller;

import com.springjunit.demo.model.bo.TypeMedia;
import com.springjunit.demo.model.response.FileResponse;
import com.springjunit.demo.model.response.Response;
import com.springjunit.demo.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/files")
@Validated
@RequiredArgsConstructor
public class FileController {

    private final FileService service;

    @PostMapping()
    public Response<List<FileResponse>> upload(@RequestParam("files") MultipartFile[] files, @NotNull @RequestParam("type") TypeMedia type) {
        return Response.ofSucceeded(service.upload(files, type));
    }

}
