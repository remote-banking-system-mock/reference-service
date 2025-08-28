package uz.developers.reference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.reference.domain.District;

public interface DistrictRepository extends JpaRepository<District, Long> {
}