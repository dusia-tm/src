package src.noirix.homework;

public class Starter {
    public static void main(String[] args) {

        task1();
        task2();
    }

    private static void task2() {
    }


    /*        1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести равна 16% от силы тяжести на Земле.*/
    public static void task1() {
        System.out.println("Task 1 Start");

        double moonGravity = 0.16;
        double myWeight = 100;

        double moonWeight = moonGravity * myWeight;

        System.out.println("Current user weight: " + myWeight);
        System.out.println("Moon user weight: " + moonWeight);
    }
}
