package com.example.bank_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAppApplication.class, args);

        Account myacc = new Account("12345", 0, "MyAcc", "myacc@gmail.com", "0737484282");

        myacc.setBalance(1000000);
        myacc.DepositedMoney(1000000);
        myacc.WithdrawMoney(2000000);

    }
}
