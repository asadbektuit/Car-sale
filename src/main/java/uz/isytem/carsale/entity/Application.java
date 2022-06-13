package uz.isytem.carsale.entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("applications"))
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = ("type"))
    private Integer typeId;

    @Column(name = ("user_id"))
    private Integer userId;

    @Column(name = ("merchant_id"))
    private Integer merchantId;

    @Column(name = ("vehicle_id"))
    private Integer vehicleId;

    @Column(name = ("vehicle_details"))
    private String vehicleDetails;

    private Double price;

    @Column(name = ("condition_duration_type"))
    private Integer conditionDurationType;

    @Column(name = ("condition_duration"))
    private Integer conditionDuration;

    @Column(name = ("condition_price"))
    private Double  conditionPrice;

    @Column(name = ("process_status_id"))
    private Integer processStatusId;

    @Column(name = ("created_at"))
    private LocalDateTime createdAt;

    @Column(name = ("updated_at"))
    private LocalDateTime updatedAt;

    @Column(name = ("deleted_at"))
    private LocalDateTime deletedAt;





}
