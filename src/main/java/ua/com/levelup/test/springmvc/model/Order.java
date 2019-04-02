package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
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
    @NotNull
    private String dateOfOrder;
    @NotNull
    private String timeOfOrder;
    /**
     * TODO
     * Не стоит игнорировать использование @JoinColumn
     * Напоминаю, про необходимость таблицы OrderMeal, где должно быть как минимум кол-во блюд
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Meal> meals = new ArrayList<>();
    private String status;  // enum
    /**
     * TODO
     * думаю целесообразней, чтоб номер был числом
     */
    private String numberOfTable;  // номер столика
    /**
     * TODO
     * Почему это стринг, а не связка с персоналом?
     */
    private String waiter; // имя фамилия Users кто оформляет заказ

    /**
     * TODO
     * где геттеры и сеттеры?
     */
}
