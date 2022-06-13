package uz.isytem.carsale.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("user_types"))
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = ("display_name"))
    private String displayName;

    private Boolean status;

    @Column(name = ("created_at"))
    private LocalDateTime createdAt;

    @Column(name = ("updated_at"))
    private LocalDateTime updatedAt;

    @Column(name = ("deleted_at"))
    private LocalDateTime deletedAt;
}
