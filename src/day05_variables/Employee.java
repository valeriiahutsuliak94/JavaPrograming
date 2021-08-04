package day05_variables;

import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    public static void main(String[] args) {
        String firstName = "Valeriia";
        String lastName = "Hutsuliak";
        String companyName = "Google";
        int salary = 90_000;
        int startDay = 5;
        int startMonth = 8;
        int startYear = 2021;
        boolean isFullTime = true;
        String jobTitle = "QA Engineer";

        String fullName = firstName+ " " +lastName;
        System.out.println("My full name is "+fullName);
        String fullDate = startMonth+"/"+startDay+"/"+startYear;
        System.out.println("My start date "+fullDate);
        String email = firstName+startDay+"@"+companyName+".com";
        System.out.println("My email "+email);
        int salaryAfter = salary + startDay * 1000;
        System.out.println("My salary after 3 years will be " +salaryAfter+"$");



    }
}
