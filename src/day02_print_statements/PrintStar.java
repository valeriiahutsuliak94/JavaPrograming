package day02_print_statements;

public class PrintStar {
//    public static void main(String[] args) {
//
//    }

        public static void main(String[] args)
        {
            int a, b, c;
            for(a=5;a>=1;a--)
            {
                for(b=1;b<=a;b++)
                {
                    System.out.print(" ");
                }
                for(c=5;c>=a;c--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

