package uz.isytem.carsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isytem.carsale.entity.UserType;

public interface UserTypeRepository extends JpaRepository<UserType, Integer> {
}
