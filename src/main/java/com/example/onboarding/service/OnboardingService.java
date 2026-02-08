package com.example.onboarding.service;

import com.example.onboarding.api.CreateApplicationRequest;
import com.example.onboarding.api.CreateApplicationResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OnboardingService {

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        String id = UUID.randomUUID().toString();
        return new CreateApplicationResponse(id, "PENDING");
    }
}
