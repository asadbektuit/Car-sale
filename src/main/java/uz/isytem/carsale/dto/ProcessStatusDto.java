package uz.isytem.carsale.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
public class ProcessStatusDto {

    private Integer id;
    @NotBlank(message = ("Invalid name"))
    @Size(max = 45)
    private String name;
    @NotBlank(message = ("Invalid displayName"))
    @Size(max = 45)
    private String displayName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
