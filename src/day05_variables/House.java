package day05_variables;

public class House {
    /*
    Create the following variables:
        house type,
        number of bedrooms,
        number of bathrooms,
        number of kitchens,
        is there a basement?,
        is there an attic,
        is there a pool,
        is the house for sale?,
        cost of the house,
        address,
        zipcode,
        is a park near by,
        Rating of surrounding school districts (out of 5),

     */
    public static void main(String[] args) {
        String typeHouse = "Condo";
        int numBedrooms = 2;
        int numBathrooms = 2;
        int numKitchen = 1;
        boolean isBasement = false;
        boolean isAttic = false;
        boolean isPool = false;
        boolean isForSale = false;
        int costHouse = 380_000;
        String houseAddress = "222 Cybertek ave";
        int zipCode = 60622;
        boolean isParkNear = true;
        int schoolRate = 4;

        System.out.println("The house type is: " + typeHouse);
        System.out.println("The number of bedrooms is: " + numBedrooms);
        System.out.println("The number of bathrooms is: " + numBathrooms);
        System.out.println("The number of kitchens is: " + numKitchen);
        if (isBasement == true) {
            System.out.println("This house have basement");
        } else {
            System.out.println("This house do not have basement");
        }
        if (isAttic == true) {
            System.out.println("This house have a attic");
        } else {
            System.out.println("This house do not have attic");
        }
        if (isForSale == true) {
            System.out.println("This condo for sale. Selling price: " +costHouse+ "$");
        } else {
            System.out.println("This condo not for sale. Previously was sale for " +costHouse+ "$");
        }
    }
}
