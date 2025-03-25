package com.example.dtos;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "user", catalog = "")
public class loginRequest {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "password", nullable = true, length = 255)
    private String password;
    @Basic
    @Column(name = "fullName", nullable = true, length = 100)
    private String fullName;
    @Basic
    @Column(name = "email", nullable = true, length = 100)
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        loginRequest that = (loginRequest) o;
        return id == that.id && Objects.equals(password, that.password) && Objects.equals(fullName, that.fullName) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, fullName, email);
    }
}
