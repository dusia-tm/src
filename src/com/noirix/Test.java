//comments
/*
*
*
* */
package src.noirix;

import src.noirix.domain.User;
import src.noirix.functions.SomeFunctions;

public class Test {

    public static void main(String[] args) {

        User user = new User(); //we are calling default constructor constructor
        User secondUser = new User();
        User slava = new User(30, "Slava", 100);
        User slava1 = new User("Slava", 100);
        User slava2 = new User(26, "Slava");


        System.out.println(user.toString());

        System.out.println(user.hashCode());
        System.out.println(secondUser.hashCode());
        System.out.println(slava.hashCode());
        System.out.println(slava1.hashCode());
        System.out.println(slava2.hashCode());



        int firstParam = 1;
        int secondParam = 5;

        int firstResult = user.sum(1, 2);
        int secondResult = user.sum();
        double thirdResult = user.sum(1, 2.5);
        double anotherOneResult = user.sum(2.5, 5, 8);

        Class<? extends User> aClass = slava1.getClass();
        System.out.println(aClass);

        SomeFunctions someFunctions = new SomeFunctions();
        System.out.println(someFunctions.getClass());















        System.out.println(firstResult);
        System.out.println(secondResult);
        System.out.println(thirdResult);

        System.out.println(user.age);
        System.out.println(user.weight);
        System.out.println(user.name);

        System.out.println(secondUser.age);
        System.out.println(secondUser.weight);
        System.out.println(secondUser.name);

        System.out.println(slava.age);
        System.out.println(slava.weight);
        System.out.println(slava.name); //Ctrl+P

        /*How static works*/
        System.out.println(User.count);
        User.someStaticMethod();

    }
}
