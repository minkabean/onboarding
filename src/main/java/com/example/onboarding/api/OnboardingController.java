package com.example.onboarding.api;

import com.example.onboarding.service.OnboardingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1")
public class OnboardingController {

    private final OnboardingService service;

    public OnboardingController(OnboardingService service) {
        this.service = service;
    }

    @PostMapping("/applications")
    @ResponseStatus(HttpStatus.CREATED)
    public CreateApplicationResponse create(
            @Valid @RequestBody CreateApplicationRequest request
    ) 
    {
        return service.createApplication(request);
    }



}
