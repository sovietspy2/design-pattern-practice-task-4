package com.epam;

import com.epam.model.Profile;
import com.epam.model.UserImage;
import com.epam.service.FileService;
import com.epam.service.ProfileService;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.UUID;

// DO NOT CHANGE THIS FILE
public class Application {

    public static void main(String... args) {

        FileService fileService = new FileService();
        ProfileService profileService = new ProfileService();

        UserImage image = fileService.downloadSomeImage("AAA");
        checkUserImage(image);
        Profile profile = profileService.getProfile("AAA");
        checkUserProfile(profile);

        image = fileService.downloadSomeImage("AAA");
        checkUserImage(image);
        profile = profileService.getProfile("AAA");
        checkUserProfile(profile);

        image = fileService.downloadSomeImage("AAA");
        checkUserProfile(profile);
        profile = profileService.getProfile("AAA");
        checkUserProfile(profile);

        System.out.println("The app is working fine!");
    }

    private static void checkUserImage(UserImage userImage) {
        assert Arrays.equals(userImage.getContent(), "image".getBytes(StandardCharsets.UTF_8));
        assert userImage.getUuid().equals(UUID.fromString("39120c5e-02dd-408e-b1c5-0feeb429edbe"));
    }

    private static void checkUserProfile(Profile profile) {
        assert Arrays.equals(profile.getImageContent(), "image".getBytes(StandardCharsets.UTF_8));
        assert profile.getRealName().equals("AAA");
    }

}