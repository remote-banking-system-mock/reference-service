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
public class Role extends AbstractBaseDomain {
    private String name;
}
