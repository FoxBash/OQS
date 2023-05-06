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
    public void createAnswer(Answer answer) {
        answerRepo.save(answer);
    }

    @Override
    public Iterable<Answer> getAllAnswersByQuestionId(Long questionId) {
        Optional<Questions> optionalQuestions = questionService.findQuestionById(questionId);
        if (optionalQuestions.isPresent()){
            Questions questions = optionalQuestions.get();
            Iterable<Answer> answers = questions.getAnswer();
            return answers;
        }
        return null;
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
