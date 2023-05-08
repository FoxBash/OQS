package com.paul.OQS.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Account")
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "Email",nullable = false,unique = true)
    private String email;
    @Column(name = "Password",nullable = false)
    private String password;
    @Column(name = "Telephone",nullable = false)
    private String telephone;
    @Column(name = "Address")
    private String address;
    @Column(name = "Score")
    private int score = 0;


    public Account(String firstName, String lastName, String email, String password, String telephone, String address, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.address = address;
        this.score = score;
    }
}
