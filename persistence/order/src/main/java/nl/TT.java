package nl;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TIMETABLE")
@Data
public class TT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name="TT_EVENT", joinColumns=@JoinColumn(name="tt_id", referencedColumnName = "id")
            , inverseJoinColumns = @JoinColumn(name="event_id", referencedColumnName = "id"))
    List<Event> events;
}
