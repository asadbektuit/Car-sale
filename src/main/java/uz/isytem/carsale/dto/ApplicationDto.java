package uz.isytem.carsale.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ApplicationDto {

    private Integer id;
    private String vehicleDetails;
    private Double price;
    private Integer conditionDurationType;
    private Integer conditionDuration;
    private Double  conditionPrice;
    private Integer applicationId;
    private Integer vehicleId;
    private Integer userId;
    private Integer processStatusId;
    private Integer merchantId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}

