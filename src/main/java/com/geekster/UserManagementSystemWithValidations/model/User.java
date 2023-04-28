package com.geekster.UserManagementSystemWithValidations.model;

import org.hibernate.validator.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userId;
    @NotEmpty
    private String userName;
    @Pattern(regexp = "(\\d{4})-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9])")
    private String DateOfBirth;
    @Email
    private String email;
    @Size(min = 10 , max =12)
    @Pattern(regexp = "^[0-9]+$")
    private String phoneNumber;
    private String date;
    private String time;

}
