package Basics;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    char c= (char) ((int)'a' + Math.random() * ((int)'z'- ((int)'a' + 1)));
        System.out.println(c);
        System.out.println();
        System.out.println( String.valueOf(c).hashCode());

    }

}
