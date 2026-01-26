public class Main {
    public static void main(String[] args) {
        /*UniversityManager university = new UniversityManager("University 1");
        System.out.println(university.getUniversityName());

        UniversityManager university2 = new UniversityManager("University 2");
        System.out.println(university2.getUniversityName());*/

        UniversityManager university = new UniversityManager("University 1");
        Subject subjectMath = university.createSubject("Math", 2);
        Subject subjectHistory = university.createSubject("History", 2);
        Subject subjectJava = university.createSubject("Java", 2);

        Subject subject = university.createSubject("Java", 2);
        System.out.println(subject);
    }
}