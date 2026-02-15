package com.example.SpringAuthentication.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
public class RegistrationRequest {
    @NotNull
    private String firstName;

    @NotNull
    private String lastname;

    @NotNull
    @Size(min = 8)
    private String password;

    @NotNull
    @Email
    private String email;


}
