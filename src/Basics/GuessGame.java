package Basics;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
  int[] rev=      reverse(num);

  for (int i=0;i<rev.length;i++){

      System.out.print(" " +rev[i]);
  }

    }

    public static int[] reverse(int[] array) {

        int[] result = new int[array.length];

        for (int i=0 ,j=result.length-1;i<array.length;i++,j--){
            result[j]=array[i];

        }
        return  result;
    }


}
