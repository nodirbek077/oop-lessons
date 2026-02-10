package inheritance.article.access.protecteds;

public class Item extends Vehicle{

    public Item(){
        super("General vehicle");
        System.out.println("Item konstructor. ");
    }

    public void getItem(){
        System.out.println("Item is working now");

        System.out.println(name);
        super.start();

    }
}
