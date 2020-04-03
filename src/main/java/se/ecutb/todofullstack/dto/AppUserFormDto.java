package se.ecutb.todofullstack.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import static se.ecutb.todofullstack.constants.messages.ValidationMessages.*;
import static se.ecutb.todofullstack.constants.regex.RegexPatterns.*;

public class AppUserFormDto {

    @NotBlank(message = FIELD_REQUIRED_MESSAGE)
    @Pattern(regexp = USERNAME_PATTERN, message = USERNAME_FORMAT_MESSAGE)
    private String userName;

    @NotBlank(message = FIELD_REQUIRED_MESSAGE)
    @Size(min = 2, max = 255, message = NAME_MESSAGE)
    private String firstName;

    @NotBlank(message = FIELD_REQUIRED_MESSAGE)
    @Size(min = 2, max = 255, message = NAME_MESSAGE)
    private String lastName;

    @NotBlank(message = FIELD_REQUIRED_MESSAGE)
    @Pattern(regexp = PASSWORD_PATTERN, message = PASSWORD_MESSAGE)
    private String password;

    @NotBlank(message = FIELD_REQUIRED_MESSAGE)
    private String passwordConfirm;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
}
