package ua.com.levelup.cafeproj.model;

import org.hibernate.annotations.CreationTimestamp;
import ua.com.levelup.cafeproj.enums.DiscountType;
import ua.com.levelup.cafeproj.validation.Phone;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<CashDesk> cashDesk;

    @NotNull
    private String numberOfDiscount;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

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
    private LocalDate dateOfRegister;

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

    public DiscountType getDiscountType() {
        return discountType;
    }

    public void setDiscountType(DiscountType discountType) {
        this.discountType = discountType;
    }

    public double getAmountOfDiscount() {
        return amountOfDiscount;
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

    public Set<CashDesk> getCashDesk() {
        return cashDesk;
    }

    public void setCashDesk(Set<CashDesk> cashDesk) {
        this.cashDesk = cashDesk;
    }

}
