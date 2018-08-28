package com.example.webdevsummer22018serverjavaspring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.webdevsummer22018serverjavaspring.models.MultipleChoiceExamQuestion;


public interface MultipleChoicesQuestionRepository
	extends CrudRepository<MultipleChoiceExamQuestion, Integer> {
	
}