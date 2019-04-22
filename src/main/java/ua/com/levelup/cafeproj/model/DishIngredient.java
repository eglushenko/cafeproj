package ua.com.levelup.cafeproj.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "dish_ingredient")
public class DishIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double ingridientWeight;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getIngridientWeight() {
        return ingridientWeight;
    }

    public void setIngridientWeight(double ingridientWeight) {
        this.ingridientWeight = ingridientWeight;
    }

}
