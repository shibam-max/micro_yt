package com.question.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.entities.Question;

@Service
public interface QuestionService {

    Question create(Question question);

    List<Question> get();

    Question getOne(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);
    
    
} 
