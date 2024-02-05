package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {

    }

    // Criando o construtor
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public java.lang.Integer getNumber() {
        return number;
    }

    public void setNumber(java.lang.Integer number) {
        this.number = number;
    }

    public java.lang.String getHolder() {
        return holder;
    }

    public void setHolder(java.lang.String holder) {
        this.holder = holder;
    }

    public java.lang.Double getBalance() {
        return balance;
    }

    public void setBalance(java.lang.Double balance) {
        this.balance = balance;
    }

    public java.lang.Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(java.lang.Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
