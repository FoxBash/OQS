package com.paul.OQS.Service;

import com.paul.OQS.Model.Questions;
import com.paul.OQS.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionImpl implements QuestionService {
    private final QuestionRepo questionRepo;
    @Autowired
    public QuestionImpl(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @Override
    public Questions createQuestion(Questions questions) {
        questionRepo.save(questions);
        return questions;
    }

    @Override
    public Optional<Questions> findQuestionById(Long questionId) {
        Optional<Questions> questionsOptional = questionRepo.findById(questionId);
        if (questionsOptional.isPresent()){
            Questions questions = questionsOptional.get();
            return Optional.of(questions);
        }
        return Optional.empty();
    }

    @Override
    public Iterable<Questions> getAllQuestion() {
        return questionRepo.findAll();
    }

    @Override
    public Iterable<Questions> findAllQuestionByName(String question) {
        return questionRepo.findAllQuestionsByName(question);
    }


    @Override
    public void deleteQuestionById(Long questionId) {
        questionRepo.deleteById(questionId);
    }


}
