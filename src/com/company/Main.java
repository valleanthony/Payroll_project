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
        double regularPay = (hoursWorked -35) * hourlyPay ;
        double totalPay;
        double otPay = regularPay*1.5;
        boolean otTime = hoursWorked > 35;


        if (otTime == true){
           totalPay = regularPay + (overtimeHours*otPay);
            System.out.println("Your pay is " + totalPay);
        }

        else{
            regularPay = hoursWorked*hourlyPay;
            System.out.println("Your pay is " + regularPay);
        }


    }
}
