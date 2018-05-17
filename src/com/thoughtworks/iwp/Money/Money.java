package com.thoughtworks.iwp.Money;

import java.util.Objects;

public class Money implements Comparable{
    double value;
    String currency;

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
}
