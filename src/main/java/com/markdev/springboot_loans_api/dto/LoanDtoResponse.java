package com.markdev.springboot_loans_api.dto;

import com.markdev.springboot_loans_api.collection.Person;

public class LoanDtoResponse {
    private String id;
    private Person person;
    private Integer amount;
    private String status;
    private Integer interestRate;
    private String createdAt;

    public LoanDtoResponse() {
    }
    public LoanDtoResponse(String id, Person person, Integer amount, String status, Integer interestRate, String createdAt) {
        this.id = id;
        this.person = person;
        this.amount = amount;
        this.status = status;
        this.interestRate = interestRate;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "LoanDtoResponse{" +
                "id='" + id + '\'' +
                ", person=" + person +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", interestRate=" + interestRate +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
