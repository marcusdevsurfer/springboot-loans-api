package com.markdev.springboot_loans_api.dto;


public class LoanDtoResponse {
    private String id;
    private String personId;
    private Integer amount;
    private String status;
    private Integer interestRate;
    private String createdAt;

    public LoanDtoResponse() {
    }
    public LoanDtoResponse(String id, String personId, Integer amount, String status, Integer interestRate, String createdAt) {
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
                ", personId=" + personId +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", interestRate=" + interestRate +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
