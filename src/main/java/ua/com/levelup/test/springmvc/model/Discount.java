package ua.com.levelup.test.springmvc.model;

import ua.com.levelup.test.springmvc.validation.Phone;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String numberOfDiscount;
    private String clientFirstName;
    private String clientSecondName;
    private String clientPatronim;
    @Phone
    @NotNull
    private String clientPhoneNumber;
    private boolean enabled;
    @NotNull
    private String dateOfregister;
    private String endDate;

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

    public String getClientSecondName() {
        return clientSecondName;
    }

    public void setClientSecondName(String clientSecondName) {
        this.clientSecondName = clientSecondName;
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

    public String getDateOfregister() {
        return dateOfregister;
    }

    public void setDateOfregister(String dateOfregister) {
        this.dateOfregister = dateOfregister;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
