package Basics;

import java.util.Scanner;

public class ReverseArray {

    public static int count = 0;

    public static void main(String[] args) {

        int[] num={5,6,7,8,9,10,11,12,13,14};
      int result=  binarySearch(num,11);

      if (result==-1){
          System.out.println("No match found");
      }else{
          System.out.println("Match found in index " +result);
      }
    }

    //Linear Search


    public static int searchArray(int[] array,int key){

        for (int i=0;i<array.length;i++){

            if (key==array[i]){
                return i;
            }

        }

       return -1;

    }

    public static int binarySearch(int[] array,int key){
        int low=0;
        int high=array.length-1;


        while (high>=low){
            int mid=(low+high)/2;
            if (key<array[mid]){
                high=mid-1;
            }else if (key>array[mid]){
                low=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
