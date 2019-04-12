package ua.com.levelup.cafeproj.model;

import org.hibernate.annotations.CreationTimestamp;
import ua.com.levelup.cafeproj.enums.StatusOfOrder;

import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    @JoinColumn(name = "order_dish_id" )//TODO и опять ошибка с именем столбца. И почему вдруг в Ордере Диши, а не ОрдерДиши?
    private List<OrderDishes> dishes = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private StatusOfOrder statusOfOrder;

    private int numberOfTable;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
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

    public int getNumberOfTable() {
        return numberOfTable;
    }

    public void setNumberOfTable(int numberOfTable) {
        this.numberOfTable = numberOfTable;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

}
