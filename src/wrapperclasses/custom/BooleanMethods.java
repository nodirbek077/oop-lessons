package wrapperclasses.custom;

public class BooleanMethods {
    public static void main(String[] args) {
        //Boolean constructor
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("true1");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        //Boolean methods
        Boolean b4 = new Boolean(true);
        Boolean b5 = true;
        System.out.println(b4.equals(b5));

        String name = "false";
        System.out.println("get boolean: " + Boolean.getBoolean("true"));

        String s1 = "TRUE";
        System.out.println("parse boolean: " + Boolean.parseBoolean(s1));

        //CONVERT TO STRING
        boolean b6 = false;
        String convertToString = Boolean.toString(b6);
        System.out.println("string boolean: " + convertToString);

        boolean b7 = true;
        Boolean b8 = Boolean.valueOf(b7);
        System.out.println("b8: " + b8);

        Boolean b9 = new Boolean(String.valueOf(true));
        System.out.println("b9: " + b9);

        Boolean b10 = Boolean.TRUE;
        Boolean b11 = new Boolean(false);
        Boolean answer = Boolean.logicalAnd(b10, b11);
        System.out.println("answer: " + answer);

        Boolean b12 = Boolean.TRUE;
        Boolean b13 = new Boolean(false);
        Boolean answer1 = Boolean.logicalOr(b12, b13);
        System.out.println("answer: " + answer1);

        //QIYMATLARI HAR XIL BO'LSA TRUE CHIQARADI
        Boolean b14 = Boolean.FALSE;
        Boolean b15 = new Boolean(false);
        Boolean answer2 = Boolean.logicalXor(b14, b15);
        System.out.println("answer111: " + answer2);
    }
}
