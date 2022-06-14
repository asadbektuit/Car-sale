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

    @Column(name = ("vehicle_details"))
    private String vehicleDetails;

    private Double price;

    @Column(name = ("condition_duration_type"))
    private Integer conditionDurationType;

    @Column(name = ("condition_duration"))
    private Integer conditionDuration;

    @Column(name = ("condition_price"))
    private Double  conditionPrice;

    @Column(name = ("created_at"))
    private LocalDateTime createdAt;

    @Column(name = ("updated_at"))
    private LocalDateTime updatedAt;

    @Column(name = ("deleted_at"))
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = ("application_id"),insertable = false,updatable = false)
    private Application application;

    @Column(name = ("application_id"))
    private Integer applicationId;

    @ManyToOne
    @JoinColumn(name = ("vehicle_id"),insertable = false,updatable = false)
    private Vehicle vehicle;

    @Column(name = ("vehicle_id"))
    private Integer vehicleId;

    @ManyToOne
    @JoinColumn(name = ("user_id"),insertable = false,updatable = false)
    private User user;

    @Column(name = ("user_id"))
    private Integer userId;

    @ManyToOne
    @JoinColumn(name = ("process_status_id"),insertable = false,updatable = false)
    private ProcessStatus processStatus;

    @Column(name = ("process_status_id"))
    private Integer processStatusId;

    @ManyToOne
    @JoinColumn(name = ("merchant_id"),insertable = false,updatable = false)
    private Merchant merchant;

    @Column(name = ("merchant_id"))
    private Integer merchantId;
}
