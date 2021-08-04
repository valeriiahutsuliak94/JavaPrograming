package day06_arithmetic_operators;

public class TicketPrice {
    public static void main(String[] args) {
        String city1 = "Chicago";
        String city2 = "Virginia";
        double baseTicketPrice = 110.50;
        double milesBetweenCity = 739.8;
        System.out.println("The ticket price from " + city1 + " to " + city2 + " is $" + (baseTicketPrice+ (milesBetweenCity / 10)));
    }

}
