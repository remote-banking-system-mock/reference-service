package uz.developers.reference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.reference.domain.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}