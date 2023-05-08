package com.paul.OQS.Repository;

import com.paul.OQS.Model.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepo extends CrudRepository<Answer, Long> {
}
