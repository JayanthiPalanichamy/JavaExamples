package main.java.iwp.Main;

import main.java.iwp.Money.Money;
import main.java.iwp.Money.MoneyException;

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
