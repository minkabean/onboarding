
package com.example.onboarding.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateApplicationRequest(
        @NotBlank @Size(max = 200) String merchantName,
        @NotBlank @Size(min = 2, max = 2) String countryCode,
        @NotBlank @Email @Size(max = 320) String contactEmail
) {}
