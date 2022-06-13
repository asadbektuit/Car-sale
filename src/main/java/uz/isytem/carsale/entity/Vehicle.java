package uz.isytem.carsale.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("vehicles"))
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = ("merchant_id"), insertable = false, updatable = false)
    private Merchant merchant;

    @Column(name = ("merchant_id"))
    private Integer merchantId;

    @ManyToOne
    @JoinColumn(name = ("model_id"), insertable = false, updatable = false)
    private Model model;

    @Column(name = ("model_id"))
    private Integer modelId;

    @ManyToOne
    @JoinColumn(name = ("brand_id"), insertable = false, updatable = false)
    private Brand brand;

    @Column(name = ("brand_id"))
    private Integer brandId;

    @ManyToOne
    @JoinColumn(name = ("body_type_id"), insertable = false, updatable = false)
    private BodyType bodyType;

    @Column(name = ("body_type_id"))
    private Integer bodyTypeId;

    private String name;

    private Integer year;

    private String color;

    @Column(name = ("number_sits"))
    private Integer numberSits;

    @Column(name = ("is_new"))
    private Boolean isNew;

    private Double price;

    @Column(name = ("condition_duration_type"))
    private Integer conditionDurationType;

    @Column(name = ("condition_duration"))
    private Integer conditionDuration;

    @Column(name = ("condition_price"))
    private Double conditionPrice;

    private Boolean status;

    @Column(name = ("created_at"))
    private LocalDateTime createdAt;

    @Column(name = ("updated_at"))
    private LocalDateTime updatedAt;

    @Column(name = ("deleted_at"))
    private LocalDateTime deletedAt;

}
