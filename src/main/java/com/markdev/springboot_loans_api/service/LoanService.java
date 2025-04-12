package com.markdev.springboot_loans_api.service;
import com.markdev.springboot_loans_api.dto.LoanDto;
import com.markdev.springboot_loans_api.dto.LoanDtoResponse;
import java.util.List;
public interface LoanService {
    String createLoan(LoanDto loanDto);
    LoanDtoResponse getLoanById(String id);
    String deleteLoanById(String id);
    List<LoanDtoResponse> getLoans();
}
