package uz.isytem.carsale.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MerchantDto {
    private Integer id;
    private UserDto user;
    private Integer userId;
    
}
