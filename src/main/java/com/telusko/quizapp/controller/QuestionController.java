package com.telusko.quizapp.controller;
import java.util.List; // For the List interface itself

import com.telusko.quizapp.Quiz;
import com.telusko.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    QuizService quizService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Quiz>> getAllQuestion(){
        return quizService.getAllQuestion();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Quiz>> getQuestionByCategory(@PathVariable String category){
        return quizService.getQuestionByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Quiz quiz){
        return quizService.addQuestion(quiz);
    }


}
