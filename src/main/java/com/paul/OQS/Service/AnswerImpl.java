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
    private final QuestionService questionService;
    @Autowired
    public AnswerImpl(AnswerRepo answerRepo, QuestionService questionService) {
        this.answerRepo = answerRepo;
        this.questionService = questionService;
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
        answerRepo.deleteAnswerById();
    }
}
