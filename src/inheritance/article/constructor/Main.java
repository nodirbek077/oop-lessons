package inheritance.article.constructor;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        Car car = new Car("Malibu");
//        System.out.println(car.model);

        car.getEngine();
    }
}
