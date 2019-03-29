package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;

@Entity
@Table(name = "peremissions")
public class Premissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private boolean addUser;
    private boolean addMeal;
    private boolean addPersonal;
    private boolean addIngridient;
    private boolean deleteUser;
    private boolean deleteMeal;
    private boolean deletePersonal;
    private boolean deleteIngridient;





}
