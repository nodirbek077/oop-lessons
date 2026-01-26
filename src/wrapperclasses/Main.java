package wrapperclasses;

public class Main {
    static Integer num;

    public static void main(String[] args) {
        int n = 13;
        Integer m = 5;
//        Integer l = new Integer(5);//bu deprecated bo'lgan lekin to'g'ri ishlaydi

        System.out.println(n);
        System.out.println(m);
//        System.out.println(l);
        test();
        System.out.println("num: " + num);
    }

    public static void test() {
        String str = null;
        System.out.println(str);
    }
}
