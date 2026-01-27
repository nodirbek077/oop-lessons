package string;

public class Problem {
    public static void main(String[] args) {
        String str = "Salom";
        System.out.print(reverseString(str));
    }

    //SALOM
    //MALAS
    public static String reverseString(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        return s1;
    }
}
