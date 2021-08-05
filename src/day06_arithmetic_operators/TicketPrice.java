package day06_arithmetic_operators;

public class TicketPrice {
    public static void main(String[] args) {
        String city1 = "Chicago";// String its sequence of numbers
        String city2 = "Virginia";
        float f = 40.5f;
        long l = 10000000L;
        float result = f * l;
        System.out.println(result);

        double baseTicketPrice = 110.50;
        double milesBetweenCity = 739.8;
        System.out.println("The ticket price from " + city1 + " to " + city2 + " is $" + (baseTicketPrice+ (milesBetweenCity / 10)));
    }

}
