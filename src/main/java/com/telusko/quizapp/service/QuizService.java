package com.telusko.quizapp.service;

import com.telusko.quizapp.Quiz;
import com.telusko.quizapp.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.lang.reflect.ReflectPermission;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;

    public ResponseEntity<List<Quiz>> getAllQuestion() {
        try {
            return new ResponseEntity<>(quizDao.findAll(),HttpStatus.OK) ;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST) ;

    }

    public ResponseEntity<List<Quiz>> getQuestionByCategory(String category) {

        try {
            return new ResponseEntity<>(quizDao.findByCategory(category),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST) ;
    }

    public ResponseEntity<String> addQuestion(Quiz quiz) {
        quizDao.save(quiz);
        return new ResponseEntity<>("success",HttpStatus.CREATED);
    }
}
