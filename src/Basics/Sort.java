package Basics;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int []  list={2, 9, 5, 4, 8, 1, 6};
        Arrays.sort(list);


        for (int i=0;i<list.length;i++){
            System.out.print(list [i] +" ");
        }


  }


  public static int[] sortArray(int[] list){


        for (int i=0;i<list.length-1;i++){
            int currentMinIndex=i;
            int currentMInVal=list[i];

            for (int j=i+1;j<list.length;j++){


                if (currentMInVal>list[j]){
                    currentMinIndex=j;
                    currentMInVal=list[j];

                }
            }

            if (currentMinIndex!=i){
                list[currentMinIndex]=list[i];
                list[i]=currentMInVal;
            }


        }


        return list;
  }


    }

