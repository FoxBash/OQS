package com.paul.OQS.Service;

import com.paul.OQS.Model.Answer;

public interface AnswerService {
    Answer createAnswer(Answer answer);
    Iterable<Answer> getAllAnswer();
    void deleteAnswers();
    void deleteAnswerById(Long answerId);

}
