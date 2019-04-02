package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;

@Entity
@Table(name = "table")
/**
 * TODO
 * За опечатки бьют...
 */
public class Teble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name; // номер столика или его название
    /**
     * TODO
     * опечатка
     * И вообще лучше его назвать что-то вроде maxGuests
     */
    private int numsOfseets;  // количество мест за столико максимально
    /**
     * TODO
     * is будет в геттере, поэтому булеан поля лучше называть без is
     */
    private boolean isReserved;

    /**
     * TODO
     * Почему это стринг, а не связка с персоналом?
     */
    private String fixedWaiter; // официант может быть закрепленн за столиком

    /**
     * TODO
     * где геттеры и сеттеры?
     */
}
