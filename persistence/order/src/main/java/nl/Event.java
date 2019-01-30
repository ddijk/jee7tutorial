package nl;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="EVENT")
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
