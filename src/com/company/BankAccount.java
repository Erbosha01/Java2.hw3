package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        amount = sum;
        return amount;
    }

    public double withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("недостаточно средств", amount);
        } else {
            amount -= sum;
            return amount;
        }
    }
}
