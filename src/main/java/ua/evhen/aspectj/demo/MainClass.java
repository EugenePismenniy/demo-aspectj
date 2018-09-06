package ua.evhen.aspectj.demo;

import ua.evhen.aspectj.demo.domain.BankAccount;

public class MainClass {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setClientId(123);
        bankAccount.setExDate("1120");
        bankAccount.setPanSate("a");
        bankAccount.setPanName("Usd Debit Card");
        bankAccount.setPan("4123456789012345");
    }

}
