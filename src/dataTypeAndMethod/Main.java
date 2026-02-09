package dataTypeAndMethod;

/**
 * Data type and method
 * This is interview tricky questions
 */
public class Main {
    public static void main(String[] args) {
        //primitive and method using part 1
        //bunda primitive tipni changeValue() methodiga berib yuborib shu mainning ichidan chaqirganimizda
        //uning qiymati o'zgarmagan edi faqat xotiradan boshqa joy ochib shundagi qiymat o'zgartirilar edi
        /*int n = 5;
        changeValue(n);
        System.out.println(n);

//        primitive and method using part 2
        //bunda esa o'sha changeValue() methodiga obyektni o'zini berib yuborsak uning qiymatini o'sha methodda
        //o'zgartirsak maindan chaqirganimizda ham uning qiymati o'zgardi
        Person person = new Person();
        person.name = "Alish";
        System.out.println(person.name);//Alish
        changeValue(person);
        System.out.println(person.name);//Valish

        //endi bunda objectni o'zini o'zgartirib ko'ramiz qani qiymat o'zgaradimi yo'qmi ko'ramiz?
        //yuqoridagi outoutlardan o'zgarmaganligini ko'rishimiz mumkin
        System.out.println();
        changeValue1(person);
        System.out.println(person.name);// Valish
*/
        //endi wrapper classlarda uning qiymatini o'zgartirsak u o'zgaradimi yo'qmi shuni ko'ramiz
        //demak bunda
        Integer n = 5;
        changeValue(n);
        System.out.println(n);

        /*int[] numbers = new int[10];
        numbers[0] = 5;
        changeValue(numbers);
        System.out.println(numbers[0]);*/
    }

    public static void changeValue(int[] numbers) {
        numbers[0] = 15;
    }

    //wrapper classlarda qiymat o'zgarmaydi barcha o'zgarishlar shu methodning ichida bo'ladi
    //va xotiradan boshqa joy egallaydi
    public static void changeValue(Integer n) {
        n = 15;
    }

    public static void changeValue1(Person person) {
        person = new Person();
        person.name = "Toshmat";
    }

    public static void changeValue(Person person) {
        person.name = "Valish";
    }

    public static void changeValue(int n) {
        n = 20;
    }
}
