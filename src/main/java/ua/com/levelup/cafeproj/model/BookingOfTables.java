package ua.com.levelup.cafeproj.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking_of_tables")
public class BookingOfTables
{
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tables_id")
    private Tables tables;

    private boolean reserved = true;

    private LocalDateTime timeStartReserved;

    private String firstNameGuest;

    private String lastNameGuest;

    private  String phoneNumberGuest;

    private int quantityOfGuests;

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

    public int getQuantityOfGuests() {
        return quantityOfGuests;
    }

    public void setQuantityOfGuests(int quantityOfGuests) {
        this.quantityOfGuests = quantityOfGuests;
    }
}
