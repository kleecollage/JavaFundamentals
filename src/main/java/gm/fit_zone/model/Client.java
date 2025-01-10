package gm.fit_zone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data // Getter and Setters methods generated automatically
@NoArgsConstructor // Empty Constructor
@AllArgsConstructor // Full Object Constructor
@ToString // Method added automatically
@EqualsAndHashCode // Method added automatically
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String lastname;
    private Integer membership;
}
