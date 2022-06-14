package uz.isytem.carsale.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
public class ApplicationTypeDto {

    private Integer id;
    @NotBlank(message = ("Invalid name"))
    @Size(max = 45)
    private String name;
    @NotBlank(message = ("Invalid displayName"))
    @Size(max = 45)
    private String displayName;
    @NotBlank(message = ("Invalid displayClass"))
    @Size(max = 45)
    private String displayClass;
    @NotBlank(message = ("Invalid displayIcon"))
    @Size(max = 45)
    private String displayIcon;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
