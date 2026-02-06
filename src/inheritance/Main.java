package inheritance;

public class Main {
    public static void main(String[] args) {
        /*Person person = new Person();
        person.setName("Ali");
        person.setSurname("Aliyev");
        System.out.println(person.getName() + " " + person.getSurname());

        Professor professor = new Professor();
        professor.setName("Vali");
        professor.setSurname("Valiyev");
        professor.setSubjectName("Java");
        professor.printDetail();
//      System.out.println(professor.getName() + " " + professor.getSurname() + " " + professor.getSubjectName());

        Student student = new Student();
        student.setName("Toshmat");
        student.setSurname("Toshmatov");
        student.setLevel(4);
        student.printDetail();
        student.printLevel();

        System.out.println();
        Asistant asistant = new Asistant();
        asistant.setName("Nurlan");
        asistant.setSurname("Alimonov");
        asistant.printDetail();
        asistant.setLevel(4);
        asistant.printLevel();
        asistant.setProfessorName("Vali");*/

        /*Object object = new Object();
        Person person = new Person();
        Professor professor = new Professor();
        Student student = new Student();
//        Asistant asistant = new Asistant();

        System.out.println("object: " + object);
        System.out.println("person: " + person.toString());
        System.out.println("professor: " + professor.toString());
        System.out.println("student: " + student.toString());
//      System.out.println("assistant: " + asistant);*/

        //04.02.2026
        //inheritance with constructors (without parameters)
//        Person person = new Person();
//        Object object = new Object();
//        Professor professor = new Professor();

        //inheritance with constructors (with parameters)
        Professor professor = new Professor("Alish","Java");
//        System.out.println(professor.getName());
//        System.out.println(professor.getSubjectName());
//        System.out.println(professor.getDegree());

        professor.startTeaching();

    }
}
