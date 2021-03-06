package ua.com.levelup.cafeproj.model;

import org.hibernate.annotations.CreationTimestamp;
import ua.com.levelup.cafeproj.enums.StatusOfOrder;

import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @CreationTimestamp
    private LocalDateTime createDateTime = LocalDateTime.now();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_dish_id" )
    private List<OrderDishes> dishes = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private StatusOfOrder statusOfOrder;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "orders_tables",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "tables_id"))
    private Set<Tables> tables;

    @OneToOne
    @JoinColumn(name = "cash_operations_id")
    private CashDesk cashDesk;

    @OneToOne(mappedBy = "order")
    private Delivery delivery;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_id")
    private Personal personal;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public List<OrderDishes> getDishes() {
        return dishes;
    }

    public void setDishes(List<OrderDishes> dishes) {
        this.dishes = dishes;
    }

    public StatusOfOrder getStatusOfOrder() {
        return statusOfOrder;
    }

    public void setStatusOfOrder(StatusOfOrder statusOfOrder) {
        this.statusOfOrder = statusOfOrder;
    }

    public Set<Tables> getTables() {
        return tables;
    }

    public void setTables(Set<Tables> tables) {
        this.tables = tables;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public CashDesk getCashDesk() {
        return cashDesk;
    }

    public void setCashDesk(CashDesk cashDesk) {
        this.cashDesk = cashDesk;
    }

}
