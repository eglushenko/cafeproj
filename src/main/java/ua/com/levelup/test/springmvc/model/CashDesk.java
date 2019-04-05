package ua.com.levelup.test.springmvc.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
    @Column
    @CreationTimestamp
    private LocalDateTime dateTimeCreation = LocalDateTime.now();
    private String destantionDocument; // номер заказа если выбрана оплата в типе документа
    private double sum;
    /**
     * TODO
     * Почему это стринг, а не связка с юзером? Точнее не с юзером, а с персоналом
     */
    @OneToOne
    @JoinColumn(name = "id")
    private Personal personal;
    private String userOfDestantion; // если служебная выдача или внесение указать юзера


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeOfDocument() {
        return typeOfDocument;
    }

    public void setTypeOfDocument(String typeOfDocument) {
        this.typeOfDocument = typeOfDocument;
    }

    public LocalDateTime getDateTimeCreation() {
        return dateTimeCreation;
    }

    public void setDateTimeCreation(LocalDateTime dateTimeCreation) {
        this.dateTimeCreation = dateTimeCreation;
    }

    public String getDestantionDocument() {
        return destantionDocument;
    }

    public void setDestantionDocument(String destantionDocument) {
        this.destantionDocument = destantionDocument;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public String getUserOfDestantion() {
        return userOfDestantion;
    }

    public void setUserOfDestantion(String userOfDestantion) {
        this.userOfDestantion = userOfDestantion;
    }
}
