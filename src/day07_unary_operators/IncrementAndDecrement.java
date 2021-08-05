package day07_unary_operators;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int n = 0;
        n++;
        System.out.println(n);
        System.out.println(++n);//pre -

        System.out.println(n++);
        System.out.println(n);

        int age = 10;
        System.out.println(age);
        System.out.println(age++);
        System.out.println(age);

    }
}
