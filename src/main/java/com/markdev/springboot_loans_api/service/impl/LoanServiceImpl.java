package com.markdev.springboot_loans_api.service.impl;

import com.markdev.springboot_loans_api.collection.Loan;
import com.markdev.springboot_loans_api.dto.LoanDto;
import com.markdev.springboot_loans_api.repository.LoanRepository;
import com.markdev.springboot_loans_api.service.LoanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LoanServiceImpl implements LoanService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private LoanRepository loanRepository ;
    @Override
    public String createLoan(LoanDto loanDto) {
        Loan loan = modelMapper.map(loanDto, Loan.class);
        LocalDateTime createdAt = LocalDateTime.now();
        loan.setId(null);
        loan.setStatus("PENDING");
        loan.setCreatedAt(createdAt);
        Loan loanSaved = loanRepository.save(loan);
        return "Loan created successfully with ID: " + loanSaved.getId();
    }
}
