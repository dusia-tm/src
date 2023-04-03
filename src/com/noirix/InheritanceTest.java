package src.noirix;

import src.noirix.domain.AbstractClass;
import src.noirix.domain.BaseClass;
import src.noirix.domain.User;

public class InheritanceTest {
    public static void main(String[] args) {

        User user = new User();
        User user1 = new User();

        System.out.println(user);//toString will be executed automatically
        System.out.println(user1);//toString will be executed automatically

        System.out.println(user.equals(user1));

        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());


        BaseClass base = new BaseClass();
        User user2 = new User();
        BaseClass user3 = new User();
        AbstractClass user4 = new User();
        AbstractClass user5 = new BaseClass();
        //AbstractClass user6 = new AbstractClass();

        base.baseLogic();
        user2.baseLogic();
        user3.baseLogic();
        user4.someAbstractFunctionality();
        user5.someAbstractFunctionality();





    }
}
