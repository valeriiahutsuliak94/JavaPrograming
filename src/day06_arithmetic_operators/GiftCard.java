package day06_arithmetic_operators;

public class GiftCard {
    public static void main(String[] args) {

        int giftCard = 200;
        int price1 = 40;
        int price2 = 100;

        System.out.println("The gift card started with a balance of $" + giftCard + " and after buying item 1 for $" + price1 + " and item 2 for $" + price2 + ". The remaining of the gift card is $" + (giftCard - (price1 + price2))+ ".");

    }
}
