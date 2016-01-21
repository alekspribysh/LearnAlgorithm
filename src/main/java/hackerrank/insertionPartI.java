package hackerrank;

import java.util.Scanner;

/**
 * Created by aprybysh on 12/1/15.
 */
public class insertionPartI {


    public static void main(String[] args) {
        int [] ar = {2,4,6,8,3};

        insertIntoSorted(ar);




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

}






