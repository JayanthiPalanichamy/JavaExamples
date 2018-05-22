package main.java.iwp.wallet;
class Wallet {
    private double money;

    Wallet(double money) throws IllegalArgumentException{
        if(money < 0) {
            throw new IllegalArgumentException();
        }
        this.money = money;
    }

    boolean add(double amount) {
        if(amount >= 0) {
            money += amount;
            return true;
        }
        else {
            return false;
        }
    }

    boolean spend(double amount) {
        if(amount <= money) {
            money -= amount;
            return true;
        }
        else {
            return false;
        }
    }
}
