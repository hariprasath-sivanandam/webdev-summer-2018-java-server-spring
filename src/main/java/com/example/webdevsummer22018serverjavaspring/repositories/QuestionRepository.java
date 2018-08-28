package com.example.webdevsummer22018serverjavaspring.repositories;
import org.springframework.data.repository.CrudRepository;

import com.example.webdevsummer22018serverjavaspring.models.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

}
