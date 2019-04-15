package ua.com.levelup.cafeproj.model;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dish")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="dish_id")
    private List<DishIngridient> dishIngridientList = new ArrayList<>();

    private double ingrigientTotalWeight;

    private double cost;                                                                                                // сумма указаная пользователем

    private int preparationTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DishIngridient> getDishIngridientList() {
        return dishIngridientList;
    }

    public void setDishIngridientList(List<DishIngridient> dishIngridientList) {
        this.dishIngridientList = dishIngridientList;
    }

    public double getIngrigientWeight() {
        return ingrigientTotalWeight;
    }

    public void setIngrigientWeight(double ingrigientWeight) {
        this.ingrigientTotalWeight = ingrigientWeight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public double getIngrigientTotalWeight() {
        return ingrigientTotalWeight;
    }

    public void setIngrigientTotalWeight(double ingrigientTotalWeight) {
        this.ingrigientTotalWeight = ingrigientTotalWeight;
    }

}
