package com.paul.OQS.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Occupation")
    private String occupation;
    @Column(name = "Telephone",nullable = false)
    private String telephone;
    @Column(name = "Address")
    private String address;

    @OneToOne(mappedBy = "admin", cascade = CascadeType.ALL)
    @Column(nullable = false)
    private Account account;
    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    @JoinColumn(name = "Admin_id")
    private List<Questions> questions;
}