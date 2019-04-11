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

    /**
     * TODO
     * в @JoinColumn должен указываться столбец в таблице Ingridient, где указан dish_id.
     * Т.е. это никак не может быть поле с первичным ключом.
     * И почему связь у нас с Ингридиентом, а не с ДишИнгридиентом? Напоминаю сущность нужна для веса в том или ином блюде
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="dish_id")
    private List<Ingridient> ingridients = new ArrayList<Ingridient>();

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
