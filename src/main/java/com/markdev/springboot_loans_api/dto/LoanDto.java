package com.markdev.springboot_loans_api.dto;


public class LoanDto {
    private String personId;
    private Integer amount;
    private Integer interestRate;
    public LoanDto() {
    }
    public LoanDto(String personId, Integer amount, Integer interestRate) {
        this.personId = personId;
        this.amount = amount;
        this.interestRate = interestRate;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
    public String getPersonId() {
        return personId;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }
    public Integer getInterestRate() {
        return interestRate;
    }

}
