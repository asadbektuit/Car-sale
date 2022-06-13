package uz.isytem.carsale.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("users"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = ("user_type_id"), insertable = false, updatable = false)
    private UserType userType;

    @Column(name = ("user_type_id"))
    private Integer userTypeId;

    private String username;

    private String password;

    private String email;

    private String token;

    @Column(name = ("first_name"))
    private String firstName;

    @Column(name = ("last_name"))
    private String lastName;

    private String avatar;

    private String phone;

    private LocalDate birth;

    private String address;

    private String address2;

    @Column(name = ("city_id"))
    private Integer cityId;

    private String postcode;

    @Column(name = ("qr_code"))
    private String qrCode;

    @Column(name = ("email_verified_at"))
    private LocalDateTime emailVerifiedAt;

    @Column(name = ("phone_verified_at"))
    private LocalDateTime phoneVerifiedAt;

    private Boolean status;

    @Column(name = ("created_at"))
    private LocalDateTime createdAt;

    @Column(name = ("updated_at"))
    private LocalDateTime updatedAt;

    @Column(name = ("deleted_at"))
    private LocalDateTime deletedAt;
}
