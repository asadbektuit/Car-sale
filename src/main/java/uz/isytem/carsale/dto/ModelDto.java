package uz.isytem.carsale.dto;

import lombok.Getter;
import lombok.Setter;
import uz.isytem.carsale.entity.Brand;
import java.time.LocalDateTime;

@Getter
@Setter
public class ModelDto {

    private Integer id;
    private String name;
    private Boolean status;
    private Integer brandId;
    private Brand brand;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
