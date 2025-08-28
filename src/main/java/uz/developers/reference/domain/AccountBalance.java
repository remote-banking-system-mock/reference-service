package uz.developers.reference.domain;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AccountBalance extends AbstractBaseDomain {
    private String code;
    private String name;
}
