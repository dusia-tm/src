package src.noirix.vehicle;

public abstract class Car implements MechanismInstructions, CabrioInstructions  {

    @Override
    public void go() {

    }

    @Override
    public void stop() {
        System.out.println(SOME_CONST);
    }

    @Override
    public String toString() {
        return "Car{}";
    }
}
