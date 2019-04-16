package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter hours worked ");
        double hoursWorked = myObj.nextDouble();

        System.out.println("Enter hourly rate ");
        double hourlyPay = myObj.nextDouble();


        double overtimeHours = hoursWorked - 35;
        double regularPay = 35 * hourlyPay ;
        double totalPay;
        double otPay = hourlyPay*1.5;
        boolean otTime = hoursWorked > 35;


        if (otTime == true){
           totalPay = regularPay + (overtimeHours*otPay);
            System.out.println("your regular pay is " + regularPay);
            System.out.println("Your OT Hours " + overtimeHours);
            System.out.println("Your OT rate " + otPay);
            System.out.println("Your total pay is " + totalPay);
        }

        else{
            regularPay = hoursWorked*hourlyPay;
            System.out.println("Your pay is " + regularPay);
        }


    }
}
