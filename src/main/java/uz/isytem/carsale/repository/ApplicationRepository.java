package uz.isytem.carsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isytem.carsale.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
