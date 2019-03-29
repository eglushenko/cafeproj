package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String dateOfOrder;
    @NotNull
    private String timeOfOrder;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Meal> meals = new ArrayList<>();
    private String oficiant;


}
