package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;

import javax.persistence.Table;

@Entity
@Table(name = "table")

public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name; // номер столика или его название

    private int maxGuests;  // количество мест за столико максимально

    private boolean reserved;

    /**
     * TODO
     * Почему это стринг, а не связка с персоналом?
     */
    @OneToOne
    @JoinColumn(name = "id")
    private Personal personal; // официант может быть закрепленн за столиком


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
