package com.markdev.springboot_loans_api.repository;

import com.markdev.springboot_loans_api.collection.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanRepository extends MongoRepository<Loan, String> {
}
