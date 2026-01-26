package wrapperclasses.autoboxing;

public class Explanation {
    public static void main(String[] args) {

        int eggs = 7; //count of eggs
        Integer againEggs = 17; //eggs with its more information for example, its weight, manufactured date and etc

        //Autobixing: tuxumni qutiga solish
        //Unboxing: tuxumni qutidan chiqarish

        int compare = Integer.compare(eggs, againEggs);
        System.out.println(compare);

        String telegramMessage = "25";
        int number = Integer.parseInt(telegramMessage);
        System.out.println(number);
    }
}
