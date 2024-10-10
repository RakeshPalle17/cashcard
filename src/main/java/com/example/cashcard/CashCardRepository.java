package com.example.cashcard;

import org.springframework.data.repository.CrudRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

interface CashCardRepository extends CrudRepository<CashCard, Long> {

}
