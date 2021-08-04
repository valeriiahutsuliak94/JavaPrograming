package day05_variables;

public class WatchInfo {
    public static void main(String[] args) {
//        brand, color, price, waterResistant, isSmart

        String brand = "AppleWatch";
        String color = "Black";
        double price = 245.90;
        boolean isWaterResistant = true;
        boolean isSmart = true;

        if( isWaterResistant == true && isSmart == true) {
            System.out.println("My "+brand+ " in " +color+ " color. Watch price: " +price+ "$.\n" +brand+ " is water resistant and smart." );
        } else {
            System.out.println(brand+ " in " +color+ " color. Watch price: " +price+ " ." +brand+ " is not water resistant but smart.");
        }
    }
}
