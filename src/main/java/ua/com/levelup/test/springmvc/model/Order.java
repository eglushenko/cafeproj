package ua.com.levelup.test.springmvc.model;

import org.hibernate.annotations.CreationTimestamp;
import ua.com.levelup.test.springmvc.enums.StatusOfOrderEnum;

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
    @JoinColumn(name = "id")//TODO и опять ошибка с именем столбца. И почему вдруг в Ордере Диши, а не ОрдерДиши?
    private List<Dish> dishes = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private StatusOfOrderEnum statusOfOrder;

    private int numberOfTable;  // номер столика

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Personal personal;// имя фамилия Users кто оформляет заказ

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

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public StatusOfOrderEnum getStatusOfOrder() {
        return statusOfOrder;
    }

    public void setStatusOfOrder(StatusOfOrderEnum statusOfOrder) {
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
