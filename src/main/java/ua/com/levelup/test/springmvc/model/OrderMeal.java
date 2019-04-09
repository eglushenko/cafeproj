package ua.com.levelup.test.springmvc.model;

import ua.com.levelup.test.springmvc.enums.StatusOfMealEnum;

import javax.persistence.*;

@Entity
@Table (name = "order_meal")
public class OrderMeal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn (name="id")
    private Order order;
    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn (name="id")
    private Meal meal;
    private int quantity;
    @Enumerated(EnumType.STRING)
    private StatusOfMealEnum statusOfMeal;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public StatusOfMealEnum getStatusOfMeal() {
        return statusOfMeal;
    }

    public void setStatusOfMeal(StatusOfMealEnum statusOfMeal) {
        this.statusOfMeal = statusOfMeal;
    }
}
