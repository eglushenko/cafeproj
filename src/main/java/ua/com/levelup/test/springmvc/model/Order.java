package ua.com.levelup.test.springmvc.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * TODO
     * Переделать типы дат и времени в соответствии с правилами Java 8
     * не вижу смысла держать для этого 2 разных поля
     * Имеет смысл сделать это поле автозаполняемым (почитайте, как делаются поля по типу created и last_update)
     */
    @Column
    @CreationTimestamp
    private LocalDateTime createDateTime;


    /**
     * TODO
     * Не стоит игнорировать использование @JoinColumn
     * Напоминаю, про необходимость таблицы OrderMeal, где должно быть как минимум кол-во блюд
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "meal_id")
    private List<Meal> meals = new ArrayList<>();
    private String statusOfOrder;  // enum (open,close)

    private int numberOfTable;  // номер столика
    @OneToOne
    @JoinColumn(name = "personal_id")
    private Personal personal;// имя фамилия Users кто оформляет заказ

    /**
     * TODO
     * где геттеры и сеттеры?
     */
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

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public String getStatusOfOrder() {
        return statusOfOrder;
    }

    public void setStatusOfOrder(String statusOfOrder) {
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
