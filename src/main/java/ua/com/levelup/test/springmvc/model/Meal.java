package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "meal")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Ingridient> ingridients = new ArrayList<Ingridient>();
    private double ingrigientTotalWeight;
    private double procentOfTax;
    private double cost;// Имеет ли смысл хранить сумму сгенерированую единожды из ингридиентов и наценки и пересчет по запросу
    private double preparationTime;
    private String ststusOfMeal; // Статус блюда Enum ( новое, готовится, готовое, выдано )

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

    public double getProcentOfTax() {
        return procentOfTax;
    }

    public void setProcentOfTax(double procentOfTax) {
        this.procentOfTax = procentOfTax;
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

    public void setPreparationTime(double preparationTime) {
        this.preparationTime = preparationTime;
    }

    public double getIngrigientTotalWeight() {
        return ingrigientTotalWeight;
    }

    public void setIngrigientTotalWeight(double ingrigientTotalWeight) {
        this.ingrigientTotalWeight = ingrigientTotalWeight;
    }

    public String getStstusOfMeal() {
        return ststusOfMeal;
    }

    public void setStstusOfMeal(String ststusOfMeal) {
        this.ststusOfMeal = ststusOfMeal;
    }
}
