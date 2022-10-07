package Basics;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num1 =(int)(Math.random() *10);
       int num2 =(int)(Math.random() *10);

        System.out.println("What is " +num1  + " + " +num2 + "?" );
        int answer=sc.nextInt();

        while (num1+ num2 !=answer){
            num1=(int)(Math.random()*10);
            num2=(int)(Math.random()*10);
            System.out.println("What is " +num1  + " + " +num2 + "?" );
            System.out.println("Try again");
            answer=sc.nextInt();
        }
        System.out.println("yes you are right");




    }
}
