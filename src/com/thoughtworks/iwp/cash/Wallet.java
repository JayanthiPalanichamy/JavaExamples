package com.thoughtworks.iwp.cash;
class Wallet {
    private double money;

    Wallet(double money) {
        this.money = money;
    }

    void addMoney(double increment) {
        this.money = this.money + increment;
    }

    boolean spendMoney(double decrement) {
        if(decrement <= this.money) {
            this.money = this.money - decrement;
            return true;
        }
        else {
            return false;
        }
    }
}
