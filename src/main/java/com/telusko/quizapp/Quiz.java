package com.telusko.quizapp;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
// Remove 'import jdk.jfr.DataAmount;' if it's still there

@Entity
@Table(name = "question")
@Data
@NoArgsConstructor
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Use @Column for fields where the Java name differs from the DB name (snake_case)
    @Column(name = "question_title")
    private String questionTitle;

    private String option1;
    private String option2;
    private String option3;
    private String option4;

    @Column(name = "right_answer")
    private String rightAnswer;

    // THIS IS THE CRITICAL FIX: Explicitly map 'difficultylevel' to 'difficulty_level'
    @Column(name = "difficulty_level")
    private String difficultylevel;

    private String category;
}