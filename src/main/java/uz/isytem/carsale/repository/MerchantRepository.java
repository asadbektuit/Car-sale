package uz.isytem.carsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isytem.carsale.entity.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Integer> {
}
