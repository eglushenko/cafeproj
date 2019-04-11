package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;

import javax.persistence.Table;

@Entity
@Table(name = "tables")

public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name; // номер столика или его название

    private int maxGuests;  // количество мест за столико максимально

    //TODO поле некорректное - резервация столика может относиться только к определенному пероду времени, т.е. напрашивается новая сущность - Брони
    private boolean reserved;


    @OneToOne
    @JoinColumn(name = "id")//TODO
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
