package uz.isytem.carsale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isytem.carsale.entity.ProcessStatus;

public interface ProcessStatusRepository extends JpaRepository<ProcessStatus, Integer> {
}
