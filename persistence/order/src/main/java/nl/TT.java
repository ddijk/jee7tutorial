package nl;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="TIMETABLE")
@Data
public class TT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
