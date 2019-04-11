package ua.com.levelup.cafeproj.model;

import org.hibernate.annotations.CreationTimestamp;
import ua.com.levelup.cafeproj.enums.TypeOfDocument;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "cash_operations")
public class CashDesk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private TypeOfDocument typeOfDocument;

    @Column
    @CreationTimestamp
    private LocalDateTime dateTimeCreation;

    private String destantionDocument;

    private double sum;
    /**
     * TODO
     * в @JoinColumn указывается имя столбца в таблице CashDesk, куда будет помещен ид Персонала.
     * Т.е. это НИКАК не может быть поле с первичным ключом
     * Почитайте про аннотацию @PrimaryKeyJoinColumn - возможно подразумевалось это
     */
    @OneToOne
    @JoinColumn(name = "id")
    private Personal personal;

    private String userOfDestantion;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TypeOfDocument getTypeOfDocument() {
        return typeOfDocument;
    }

    public void setTypeOfDocument(TypeOfDocument typeOfDocument) {
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
