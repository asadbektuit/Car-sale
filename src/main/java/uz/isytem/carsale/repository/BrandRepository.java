package uz.isytem.carsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isytem.carsale.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
