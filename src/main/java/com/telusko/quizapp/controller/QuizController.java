package com.telusko.quizapp.controller;
import java.util.List; // For the List interface itself

import com.telusko.quizapp.Quiz;
import com.telusko.quizapp.service.QuizService;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuizController {

    @Autowired
    QuizService quizService;

    @GetMapping("allQuestions")
    public List<Quiz> getAllQuestion(){
        return quizService.getAllQuestion();
    }


}
