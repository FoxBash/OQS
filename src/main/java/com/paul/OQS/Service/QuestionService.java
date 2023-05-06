package com.paul.OQS.Service;

import com.paul.OQS.Model.Questions;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    void createQuestion(Questions questions);
    Optional<Questions> findQuestionById(Long questionId);
    Iterable<Questions> getAllQuestion();
    Iterable<Questions> findAllQuestionByName(String question);
    void deleteQuestionById(Long questionId);

}
