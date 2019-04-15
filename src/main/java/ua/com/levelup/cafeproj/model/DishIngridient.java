package ua.com.levelup.cafeproj.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "dish_ingridient")
public class DishIngridient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long dish_id;

    private long ingridient_id;

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

    public long getDish_id() {
        return dish_id;
    }

    public void setDish_id(long dish_id) {
        this.dish_id = dish_id;
    }

    public long getIngridient_id() {
        return ingridient_id;
    }

    public void setIngridient_id(long ingridient_id) {
        this.ingridient_id = ingridient_id;
    }
}
