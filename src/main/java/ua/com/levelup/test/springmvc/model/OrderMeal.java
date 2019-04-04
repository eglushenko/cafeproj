package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;

@Entity
@Table (name = "order_meal")
public class OrderMeal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn (name="order_id")
    private Order order;
    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn (name="meal_id")
    private Meal meal;
    private int quantity;
    private String statusOfMeal; // TODO Enum

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

    public String getStatusOfMeal() {
        return statusOfMeal;
    }

    public void setStatusOfMeal(String statusOfMeal) {
        this.statusOfMeal = statusOfMeal;
    }
}
