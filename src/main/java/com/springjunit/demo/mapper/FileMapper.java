package com.springjunit.demo.mapper;

import com.springjunit.demo.model.entity.Media;
import com.springjunit.demo.model.request.FileRequest;
import com.springjunit.demo.model.response.FileResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FileMapper {


    public List<Media> mapFileEntity(List<FileRequest> fileRequests) {
        return fileRequests.stream().map(this::map).collect(Collectors.toList());
    }

    private Media map(FileRequest fileRequest) {
        return new Media().setName(fileRequest.getName()).setTypeMedia(fileRequest.getTypeMedia()).setUrl(fileRequest.getUrl()).setOwner(fileRequest.getOwner());
    }

    public List<FileResponse> mapToResponse(List<Media> mediaList) {

        return mediaList.stream().map(this::mapDTO).collect(Collectors.toList());
    }

    private FileResponse mapDTO(Media media) {

        return new FileResponse().setId(media.getId()).setName(media.getName()).setUrl(media.getUrl());
    }
}
