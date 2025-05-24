package com.rizwan.customer.dto;

public record CustomerRegisterRequest(
        String firstName,
        String lastName,
        String email) {
}
