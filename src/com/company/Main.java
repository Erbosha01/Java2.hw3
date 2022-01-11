package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        boolean isFinished = true;
        while (isFinished) {
            try {
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());
            } catch (LimitException le) {
                System.out.println(le.getMessage());
                try {
                    bankAccount.withDraw(6000);
                }catch (LimitException e) {
                    double newBankAccount = bankAccount.getAmount();
                    newBankAccount -= bankAccount.getAmount();
                    System.out.println("Ваш счет: " + newBankAccount);
                }
                isFinished = false;
            }
        }
    }
}
