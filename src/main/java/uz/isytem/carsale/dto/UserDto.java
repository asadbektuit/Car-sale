package uz.isytem.carsale.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
    private Integer id;
    private UserTypeDto userType;
    @NotBlank(message = "Invalid username")
    private String username;
    @NotBlank(message = "Invalid password")
    @Size(min = 8)
    private String password;
    @Email
    private String email;
    private String token;
    @NotBlank(message = "Invalid name")
    private String firstName;
    private String lastName;
    private String avatar;
    private String phone;
    private LocalDate birth;
    private String address;
    private String address2;
    private Integer cityId;
    private String postcode;
    private String qrCode;
    private LocalDateTime emailVerifiedAt;
    private LocalDateTime phoneVerifiedAt;
    private Boolean status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
