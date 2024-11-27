package com.feldmann.architeture_practice.application.core.domain;

import java.util.List;

public class User {

    private Long id;

    private String name;

    private String surname;

    private List<Loan> loanList;

    public User() {
    }

    public User(String name, String surname, List<Loan> loanList) {
        this.name = name;
        this.surname = surname;
        this.loanList = loanList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }

}
