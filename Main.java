public class Main {
    public static void main(String[] args) { //psvm

        for (String arg : args) {
            System.out.println(arg);
        }


        System.out.print("Hello World2");
        System.out.println("Hello   World1\n\t'\"\\");//\n - new line

        boolean bool = true;

        byte by = 4;

        short sh = 1;
        long l = 4;

        float f = 5.6F;
        double d = 349587394573945734578D; //3.4958739457394573E20 = 3.4958739457394573*10^20

        char c = 33;

        int pageA = 10;
        int pageB = 20;
        int someValue = 100_000;
        int _$1345squareOfMinsk_ = 1_000_000;

        System.out.println(bool); //sout
        System.out.println(by);
        System.out.println(sh);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(_$1345squareOfMinsk_);
        System.out.println(c); //Ctrl+D - copy current string


        int first = 257; //00000000 00000000 00000001 00000001 = 2^0*1 + 2^1*0 + ...
        byte intValueCutter = (byte) first; //00000001
        System.out.println(intValueCutter);

        int a = 124456;
        int b = 37000;

        long bigA = 10000;
        long bigB = 370000;

        int result = a * b; //3_700_000_000 > 2_300_000_000
        long resultLong = a * bigB;

        long divisionResultLong = a / b;
        long divisionResultPart = a % b;

        double divisionResultFull = (double) a / b;

        System.out.println(result);
        System.out.println(resultLong);

        System.out.println(divisionResultLong);
        System.out.println(divisionResultPart);
        System.out.println(divisionResultFull);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        a = 10;

        System.out.println(a++);// -- инкремент
        //a = a + 1
        System.out.println(++a);// -- инкремент
        System.out.println(a--);// -- декремент
        //a = a - 1
        System.out.println(--a);// -- декремент

        int resultShortNotation = 10;
        resultShortNotation += 5;
        //resultShortNotation = resultShortNotation + 5;

        System.out.println(resultShortNotation);

        System.out.println(10 != 5);
        System.out.println(10 == 5);
        System.out.println(10 >= 5);
        System.out.println(10 <= 5);
        System.out.println(10 < 5);
        System.out.println(10 > 5);

        //00000000 00000000 00000000 00001000

        a *= 2;
        //a = a << 1; *2
        //a = a >> 1; /2


        boolean someVariable1 = true;

        if (someVariable1) {

        }

        //Loops
        //1) While
        System.out.println("Before while");

        int someVariable = 100;

        while (someVariable > 100) {
            System.out.println("Variable value is: " + someVariable);
            someVariable -= 2;
        }

        System.out.println("After while");


        //2) Do-while
        /*Some comments*/
        System.out.println("Before do-while");

        someVariable = 100;
        do {
            System.out.println("Variable value is: " + someVariable);
            someVariable -= 2;
        } while (someVariable > 100);

        System.out.println("After do-while");

        //3) For

        System.out.println("Before for");

        //fori
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

        System.out.println("After for");

        //4) For-each
        int[] array = {1, 2, 3, 10, 100};

        for (int i : array) { //iterator - step by step
            System.out.println(i);
        }

        //If-else
        if (10 < 5) {
            System.out.println("10 is greater than 5");
        } else {
            System.out.println("10 is lower than 5");
        }

        if ((10 < 5 && 100 < 8) || (5 < 9)) {
            System.out.println("10 is greater than 5");
        }

        //&& - and
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false

        //|| - or
        //true || true = true
        //true || false = true
        //false || true = true
        //false || false = false

        String someString = "AUTUMN";

        switch (someString) {
            case "WINTER":
                System.out.println("Yo ho ho!");
                break;
            case "SPRING":
                System.out.println("I love May!");
                break;
            case "SUMMER":
                System.out.println("It's birthday time!");
                break;
            case "AUTUMN":
                System.out.println("Kak bystro opali listya!");
                break;
            default:
                System.out.println("I cannot recognize your string!");
                break;
        }


        //int[] container = new int[20];
        int[] container = {10, 20, 55, 83457};
        container[0] = 777;
//        container[10] = 100;
//        container[10] = 500;

        System.out.println("Array length is: " + container.length);

        for (int i : container) {
            System.out.println(i);
        }

    }
}

//noirix.com