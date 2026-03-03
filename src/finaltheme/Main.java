package finaltheme;

import interfaces.Driver;
import interfaces.Teacher;

public class Main {
    public static void main(String[] args) {
       /* Salary salary = new Salary();
        salary.amount = 20000;
        System.out.println(salary.amount);
        System.out.println(salary.total);
        System.out.println(Salary.totalStatic);
        System.out.println(Salary.PI);

        Salary salary1 = new Salary();
//      salary.total = 9000;//final o'zgaruvchisini qiymatini o'zgartirib bo'lmaydi

        Vehicle vehicle = new Vehicle();
        vehicle.detail();
*/
        Teacher teacher = new Teacher();
        teacher.work();
        teacher.detail();

        Driver driver = new Driver();
        driver.work();
        driver.detail();
    }
}
