package src.noirix.domain;

public class User extends BaseClass {

    static {
        count = 10;
        System.out.println("Inside static block 1");
    }

    {
        age = 100;
        name = "sdkfdslkf";
        weight = 129;
        count = 1000;
        System.out.println("User Logic 1 block");
    }

    static {
        count = 555;
        System.out.println("Inside static block 2");
    }

    public static final int SOME_CONST = 777; //предкомпилируемая константа

    public static int count = 0;

    public int age;

    public String name;

    public double weight = 80;

    public final int classConst = 100;


    {
        age = 88;
        name = "2222";
        weight = 99;

        System.out.println("2 Logic block");
    }

    public User() {
        /*Here will be all logic blocks of code*/
        System.out.println("I am in default constructor");
        this.age = 77;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public User(int age, String name, double weight) {
        System.out.println("I am in custom constructor");
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    {
        age = 44;
        name = "2222";
        weight = 99;
        System.out.println("3 Logic block");
    }

    public void someMethod() {
        System.out.println(1000);
        return;
    }

    static {
        count = 999;

        //age = 100; compilation error

        System.out.println("Inside static block 3");
    }


    public int sum() {
        return 0;
    }

    public int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public double sum(int a, double b) {
        double result = a + b;
        return result;
    }

    public double sum(double b, int a) {
        double result = a + b;
        return result;
    }

    public double sum(double b, int a, int c) {
        double result = a + b;
        return result;
    }

    //Overloading
    //Method Signature = method name + params (number of params, type, ordering)

    private void bigNumberOfParams(int... params) { //var args = int[] params

    }


    {
        age = 33;
        name = "55555";
        weight = 77;
        System.out.println("4 Logic block");
    }

    public static void someStaticMethod() {
        System.out.println("Hello from static method!");
    }


    public void baseLogic() {
        System.out.println("Base Logic In User Class");
    }

    @Override
    public void someAbstractFunctionality() {
        System.out.println("Hello abstract user!");
    }

    //Alt+Insert -> Equals and HashCode
    @Override
    public boolean equals(Object o) {
        //Сравнение объекта с самим собой
        if (this == o) return true;
        //Сравнение объекта с null и проверка на сравнение объектов одного и того же класса
        if (o == null || getClass() != o.getClass()) return false;

        //Вызов сравнения родительских частей объектов
        if (!super.equals(o)) return false;

        //Приведение типа данных к типу данных объекта для сравнения
        User user = (User) o;

        //Сравнение соответствующих полей двух объектов одного класса
        if (age != user.age) return false;
        if (Double.compare(user.weight, weight) != 0) return false;
        if (classConst != user.classConst) return false;
        return name.equals(user.name);
    }


    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + classConst;
        return result;
    }

    //tos + Enter
    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", classConst=" + classConst +
                "} " + super.toString();
    }
}