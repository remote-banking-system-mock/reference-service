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
public class Currency extends AbstractBaseDomain {
    private String code;
    private String name;
}
