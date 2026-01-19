package wrapperclasses.autoboxing;

public class Main {
    public static void main(String[] args) {
//        int n = 10;
//        print(5);//bu yerda ishlaydi garchi biz print metodiga int ya'ni primitiv tip berib yuborsak kam
//        //autoboxing: primitive tipdagi o'zgaruvchilarning non primitiv tipga o'zgarishiga aytiladi

         //shuni teskarisiga unboxing deyiladi ya'ni wrapper classlardan primitive tiplarga o'tiush jarayoni
        Integer m = 51;
        test(m);
    }

    public static void print(Integer n){
        System.out.println(n);
    }

    public static void test(int n){
        System.out.println(n);
    }


}
