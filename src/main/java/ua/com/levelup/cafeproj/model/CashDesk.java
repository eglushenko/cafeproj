package ua.com.levelup.cafeproj.model;

import org.hibernate.annotations.CreationTimestamp;
import ua.com.levelup.cafeproj.enums.TypeOfDocument;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "cash_operations")
public class CashDesk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private TypeOfDocument typeOfDocument;

    @OneToOne(mappedBy = "cashDesk")
    private Order order;


    @Column
    @CreationTimestamp
    private LocalDateTime dateTimeCreation;

    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "disconts_id")
    private Discount discount;

    private double sum;

    @OneToOne
    @JoinColumn(name = "personal_id")
    private Personal personal;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User userOfCollection;

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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public User getUserOfCollection() {
        return userOfCollection;
    }

    public void setUserOfCollection(User userOfCollection) {
        this.userOfCollection = userOfCollection;
    }
}
