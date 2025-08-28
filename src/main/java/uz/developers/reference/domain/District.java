package uz.developers.reference.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class District extends AbstractBaseDomain {
    private String name;
    @ManyToOne
    private Region region;
}
