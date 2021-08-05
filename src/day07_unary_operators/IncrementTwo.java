package day07_unary_operators;

public class IncrementTwo {
    public static void main(String[] args) {


        int i = 5;
         i++; //i = 6
        int x = i++;
        System.out.println(x);

        int b = 10;
        int c = ++b;
        System.out.println(b +" "+ c);
    }
}