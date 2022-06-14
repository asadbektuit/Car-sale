package uz.isytem.carsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isytem.carsale.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
