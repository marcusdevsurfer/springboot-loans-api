package com.markdev.springboot_loans_api.service;

import com.markdev.springboot_loans_api.collection.Loan;
import com.markdev.springboot_loans_api.dto.LoanDto;
import org.springframework.stereotype.Service;


public interface LoanService {
    String createLoan(LoanDto loanDto);
}
