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
@Table(name = "Questions")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Question",nullable = false)
    private String text;
//    @OneToMany(mappedBy = "questions",
//            orphanRemoval = true,
//            fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//    private List<Answer> answer;
    
}
