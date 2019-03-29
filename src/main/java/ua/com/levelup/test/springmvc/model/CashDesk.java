package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "cash_operations")
public class CashDesk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String typeOfDocument; // Enum
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String numberOfDocument;
    private String Date;
    private String time;
    private String destantionDocument; // номер заказа если выбрана оплата в типе документа
    private double sum;
    private String user;
    private String userOfDestantion; // если служебная выдача или внесение указать юзера

}
