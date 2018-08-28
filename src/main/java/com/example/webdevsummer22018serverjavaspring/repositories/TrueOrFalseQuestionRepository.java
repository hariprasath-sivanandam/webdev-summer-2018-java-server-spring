package com.example.webdevsummer22018serverjavaspring.repositories;
import org.springframework.data.repository.CrudRepository;

import com.example.webdevsummer22018serverjavaspring.models.TrueOrFalseExamQuestion;


public interface TrueOrFalseQuestionRepository
	extends CrudRepository<TrueOrFalseExamQuestion, Integer> {
	
}