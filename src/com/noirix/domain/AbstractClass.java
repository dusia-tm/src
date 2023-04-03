package src.noirix.domain;

public abstract class AbstractClass {
    public String abstractField;

    public int value;

    public AbstractClass() {
    }

    public AbstractClass(String abstractField, int value) {
        this.abstractField = abstractField;
        this.value = value;
    }

    public void someAbstractFunctionality() {
        System.out.println("Hello abstract parent!");
    }


    public abstract int someAbstractCalculate();
}
