package ua.com.levelup.test.springmvc.model;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "cash_operations")
public class CashDesk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String typeOfDocument; // Enum


    /**
     * TODO
     * Переделать типы дат и времени в соответствии с правилами Java 8
     * Атрибуты принято начинать с маленькой буквы!
     * не вижу смысла держать для этого 2 разных поля
     * Имеет смысл сделать это поле автозаполняемым (почитайте, как делаются поля по типу created и last_update)
     */
    private String dateOfDocument;
    private String timeOfDocument;
    private String destantionDocument; // номер заказа если выбрана оплата в типе документа
    private double sum;
    /**
     * TODO
     * Почему это стринг, а не связка с юзером? Точнее не с юзером, а с персоналом
     */
    private String user;
    private String userOfDestantion; // если служебная выдача или внесение указать юзера

    /**
     * TODO
     * где геттеры и сеттеры?
     */
}
