package uz.developers.reference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.reference.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}