package com.paul.OQS.Controller;

import com.paul.OQS.Model.Answer;
import com.paul.OQS.Service.AnswerImpl;
import com.paul.OQS.Service.QuestionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answer/v1")
public class AnswerController {
    private final AnswerImpl answerImpl;
    @Autowired
    public AnswerController(AnswerImpl answer) {
        this.answerImpl = answer;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Answer addAnswer(@RequestBody Answer answer){
        return answerImpl.createAnswer(answer);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Answer> getAllAnswer(){
        return answerImpl.getAllAnswer();
    }
    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteAllAnswers(){
        answerImpl.deleteAnswers();
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteAnswerById(@PathVariable("id") Long id){
        answerImpl.deleteAnswerById(id);
    }
}
