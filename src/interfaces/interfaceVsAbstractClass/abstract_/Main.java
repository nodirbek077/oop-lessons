package interfaces.interfaceVsAbstractClass.abstract_;

/**
 * 7
 */
public class Main {
    /**
     * agar bizga 100$ mavhumlik kk bo'lsa interface qisman mavhumlik kerak bo'lsa abstract classni ishlatishimiz kerak
     */

    public static void main(String[] args) {
        Employee employee1 = new Driver();
        employee1.test();//bu method mavhum emas chunki ichida logika yozilgan va biz bilamiz
        employee1.start();//bu esa mavhum chunki bolalarida qanday implementatsiya qilinganini biz bilmaymiz
    }
}
