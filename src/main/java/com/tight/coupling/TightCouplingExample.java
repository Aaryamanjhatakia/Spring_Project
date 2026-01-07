package com.tight.coupling;

public class TightCouplingExample {
    static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
