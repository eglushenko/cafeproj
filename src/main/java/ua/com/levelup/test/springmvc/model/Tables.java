package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;

import javax.persistence.Table;

@Entity
@Table(name = "table")
/**
 * TODO
 * За опечатки бьют...
 */
public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name; // номер столика или его название
    /**
     * TODO
     * опечатка
     * И вообще лучше его назвать что-то вроде maxGuests
     */
    private int maxGuests;  // количество мест за столико максимально
    /**
     * TODO
     * is будет в геттере, поэтому булеан поля лучше называть без is
     */
    private boolean reserved;

    /**
     * TODO
     * Почему это стринг, а не связка с персоналом?
     */
    @OneToOne
    @JoinColumn(name = "personal_id")
    private Personal personal; // официант может быть закрепленн за столиком

    /**
     * TODO
     * где геттеры и сеттеры?
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
