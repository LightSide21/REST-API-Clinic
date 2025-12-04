package com.example.clinic.service.api.dto.request;

import com.example.clinic.service.api.dto.request.objects.ScheduleDtoRequest;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class CreateDoctorRequest {
    @NotBlank
    private String login;

    @NotBlank
    private String password;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Nullable
    private String middleName;

    @NotNull
    private Long specialtyId;

    @Nullable
    private List<ScheduleDtoRequest> schedules;
}
