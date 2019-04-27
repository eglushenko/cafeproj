package ua.com.levelup.cafeproj.model;

import javax.persistence.*;

import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "tables")

public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name; // номер столика или его название

    private int maxGuests;  // количество мест за столико максимально

    @OneToMany(mappedBy = "tables")

    private Set<BookingOfTables> bookingOfTablesSet;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "orders_tables",
            joinColumns = @JoinColumn(name = "tables_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private Set<Order> orders;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_id")
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

    public Set<BookingOfTables> getBookingOfTablesSet()
    {
        return bookingOfTablesSet;
    }

    public void setBookingOfTablesSet(Set<BookingOfTables> bookingOfTablesSet)
    {
        this.bookingOfTablesSet = bookingOfTablesSet;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
