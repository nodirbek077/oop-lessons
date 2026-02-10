package inheritance.article.access.protecteds;

public class Vehicle {
    protected String name;

    public Vehicle(String name){
        this.name = name;
    }

    protected void start(){
        System.out.println("starting...");
    }

    protected void test(){
        System.out.println("testing...");
    }

}
