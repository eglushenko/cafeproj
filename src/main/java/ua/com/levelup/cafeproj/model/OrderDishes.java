package ua.com.levelup.cafeproj.model;

import ua.com.levelup.cafeproj.enums.StatusOfDish;

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
    private StatusOfDish statusOfMeal;

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

    public StatusOfDish getStatusOfMeal() {
        return statusOfMeal;
    }

    public void setStatusOfMeal(StatusOfDish statusOfMeal) {
        this.statusOfMeal = statusOfMeal;
    }
}
