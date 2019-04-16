package ua.com.levelup.cafeproj.model;

import org.hibernate.annotations.UpdateTimestamp;
import ua.com.levelup.cafeproj.enums.DeliveryStatus;
import ua.com.levelup.cafeproj.validation.Phone;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private String adress;

    @Phone
    private String phoneNumber;

    private String name;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @UpdateTimestamp
    private LocalDateTime lastUpdateStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }
}
