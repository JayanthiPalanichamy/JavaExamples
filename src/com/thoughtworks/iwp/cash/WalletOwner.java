package com.thoughtworks.iwp.cash;

public class WalletOwner {
     private Wallet wallet;

     public WalletOwner(double money) {
         wallet = new Wallet(money);
     }

     public boolean putMoney(double income) {
         if(wallet.credit(income)) {
             System.out.println("Successfully added money");
             return true;
         }
         else {
             System.out.println("Invalid Input");
             return false;
         }
     }

     public boolean buyThing(double cost) {
         if(wallet.decreaseMoney(cost)) {
             System.out.println("The thing is successfully bought");
             return true;
         }
         else {
             System.out.println("Not enough money");
             return false;
         }
     }
}
