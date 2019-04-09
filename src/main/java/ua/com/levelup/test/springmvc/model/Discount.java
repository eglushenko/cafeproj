package ua.com.levelup.test.springmvc.model;

import org.hibernate.annotations.CreationTimestamp;
import ua.com.levelup.test.springmvc.enums.DiscountTypeEnum;
import ua.com.levelup.test.springmvc.validation.Phone;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String numberOfDiscount;
    @Enumerated(EnumType.STRING)
    private DiscountTypeEnum discountType;
    private String clientFirstName;

    private String clientLastName;
    private String clientPatronim;
    private double amountOfDiscount;
    @Phone
    @NotNull
    private String clientPhoneNumber;
    private boolean enabled;
    @NotNull
    @Column
    @CreationTimestamp
    private LocalDate dateOfRegister = LocalDate.now();
    @Column
    private Date endDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumberOfDiscount() {
        return numberOfDiscount;
    }

    public void setNumberOfDiscount(String numberOfDiscount) {
        this.numberOfDiscount = numberOfDiscount;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }


    public String getClientPatronim() {
        return clientPatronim;
    }

    public void setClientPatronim(String clientPatronim) {
        this.clientPatronim = clientPatronim;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public DiscountTypeEnum getDiscountType() {
        return discountType;
    }

    public void setDiscountType(DiscountTypeEnum discountType) {
        this.discountType = discountType;
    }

    public double getAmountOfDiscount() {
        return amountOfDiscount;
    }

    public void setAmountOfDiscount(int amountOfDiscount) {
        this.amountOfDiscount = amountOfDiscount;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public void setAmountOfDiscount(double amountOfDiscount) {
        this.amountOfDiscount = amountOfDiscount;
    }

    public LocalDate getDateOfRegister() {
        return dateOfRegister;
    }

    public void setDateOfRegister(LocalDate dateOfRegister) {
        this.dateOfRegister = dateOfRegister;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
