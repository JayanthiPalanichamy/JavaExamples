package com.thoughtworks.iwp.cash;

public class WalletOwner {
     private Wallet wallet;

     public WalletOwner(double money) {
         this.wallet = new Wallet(money);
     }

     public void putMoney(double income) {
         if(income >0) {
             wallet.addMoney(income);
             System.out.println("Successfully added money");
         }
         else {
             System.out.println("Invalid Input");
         }
     }

     public void buyThing(double cost) {
         if(wallet.spendMoney(cost)) {
             System.out.println("The thing is successfully bought");
         }
         else {
             System.out.println("Not enough money");
         }
     }
}
