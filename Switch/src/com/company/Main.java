package com.company;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruit = in.next();
        switch (fruit){
                case "Mango":
                System.out.println("King of fruit");
                break;
                case "Apple":
                System.out.println("Red fruit");
                break;
                case "grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("Enter valid fruit");
        }
        int day= in.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");

        }
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
//            case 6, 7 -> System.out.println("Weelend");
//        }

    }
}
