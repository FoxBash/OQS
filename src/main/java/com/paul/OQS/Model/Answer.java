package com.paul.OQS.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Answer")
@Data
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false,name = "Answers")
    private String text;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "Question_id")
//    private Questions questions;

    public Answer(String text) {
        this.text = text;
    }
}
