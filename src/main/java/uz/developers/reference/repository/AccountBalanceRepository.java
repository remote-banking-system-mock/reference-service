package uz.developers.reference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.reference.domain.AccountBalance;

public interface AccountBalanceRepository extends JpaRepository<AccountBalance, Long> {
}