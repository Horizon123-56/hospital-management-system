package com.hospital.service;

public class AuthService {
    public boolean login(String username, String password, String role) {
        if (username == null || password == null || role == null) {
            return false;
        }
        if ("ADMIN".equalsIgnoreCase(role) && "admin".equals(username) && "admin123".equals(password)) {
            return true;
        }
        if ("PATIENT".equalsIgnoreCase(role) && "patient".equals(username) && "patient123".equals(password)) {
            return true;
        }
        return false;
    }
}