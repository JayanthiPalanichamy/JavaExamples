package com.thoughtworks.iwp.Main;

import com.thoughtworks.iwp.wallet.WalletOwner;

public class WalletOwnerMain {
    public static void main(String args[]) {
        WalletOwner owner = new WalletOwner(200);
        owner.putMoney(300);
        owner.buyThing(600);
    }
}
