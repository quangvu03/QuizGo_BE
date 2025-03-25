package com.example.dtos;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Data;

import java.time.LocalDate;

@Serdeable
@Data
public class UserDTO {
    private Long id;
    private String userName;
    private String password;
    private String fullName;
    private Byte status;
    private String email;
    private LocalDate dateOfBirth;
    private String phone;

}
