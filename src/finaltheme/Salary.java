package finaltheme;

public class Salary {

    /*
     * final keyword in variables
     */
    public double amount;

    public final double total;

    public static double totalStatic;

    static final double PI;

    static{
        PI = 3.14;
    }

   /* public Salary() {
        System.out.println("dasdasd");
    }*/

    //final o'zgaruvchisiga constructor orqali qiymat berishimiz mumkin
    /*public Salary(){
        total = 80000;
    }
    */

    //bu static block deyiladi u faqat classdan qachon obyekt olinsa shu vaqti ishga tushadi. Necha marta obyekt olinsa shuncha marta ishga tushaveradi
    {
//        System.out.println("static block");
        total = 900000;
    }

    static {
        totalStatic = 70000;
    }

}
