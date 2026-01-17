package constructor;

public class Main {
    public static void main(String[] args) {

        Student student = new Student()
                .addJava()
                .addMath();
        student.info();


//        student.show();;
//        System.out.println(student);


        //        System.out.println(student.name);
//        student.info();

//        constructor.Student studentOne = new constructor.Student(); // 1
//        constructor.Student studentTwo = new constructor.Student("Ali"); // 2
//        constructor.Student studentThree = new constructor.Student("Ali", "Aliyev"); // 3
//        constructor.Student studentFour = new constructor.Student("Ali", 22); // 4
//        constructor.Student studentFive = new constructor.Student("Ali", "Aliyev", 22); // 5
//
//        System.out.println(studentOne);
//        System.out.println(studentTwo.name);
//        System.out.println(studentThree.name + " " + studentThree.surname);
//        System.out.println(studentFour.name + " " + studentFour.age);
//        System.out.println(studentFive.name + " " + studentFive.surname + " " + studentFive.age);
    }
}