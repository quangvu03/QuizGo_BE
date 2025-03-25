package com.example.enties;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;
@Serdeable

@Entity
@Table(name = "users", catalog = "")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    
    @Column(name = "userName", nullable = true, length = 50)
    private String userName;
    
    @Column(name = "password", nullable = true, length = 255)
    private String password;
    
    @Column(name = "fullName", nullable = true, length = 100)
    private String fullName;
    
    @Column(name = "status", nullable = true)
    private Byte status;
    
    @Column(name = "email", nullable = true, length = 100)
    private String email;
    
    @Column(name = "dateOfBirth", nullable = true)
    private Date dateOfBirth;
    
    @Column(name = "phone", nullable = true, length = 15)
    private String phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return id == that.id && Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && Objects.equals(fullName, that.fullName) && Objects.equals(status, that.status) && Objects.equals(email, that.email) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, password, fullName, status, email, dateOfBirth, phone);
    }
}
