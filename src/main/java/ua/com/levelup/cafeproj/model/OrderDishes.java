package ua.com.levelup.cafeproj.model;

import ua.com.levelup.cafeproj.enums.StatusOfDish;

import javax.persistence.*;
@Entity
@Table (name = "order_dish")
public class OrderDishes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dish_id")
    private Dish dish;

    private String nameOfTable;

    private int quantity;

    @Enumerated(EnumType.STRING)
    private StatusOfDish statusOfMeal;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getNameOfTable() {
        return nameOfTable;
    }

    public void setNameOfTable(String nameOfTable) {
        this.nameOfTable = nameOfTable;
    }
}
