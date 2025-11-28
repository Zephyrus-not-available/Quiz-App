package com.telusko.quizapp.service;

import com.telusko.quizapp.Quiz;
import com.telusko.quizapp.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;

    public List<Quiz> getAllQuestion() {
        return quizDao.findAll();
    }
}
