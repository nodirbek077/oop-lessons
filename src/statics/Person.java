package statics;

public class Person {
    public static String name;
    public String surname;

    public static void info(){
        name = "Bobur";//bu to'g'ti
//        surname = "Alisher";//bu xato, chunki static methoddan classning faqat static o'zgaruvchilarni ishlatish mumkin

        details();

//        test();//bu xato, chunki static metoddan faqat static metodlar chaqirilishi mumkin
    }

    public static void details(){
        //
    }

    public void test(){
        //
    }
}
