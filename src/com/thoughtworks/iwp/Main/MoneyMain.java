package com.thoughtworks.iwp.Main;

import com.thoughtworks.iwp.Money.Money;

public class MoneyMain {
    public static void main(String[] args) {
        Money rupee1 = new Money(1,"ruppe");
        Money ruppe2 = new Money(1,"ruppe");
        System.out.println(rupee1.hashEquals(ruppe2));
    }
}
