package hackerrank;

import java.util.Scanner;

/**
 * Created by aprybysh on 12/1/15.
 */
public class insertionPartI {


    public static void main(String[] args) {
        int [] ar = {2,4,6,8,3, 21, -8, 14, 1, 1 };

       // insertIntoSorted(ar);
        insert(ar);
        printArray(ar);




    }



    public static void insertIntoSorted(int[] ar) {
        // Fill up this function

        int j = ar.length-1;
        int temp =  ar[j];

        while ( ar [j - 1] > temp && j > 0 ) {


             ar[j] = ar [j - 1];

            printArray(ar);

            j--;
        }
        ar[j] = temp;
        printArray(ar);


    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void insert(int [] arr){


        for (int i = 0; i < arr.length; i++){

            for(int j = i+1; j > 0 && j < arr.length; j--){

                if (arr[j] < arr[j-1]){

                    int temp = arr [j];
                    arr[j] = arr [j-1];
                    arr[j-1] = temp;

                }
            }
        }


    }



}






