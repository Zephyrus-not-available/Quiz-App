package com.telusko.quizapp;

import jakarta.persistence.*;
import lombok.Data; // <-- Import Lombok Data annotation
import jdk.jfr.DataAmount;

import java.security.SecureRandom;

@Entity
@Table(name = "question")
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String rightAnswer;
    private String difficultylevel;
}
