package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;

@Entity
@Table(name = "table")
public class Teble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name; // номер столика или его название
    private int numsOfseets;  // количество мест за столико максимально
    private boolean isReserved;
    private String fixedWaiter; // официант может быть закрепленн за столиком

}
