package com.paul.OQS.Repository;

import com.paul.OQS.Model.Questions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends CrudRepository<Questions, Long> {

    Iterable<Questions> findAllQuestionsByName(String question);
}
