package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(50000);
        boolean isFinished = true;
        while (isFinished) {
            try {
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());
            } catch (LimitException le) {
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                    System.out.println("Ваш баланс: " + bankAccount.getAmount());
                }catch (LimitException e) {
                    e.getMessage();
                }
                isFinished = false;
            }
        }
    }
}
