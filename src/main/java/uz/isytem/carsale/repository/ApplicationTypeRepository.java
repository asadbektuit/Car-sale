package uz.isytem.carsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isytem.carsale.entity.ApplicationType;

public interface ApplicationTypeRepository extends JpaRepository<ApplicationType, Integer> {
}
