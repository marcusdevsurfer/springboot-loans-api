package com.markdev.springboot_loans_api.controller;

import com.markdev.springboot_loans_api.dto.LoanDto;
import com.markdev.springboot_loans_api.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;


    // Endpoint to create a loan
     @PostMapping("/create")
     public String createLoan(@RequestBody LoanDto loanDto) {
          return loanService.createLoan(loanDto);
     }
}
