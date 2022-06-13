package uz.isytem.carsale.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("merchants"))
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = ("user_id"), insertable = false, updatable = false)
    private User user;

    @Column(name = ("user_id"))
    private Integer userId;

    private String slug;

    private String name;

    @Column(name = ("image_thumb"))
    private String imageThumb;

    @Column(name = ("is_featured"))
    private Boolean isFeatured;

    private String phone;

    private String mobile;

    private String email;

    private String website;

    private String address;

    private String country;

    private Boolean status;

    @Column(name = ("created_at"))
    private LocalDateTime createdAt;

    @Column(name = ("updated_at"))
    private LocalDateTime updatedAt;

    @Column(name = ("deleted_at"))
    private LocalDateTime deletedAt;
}
