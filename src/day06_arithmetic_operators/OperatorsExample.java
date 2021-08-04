package day06_arithmetic_operators;

public class OperatorsExample {
    public static void main(String[] args) {

        System.out.println(10.5 / 3.0);
        System.out.println((int) 10.5 / 3.0);
        System.out.println((int) (10.5 / 3.0));

        byte b1 = 10;
        byte b2 =5;
        byte b3 = (byte)(b1 + b2);
//        int b3 = b1 + b2;
        System.out.println(b3);

    }
}
