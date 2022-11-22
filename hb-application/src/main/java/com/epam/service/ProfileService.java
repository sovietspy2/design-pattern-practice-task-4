package com.epam.service;

import com.epam.image.*;
import com.epam.model.Profile;

public class ProfileService {

    private final DatabaseService databaseService = new DatabaseService();

    public Profile getProfile(String id) {

        String realName = databaseService.getRealNameById(id);

        ImageDownloadService imageDownloadService = ImageDownloadService.getInstance();

        ImageRequest imageRequest = new ImageRequest();
        imageRequest.setId(id);

        Image image = imageDownloadService.downloadImage(imageRequest);

        return new Profile(realName, image.getContent());
    }

    // DO NOT CHANGE THIS METHOD
    public Profile saveProfile(Profile profile) {
        // implementation
        return null;
    }

}
