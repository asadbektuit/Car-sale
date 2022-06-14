package uz.isytem.carsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isytem.carsale.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
