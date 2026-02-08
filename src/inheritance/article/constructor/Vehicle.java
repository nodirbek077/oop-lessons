package inheritance.article.constructor;

public class Vehicle {
    public String model;
    public String type;

    public void getEngine(){
        model = model + "_test";
    }

    public Vehicle(String model){
        this.model = model;
    }
}
