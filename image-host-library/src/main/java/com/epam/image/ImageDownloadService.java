package com.epam.image;

import java.nio.charset.StandardCharsets;

// DO NOT CHANGE THIS FILE
public final class ImageDownloadService {

    private static ImageDownloadService instance = new ImageDownloadService();

    private static int callQuota = 3;

    private ImageDownloadService() {

    }

    public static ImageDownloadService getInstance() {
        return instance;
    }

    public Image downloadImage(ImageRequest request) {

        System.out.println("API call to ImageDownloadService with id: "+request.getId());
        System.out.println("Remaining API call count: " + --callQuota);

        if (callQuota < 1) {
            throw new RuntimeException("Too many requests. You have used up all your quota!");
        }

        return new Image(
                "image".getBytes(StandardCharsets.UTF_8),
                request.getId() + ".jpg"
        );
    }
}
