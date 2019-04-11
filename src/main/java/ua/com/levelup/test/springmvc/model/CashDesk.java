package ua.com.levelup.test.springmvc.model;

import org.hibernate.annotations.CreationTimestamp;
import ua.com.levelup.test.springmvc.enums.TypeOfDocumentEnum;

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
    @Enumerated(EnumType.STRING)
    private TypeOfDocumentEnum typeOfDocument;

    /**
     * TODO
     * во все поля с аннотацией @CreationTimestamp не нужна изначальная инициализация.
     * Дату создает сама аннотация.
     */
    @Column
    @CreationTimestamp
    private LocalDateTime dateTimeCreation = LocalDateTime.now();
    private String destantionDocument; // номер заказа если выбрана оплата в типе документа
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
    /**
     * TODO писать комментарии к полям правильно - но нужно делать єто вот в такой рамке, чтоб комментарий при єтом отображался к полю
     */
    private String userOfDestantion; // если служебная выдача или внесение указать юзера


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TypeOfDocumentEnum getTypeOfDocument() {
        return typeOfDocument;
    }

    public void setTypeOfDocument(TypeOfDocumentEnum typeOfDocument) {
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
