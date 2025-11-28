package com.telusko.quizapp.dao;

import com.telusko.quizapp.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer> {
    List<Quiz> findByCategory(String category);
}
