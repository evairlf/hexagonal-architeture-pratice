package com.feldmann.architeture_practice.application.core.domain;

import com.feldmann.architeture_practice.application.core.domain.enums.LoanStatus;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Loan {

    private Long id;

    private User user;

    private Book book;

    private LocalDate loanDate;

    private LoanStatus status;

    private LocalDate dueDate;

    private BigDecimal fineAmmount;

    private Integer renewals;

    public Loan() {
    }

    public Loan(Integer renewals, BigDecimal fineAmmount, LocalDate dueDate, LocalDate loanDate, Book book, User user) {
        this.renewals = renewals;
        this.fineAmmount = fineAmmount;
        this.dueDate = dueDate;
        this.loanDate = loanDate;
        this.book = book;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public BigDecimal getFineAmmount() {
        return fineAmmount;
    }

    public void setFineAmmount(BigDecimal fineAmmount) {
        this.fineAmmount = fineAmmount;
    }

    public Integer getRenewals() {
        return renewals;
    }

    public void setRenewals(Integer renewals) {
        this.renewals = renewals;
    }

    public boolean isOverdue(){
        return status == LoanStatus.ACTIVE && dueDate.isBefore(LocalDate.now());
    }

    public void calculateFine(BigDecimal dailyRate){
        if(isOverdue()){
            long daysOverdue = LocalDate.now().toEpochDay() - dueDate.toEpochDay();
            fineAmmount = dailyRate.multiply(BigDecimal.valueOf(daysOverdue));
        }
    }
}
