package com.thoughtworks.iwp.Money;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Money implements Comparable{
    double value;
    String currency;

    public Money() {
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getValue() {
       return value;
    }

    public String getCurrency() {
        return currency;
    }

    public int getLengthCurrency() throws MoneyException {
           int a=5;
           String value="abc";
        try {
            Integer.parseInt(value);
            System.out.println(a/0);
            return currency.length();
        }

        catch (NullPointerException e) {
            System.out.println(e.toString());
            throw new MoneyException();
        }
        catch (ArithmeticException e) {
            System.out.println(e.toString());
            throw new MoneyException();
        }
        catch (Exception e) {
            System.out.println(e.toString());
            throw new RuntimeException();
        }

    }

    public Money(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Double.compare(money.value, value) == 0 &&
                Objects.equals(currency, money.currency);
    }

    @Override
    public int compareTo(Object o) {
        Money money = (Money) o;
        return Double.compare(money.value, value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value, currency);
    }

    public boolean hashEquals(Money money) {
        return this.hashCode() == money.hashCode();
    }
}
