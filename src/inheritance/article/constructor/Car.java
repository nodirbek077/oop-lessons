package inheritance.article.constructor;

public class Car extends Vehicle{

    public Car(String model) {
        super(model);
    }

    @Override
    public void getEngine() {
        model = model + "__master";
        System.out.println(model);
    }
}
