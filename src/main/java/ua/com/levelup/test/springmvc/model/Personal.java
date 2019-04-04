package ua.com.levelup.test.springmvc.model;

import ua.com.levelup.test.springmvc.validation.Phone;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="personal")
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_personal;
    @NotNull
    private String firstName;
    private String lastName;
    private String patronymic;
    /**
     * TODO
     * Зачем разделять серию и номер паспорта в базе?
     */
    private String numberOfPassport;
    @NotNull
    private String address;
    @Phone
    @NotNull
    private String phoneNumber;

    /**
     * TODO
     * Не стоит игнорировать использование @JoinColumn
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "doc_id")
    private List<Doc> docs = new ArrayList<Doc>();

    /**
     * TODO
     * Где связка с юзером??
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
    public Personal(){}

    public Personal(String firstName, String lastName, String patronymic, String numberOfPassport, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.numberOfPassport = numberOfPassport;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public long getId_personal() {
        return id_personal;
    }

    public void setId_personal(long id_personal) {
        this.id_personal = id_personal;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNumberOfPassport() {
        return numberOfPassport;
    }

    public void setNumberOfPassport(String numberOfPassport) {
        this.numberOfPassport = numberOfPassport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Doc> getDocs() {
        return docs;
    }

    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
