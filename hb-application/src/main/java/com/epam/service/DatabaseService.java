package com.epam.service;

// DO NOT CHANGE THIS CLASS
public class DatabaseService {

    public String getRealNameById(String id) {
        if ("AAA".equals(id)) {
            return id;
        } else {
            throw new RuntimeException("Invalid or empty name!");
        }
    }

}
