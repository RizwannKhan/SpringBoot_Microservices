package com.rizwan.dto;

public record CustomerRegisterRequest(
        String firstName,
        String lastName,
        String email) {
}
