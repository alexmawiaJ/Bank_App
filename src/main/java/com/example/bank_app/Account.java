package com.example.bank_app;

public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    //Constructor
    public Account(String number, double balance, String name, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Methods to do the banking
    public void DepositedMoney(double depositedMoney){
        this.balance += depositedMoney;
        System.out.println("Succeful Deposit New Balance:" + this.balance);
    }

    public void WithdrawMoney(double withdrawMoney){
        if (this.balance - withdrawMoney <0){
            System.out.println("Withdrawal unsuccessful " + balance + " Is available balance");
        }else {
            this.balance -=withdrawMoney;
            System.out.println("Withdrawal Succefull" + "\nCurrent Balance is" + balance);
        }

    }
// Getter and setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
