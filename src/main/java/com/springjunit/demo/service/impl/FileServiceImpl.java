package com.springjunit.demo.service.impl;

import com.springjunit.demo.exception.BusinessException;
import com.springjunit.demo.mapper.FileMapper;
import com.springjunit.demo.model.bo.TypeMedia;
import com.springjunit.demo.model.entity.Media;
import com.springjunit.demo.model.request.FileRequest;
import com.springjunit.demo.model.response.FileResponse;
import com.springjunit.demo.repository.MediaRepository;
import com.springjunit.demo.service.FileService;
import com.springjunit.demo.util.Constant;
import com.springjunit.demo.util.ErrorCode;
import com.springjunit.demo.util.ErrorMessage;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

    private final Logger logger = LogManager.getLogger(getClass());
    private final FileMapper mapper;
    private final MediaRepository repository;
    @Value("${app.server.upload.folder.path}")
    private String uploadDir;

    /**
     * upload file
     *
     * @param
     * @return
     */
    @Override
    public List<FileResponse> upload(MultipartFile[] files, TypeMedia type) {
        if (files.length > 10)
            throw new BusinessException(ErrorCode.ONLY_UPLOAD_10_FILES, ErrorMessage.ONLY_UPLOAD_10_FILES);

        List<FileRequest> fileRequests = new ArrayList<>();

        Arrays.stream(files).forEach(file -> {
            String fileName = getFileName(file);
            try {
                saveFile(uploadDir, fileName, file);
                fileRequests.add(new FileRequest().setOwner(null)
                        .setUrl(createImageSource(fileName).toString())
                        .setTypeMedia(type)
                        .setName(file.getOriginalFilename()));
            } catch (IOException e) {
                logger.error(FileService.class, e);
            }
        });

        List<Media> mediaList = mapper.mapFileEntity(fileRequests);
        repository.insertAll(mediaList);

        return mapper.mapToResponse(mediaList);
    }

    /**
     * @param fileName
     * @return
     */
    private StringBuilder createImageSource(String fileName) {
        return new StringBuilder("/images/").append(LocalDate.now()).append("/")
                .append(fileName);
    }

    /**
     * @param uploadDir
     * @param fileName
     * @param multipartFile
     * @throws IOException
     */
    private void saveFile(String uploadDir, String fileName,
                          MultipartFile multipartFile) throws IOException {
        LocalDate folderName = LocalDate.now();
        Path uploadPath = Paths.get(uploadDir);

        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        Path uploadPathFolder = Paths.get(uploadDir + "/" + folderName);

        if (!Files.exists(uploadPathFolder)) {
            Files.createDirectories(uploadPathFolder);
        }

        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPathFolder.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new IOException("Could not save image file: " + fileName, e);
        }
    }


    private String getFileName(MultipartFile file) {
        return modifyFileName(Objects.requireNonNull(file.getOriginalFilename()));
    }

    /**
     * @param fileName
     * @return
     */
    private String modifyFileName(String fileName) {
        return Constant.generateUUID() + Constant.SEPARATOR + fileName.replaceAll("\\s+", " ").replace(' ', '-');
    }


}
