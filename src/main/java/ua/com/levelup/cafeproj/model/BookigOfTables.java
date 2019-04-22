package ua.com.levelup.cafeproj.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking_of_tables")
public class BookigOfTables {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Tables tables;

    private boolean reserved = true;

    private LocalDateTime timeStartReserved;

    private String firstNameGuest;

    private String lastNameGuest;

    private  String phoneNumberGuest;

    private int quantityGusts;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Tables getTables() {
        return tables;
    }

    public void setTables(Tables tables) {
        this.tables = tables;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public LocalDateTime getTimeStartReserved() {
        return timeStartReserved;
    }

    public void setTimeStartReserved(LocalDateTime timeStartReserved) {
        this.timeStartReserved = timeStartReserved;
    }

    public String getFirstNameGuest() {
        return firstNameGuest;
    }

    public void setFirstNameGuest(String firstNameGuest) {
        this.firstNameGuest = firstNameGuest;
    }

    public String getLastNameGuest() {
        return lastNameGuest;
    }

    public void setLastNameGuest(String lastNameGuest) {
        this.lastNameGuest = lastNameGuest;
    }

    public String getPhoneNumberGuest() {
        return phoneNumberGuest;
    }

    public void setPhoneNumberGuest(String phoneNumberGuest) {
        this.phoneNumberGuest = phoneNumberGuest;
    }

    public int getQuantityGusts() {
        return quantityGusts;
    }

    public void setQuantityGusts(int quantityGusts) {
        this.quantityGusts = quantityGusts;
    }
}
