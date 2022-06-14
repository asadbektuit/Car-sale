package uz.isytem.carsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isytem.carsale.entity.Model;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
