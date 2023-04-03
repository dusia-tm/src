package com.noirix;

import src.noirix.domain.Cat;
import src.noirix.domain.User;

public class BaseTest {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User();

        Cat cat = new Cat();

        if (user.equals(user1)) {
            System.out.println("Objects are equals");
        } else {
            System.out.println("Objects are not equals");
        }

        if (user.equals(cat)) {
            System.out.println("Objects are equals");
        } else {
            System.out.println("Objects are not equals");
        }


    }
}
