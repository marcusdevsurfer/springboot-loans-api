package com.markdev.springboot_loans_api.service.impl;

import com.markdev.springboot_loans_api.collection.Loan;
import com.markdev.springboot_loans_api.collection.Person;
import com.markdev.springboot_loans_api.dto.LoanDto;
import com.markdev.springboot_loans_api.dto.LoanDtoResponse;
import com.markdev.springboot_loans_api.repository.LoanRepository;
import com.markdev.springboot_loans_api.repository.PersonRepository;
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
    private LoanRepository loanRepository;
    @Autowired
    private PersonRepository personRepository;

    @Override
    public String createLoan(LoanDto loanDto) {
        if(loanDto.getPersonId().isEmpty()) {
            throw new RuntimeException("Person ID cannot be empty");
        }
        personRepository.findById(loanDto.getPersonId()).orElseThrow(() -> new RuntimeException("Person not found"));
        Loan loan = modelMapper.map(loanDto, Loan.class);
        LocalDateTime createdAt = LocalDateTime.now();
        loan.setId(null);
        loan.setStatus("PENDING");
        loan.setCreatedAt(createdAt);
        Loan loanSaved = loanRepository.save(loan);
        return "Loan created successfully with ID: " + loanSaved.getId();
    }

    @Override
    public LoanDtoResponse getLoanById(String id) {
        Loan loan = loanRepository.findById(id).orElseThrow(() -> new RuntimeException("Loan not found"));
        Person person = personRepository.findById(loan.getPersonId()).orElseThrow(() -> new RuntimeException("Person not found"));
        LoanDtoResponse loanDtoResponse = modelMapper.map(loan, LoanDtoResponse.class);
        loanDtoResponse.setPerson(person);
        return loanDtoResponse;
    }

    @Override
    public String deleteLoanById(String id) {
        Loan loan = loanRepository.findById(id).orElseThrow(() -> new RuntimeException("Loan not found"));
        loanRepository.delete(loan);
        return "Loan deleted successfully";
    }
}
