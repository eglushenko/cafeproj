package ua.com.levelup.test.springmvc.model;

import ua.com.levelup.test.springmvc.enums.StatusOfMealEnum;

import javax.persistence.*;

@Entity
@Table (name = "order_dish")
public class OrderDishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn (name="id")
    private Order order;
    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn (name="id")
    private Dish dish;
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

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
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
