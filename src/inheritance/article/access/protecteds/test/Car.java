package inheritance.article.access.protecteds.test;

import inheritance.article.access.protecteds.Vehicle;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    public void startByVoice(){
        super.start();
        System.out.println("Starting by voice");
    }
}
