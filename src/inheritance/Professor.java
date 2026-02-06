package inheritance;

public class Professor extends Person {
    private String subjectName;
    private String degree;

    //contrcutorda ishlatgan vaqtda bittasini ishlatish kerak this ni yoki super ni,
    //ikkalasini ham birdaniga ishlata olmaymiz
    public Professor(String name, String subjectName) {
//        this.subjectName = subjectName;
        this(name,subjectName,"Professor");
//        super(name);
    }

    public Professor(String name, String subjectName, String degree){
        super(name);
        this.subjectName = subjectName;
        this.degree = degree;
    }

    public void startTeaching() {
//        System.out.println("Lets start lesson.");
        walk();
        System.out.println(this);
        super.walk();
        System.out.println(super.getName());
    }

    @Override
    public void walk() {
        System.out.println("I am walking...");
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    //    @Override
//    public String toString() {
//        return "Mazgi";
//    }
}
