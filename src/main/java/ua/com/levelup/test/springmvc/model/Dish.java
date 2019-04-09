package ua.com.levelup.test.springmvc.model;

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
    @JoinColumn(name ="id")
    private List<Ingridient> ingridients = new ArrayList<Ingridient>();

    private double ingrigientTotalWeight;
    /**
     * TODO
     * Не думаю что это поле целесообразно
     * Рекомендованных процент навара имеет смысл держать единый в программе,
     * а уже интерфейс будет рекомендовать не ниже какой стоимости ставить
     *
     * Возможно использовать другой процент наценки на блюдо if null get standartTax.
     */



    private double cost;// сумма указаная пользователем
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

    public List<Ingridient> getIngridients() {
        return ingridients;
    }

    public void setIngridients(List<Ingridient> ingridients) {
        this.ingridients = ingridients;
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
