package com.markdev.springboot_loans_api.service;

import com.markdev.springboot_loans_api.dto.LoanDto;
import com.markdev.springboot_loans_api.dto.LoanDtoResponse;


public interface LoanService {
    String createLoan(LoanDto loanDto);
    LoanDtoResponse getLoanById(String id);
}
