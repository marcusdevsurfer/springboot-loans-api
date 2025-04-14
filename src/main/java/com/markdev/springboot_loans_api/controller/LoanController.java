package com.markdev.springboot_loans_api.controller;

import com.markdev.springboot_loans_api.dto.LoanDto;
import com.markdev.springboot_loans_api.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping
    public ResponseEntity<?> getAllLoans() {
        return new ResponseEntity<>(loanService.getLoans(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getLoanById(@PathVariable String id) {
        return new ResponseEntity<>(loanService.getLoanById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public String createLoan(@RequestBody LoanDto loanDto) {
        return loanService.createLoan(loanDto);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteLoanById(@PathVariable String id) {
        return new ResponseEntity<>(loanService.deleteLoanById(id), HttpStatus.OK);
    }
}
