package uz.isytem.carsale.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;



import java.time.LocalDateTime;


@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleDto {
    private Integer id;
    private MerchantDto merchant;
    private Integer merchantId;
    private ModelDto model;
    private Integer modelId;
    private BrandDto brand;
    private Integer brandId;
    private BodyTypeDto bodyType;
    private Integer bodyTypeId;
    private String name;
    private Integer year;
    private String color;
    private Integer numberSits;
    private Boolean isNew;
    private Double price;
    private Integer conditionDurationType;
    private Integer conditionDuration;
    private Double conditionPrice;
    private Boolean status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
