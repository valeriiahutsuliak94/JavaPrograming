package day05_variables;

public class CarDriverInfo {
    /*
    carModel    -> String
    driverName  -> String
    licenseNum  -> String
    speed       -> short
    isAutomatic -> boolean
    licenseClass-> char
     */
    public static void main(String[] args) {
        String carModel = "Nisan";
        String driverName = "Valeriia";
        String licenseNum = "444ABC";
        short speed = 137;
        boolean isAutomatic = true;
        char licenseClass = 66;

        System.out.println("Car Model " +carModel+ " with licence number " +licenseNum+ ", maximum speed " +speed+ " mph.\nDoes this car automatic: " +isAutomatic+ ".\nThis car driver name: " +driverName+ " with driver licence \'" +licenseClass+ "\' type.");

        String topic1 = "Java";
        String topic2 = "SQL";

        System.out.println("I will learn \"" +  topic1 + "\" and \"" + topic2 + "\" at CybertekSchool.");




    }

}
