package com.epam.service;

import com.epam.image.*;
import com.epam.image.Image;
import com.epam.model.UserImage;

import java.io.File;
import java.io.InputStream;
import java.util.UUID;

public class FileService {

    // DO NOT CHANGE THIS METHOD
    public InputStream loadFileFromSystem() {
        // Implementation
        return null;
    }

    // DO NOT CHANGE THIS METHOD
    public File loadUserData() {
        // Implementation
        return null;
    }

    public UserImage downloadSomeImage(String id) {

        ImageDownloadService imageDownloadService = ImageDownloadService.getInstance();

        UUID uuid = createUUID();

        ImageRequest imageRequest = new ImageRequest();
        imageRequest.setId(id);

        Image image = imageDownloadService.downloadImage(imageRequest);

        return new UserImage(
                image.getContent(),
                uuid
        );
    }

    // DO NOT CHANGE THIS METHOD
    private UUID createUUID() {
        // Some logic
        return UUID.fromString("39120c5e-02dd-408e-b1c5-0feeb429edbe");
    }


}
