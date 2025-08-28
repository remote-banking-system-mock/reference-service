package uz.developers.reference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.developers.reference.domain.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}