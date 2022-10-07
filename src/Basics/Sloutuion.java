package Basics;

import java.util.Scanner;

public class Sloutuion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A NUMBER ");
        int number = sc.nextInt();

        if (number %2==0 && number %3==0){

            System.out.println("The number " +number  + " is divisible by both 2 and 3");
        }
        if (number % 2==0 || number %3==0){
            System.out.println("The number " +number  + " is divisible by 2 or 3");
        }
        if (number %2==0 ^ number%3==0){

            System.out.println("The number is divided by 2 or 3 but not by both");
        }



    }
}
