package com.thoughtworks.iwp.cash;
class Wallet {
    private double money;

    Wallet(double money) {
        this.money = money;
    }

    boolean credit(double increment) {
        if(increment >= 0) {
            money += increment;
            return true;
        }
        else {
            return false;
        }
    }

    boolean decreaseMoney(double decrement) {
        if(decrement <= money) {
            money -= decrement;
            return true;
        }
        else {
            return false;
        }
    }
}
