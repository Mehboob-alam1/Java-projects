package Basics;

import java.sql.Time;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Widenning casting

//        int marks=98;
//
//        float markFloat=marks;
//
//        System.out.println(markFloat);
//

        // Narrowing caasting

//        double percentage=98.99;
//         int per = (int)percentage;
//        System.out.println(per);
//        System.out.println(percentage);


        int x;
        int y;
        int z;

        x=10;   //  x hold 10
        y=20;    // y hold 20
        System.out.println("Before changing  x is " +x +" and y is " +y);

        z=x;    // z holds 10
        x=y;  // x holds 20
        y=z; /// y holds 10
        System.out.println("After changing  x is " +x +" and y is " +y);

    }
}
