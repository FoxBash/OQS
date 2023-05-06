package com.paul.OQS.Service;

import com.paul.OQS.Model.Answer;

import java.util.List;

public interface AnswerService {
    void createAnswer(Answer answer);
    Iterable<Answer> getAllAnswersByQuestionId(Long questionId);
    Iterable<Answer> getAllAnswer();
    void deleteAnswers();
    void deleteAnswerById(Long answerId);

}
