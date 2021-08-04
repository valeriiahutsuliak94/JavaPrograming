package day05_variables;

public class Apartment {
    public static void main(String[] args) {
        String address = "1234 Chicago ave";
        String nameOwner = "Taras";
        double unitNum = 3;
        int sizeAverage = 1200;
        int rentAmount = 2500;
        int washersNum = 3;
        int driersNum = 3;
        boolean isPets = false;
        boolean isPool = false;
        int liseLenght = 12;
        double resident = 8;
        boolean isBasement = false;
        double parking = 6;
        double floors = 3;

         int discount10 = (rentAmount * 10) / 100;
         int rent3Years = rentAmount - discount10;
         System.out.println(rent3Years);

         int discount20 = (rentAmount * 20) / 100;
         int rent6Years = rentAmount - discount20;
         System.out.println(rent6Years);

         double averageResident = resident / unitNum;
         System.out.println(averageResident);

         double averageParking = parking / unitNum;
         System.out.println(averageParking);


         double averageUnite = unitNum / floors;
         System.out.println(averageUnite);



    }


}
