package interfaces.java1_8_version_features;

/**
 * From java 1.8 version, default and static methods added
 */
//javaning 1.8 versiyasidan boshlab dasturchilar interfacelarga default methodlarni qo'shishgan
//Sababi masalan Worker degan interfaceimizda 1000 ta class implement olgan bo'lsa va bizga qandaydur test() degan method kerak bo'lib qolsa
//va biz uni Worker interfaceimizga qo'shsak undan implementatsiya olgan qolgan 1000 ta classlarda ham override qilib chiqishimizga to'g'ri kelib qoladi.
//Lekin bizga 300 tasi uchungina kerak va shunaqa holatda shu versiyadan boshlab default methodlarni qo'shishgan va unda barcha classlardan override qilishni majburiy so'ramaydi xohlasa qiladi hohlamasa
//qilmaydi
public interface Worker {
    void work();

    void detail();

    default void test() {
        System.out.println("Test method");
    }

    static void run() {
        System.out.println("Run method");
    }
}
