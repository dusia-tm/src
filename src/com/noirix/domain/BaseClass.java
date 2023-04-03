package src.noirix.domain;

import java.util.Objects;

public class BaseClass extends AbstractClass {
    public int parentValue = 10;

    public String parentName = "Parent";

    public double parentWeight = 90.5;

    {
        parentValue = 70;
        parentWeight = 100;
        System.out.println("BaseClass Logic block 1");
    }

    public BaseClass() {
        System.out.println("BaseClass Default Constructor");
    }

    public BaseClass(String parentName) {
        this.parentName = parentName;
        System.out.println("BaseClass Constructor with param");
    }

    public BaseClass(int parentValue, String parentName, double parentWeight) {
        this.parentValue = parentValue;
        this.parentName = parentName;
        this.parentWeight = parentWeight;

        System.out.println("BaseClass Constructor with params");
    }

    public void baseLogic() {
        System.out.println("Base Logic");
    }

    private int getRandomInt() {
        return 10;
    }

    @Override
    public void someAbstractFunctionality() {
        System.out.println("Hello abstract base class!");
    }

    @Override
    public int someAbstractCalculate() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseClass baseClass = (BaseClass) o;

        if (parentValue != baseClass.parentValue) return false;
        if (Double.compare(baseClass.parentWeight, parentWeight) != 0) return false;
        return Objects.equals(parentName, baseClass.parentName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = parentValue;
        result = 31 * result + (parentName != null ? parentName.hashCode() : 0);
        temp = Double.doubleToLongBits(parentWeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "parentValue=" + parentValue +
                ", parentName='" + parentName + '\'' +
                ", parentWeight=" + parentWeight +
                '}';
    }
}
