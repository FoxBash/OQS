package com.paul.OQS.Controller;

import com.paul.OQS.Model.Questions;
import com.paul.OQS.Service.QuestionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/question/v1")

public class QuestionController {
    private final QuestionImpl question;
    @Autowired
    public QuestionController(QuestionImpl question) {
        this.question = question;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)

    public void createQuestion(@RequestBody Questions questions){
        question.createQuestion(questions);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Questions> getQuestions(){
        return question.getAllQuestion();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Questions> getQuestionById(@PathVariable("id") Long id){
        return question.findQuestionById(id);
    }
    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Questions> getAllQuestionByName(@PathVariable("name") String name){
        return question.findAllQuestionByName(name);
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Questions editQuestionById(@PathVariable("id") Long id){
        Optional<Questions> questionsOptional = question.findQuestionById(id);
        if (questionsOptional.isPresent()){
            Questions questions = questionsOptional.get();
            return question.createQuestion(questions);
        }
        return null;
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteQuestionById(@PathVariable("id") Long id){
        question.deleteQuestionById(id);
    }

}
