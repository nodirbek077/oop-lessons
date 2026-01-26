package wrapperclasses.autoboxing;

public class Main {
    public static void main(String[] args) {
//        int n = 10;
//        print(5);//bu yerda ishlaydi garchi biz print metodiga int ya'ni primitiv tip berib yuborsak kam
//        //autoboxing: primitive tipdagi o'zgaruvchilarning non primitiv tipga o'zgarishiga aytiladi

         //shuni teskarisiga unboxing deyiladi ya'ni wrapper classlardan primitive tiplarga o'tiush jarayoni
//        Integer m = 51;
//        test(m);

        int a = 2;
        byte b = 12;

        Integer a1 = new Integer(a);
        Byte b1 = new Byte(b);
        Double c = 3.14;
        Character d = 'F';
        short e = 14;
        Float f = 9.9f;
        Boolean g = true;
        Boolean h = false;
        Boolean t = new Boolean(true);
        Long l = 166L;
        Integer k = 90;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c.doubleValue());
        System.out.println(d.charValue());
        System.out.println(Short.valueOf(e));
        System.out.println(f.floatValue());
        System.out.println(g);
        System.out.println(h.booleanValue());
        System.out.println(l.longValue());
        System.out.println(t);
        String kStr = k.toString();
        System.out.println(Integer.valueOf(kStr) + 90);
    }
//
//    public static void print(Integer n){
//        System.out.println(n);
//    }
//
//    public static void test(int n){
//        System.out.println(n);
//    }


}
