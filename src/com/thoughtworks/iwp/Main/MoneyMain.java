package com.thoughtworks.iwp.Main;

import com.thoughtworks.iwp.Money.Money;
import com.thoughtworks.iwp.Money.MoneyException;

public class MoneyMain {
    public static void main(String[] args) {
        Money rupee1 = new Money(1, "ruppe");
        Money ruppe2 = new Money(1, "ruppe");
        Money ruppe3 = new Money();
        try {
            System.out.println(ruppe3.getLengthCurrency());
        }
        catch (MoneyException e) {
            System.out.println(e.toString());
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }


    }
}
