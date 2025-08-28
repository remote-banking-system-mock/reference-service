package uz.developers.reference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.reference.domain.TransactionPurpose;

public interface TransactionPurposeRepository extends JpaRepository<TransactionPurpose, Long> {
}