package constructor;

public class Student {
    String name;
    String surname;
    int age;
    boolean hasJava;
    boolean hasMath;

    //By returning this, the method provides the current instance back to the caller.
    // This allows us to string multiple method calls together in a single statement
    public Student addJava(){
        hasJava = true;
        return this;
    }

    public Student addMath(){
        hasMath = true;
        return this;//this ni shunday qilib returnda ham ishlatishimiz mumkin ekan
    }

//    public static void show() {
//        System.out.println(this);//bu xato
//    }
//
//    public void info(String name) {
//        System.out.println(this.name);//bunday ishlatish xato chunnki static o'zgaruvchi this bilan ishlatilmaydi
//    }

//
//    public void show() {
//        System.out.println(this);
//    }

//    public constructor.Student(){
//        this("Afandi");
//        System.out.println("Inside default constructor");
//    }
//
//    public constructor.Student(String name) {//2
//        this.name = name;
//    }


//
//    public String getDetail() {
//        return "Some detail";
//    }
//
    public void info() {
//        this.name = "Alibek";
//        System.out.println(this);
//        System.out.println(this.getDetail());
        System.out.println(this.hasJava + " " + this.hasMath);
    }

    public Student() {//1
        //default constructor
//        this("asda","asdasd");
    }

//    public constructor.Student(String personName) {//2
//        name = personName;
//    }

    public Student(String personName, String personSurname) {//3
//        this();
        name = personName;
        surname = personSurname;
    }

    public Student(String personName, int personAge) {//4
        name = personName;
        age = personAge;
    }

    public Student(String personName, String personSurname, int personAge) {//5
        name = personName;
        surname = personSurname;
        age = personAge;
    }
}
