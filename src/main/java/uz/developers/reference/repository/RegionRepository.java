package uz.developers.reference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.reference.domain.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {
}