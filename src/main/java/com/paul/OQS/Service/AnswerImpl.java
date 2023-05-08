package com.paul.OQS.Service;

import com.paul.OQS.Model.Answer;
import com.paul.OQS.Model.Questions;
import com.paul.OQS.Repository.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnswerImpl implements AnswerService {
    private AnswerRepo answerRepo;
    @Autowired
    public AnswerImpl(AnswerRepo answerRepo) {
        this.answerRepo = answerRepo;
    }

    @Override
    public Answer createAnswer(Answer answer) {
        answerRepo.save(answer);
        return answer;
    }

    @Override
    public Iterable<Answer> getAllAnswer() {
        Iterable<Answer> answers = answerRepo.findAll();
        return answers;
    }

    @Override
    public void deleteAnswers() {
        answerRepo.deleteAll();

    }

    @Override
    public void deleteAnswerById(Long answerId) {
        answerRepo.deleteById(answerId);
    }
}
