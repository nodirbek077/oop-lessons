package inheritance;

public class Student extends Person{
    private Integer level;

    public Student(String name) {
        super(name);
    }

//    public Student(String name) {
//        super(name);
//    }

    public void printLevel(){
        System.out.println(level);
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
