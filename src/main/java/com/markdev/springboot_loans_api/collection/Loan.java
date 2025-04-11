package com.markdev.springboot_loans_api.collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Document(collection = "Loans")
public class Loan {
    @Id
    private String id;
    private String personId;
    private Integer amount;
    private String status;
    private Integer interestRate;
    private LocalDateTime createdAt;

    public Loan(String id, String personId, Integer amount, String status, Integer interestRate, LocalDateTime createdAt) {
        this.id = id;
        this.personId = personId;
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
    public String getPersonId() {
        return personId;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
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
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
