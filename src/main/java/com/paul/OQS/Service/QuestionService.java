package com.paul.OQS.Service;

import com.paul.OQS.Model.Questions;

import java.util.Optional;

public interface QuestionService {
    Questions createQuestion(Questions questions);
    Optional<Questions> findQuestionById(Long questionId);
    Iterable<Questions> getAllQuestion();
    Iterable<Questions> findAllQuestionByName(String question);
    void deleteQuestionById(Long questionId);

}
