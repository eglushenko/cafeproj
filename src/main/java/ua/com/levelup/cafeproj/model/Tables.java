package ua.com.levelup.cafeproj.model;

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

    @OneToOne
    private BookigOfTables reserved;

    @OneToOne
    @JoinColumn(name = "personal_id")//TODO
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

    public BookigOfTables getReserved() {
        return reserved;
    }

    public void setReserved(BookigOfTables reserved) {
        this.reserved = reserved;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
