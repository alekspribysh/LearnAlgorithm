package hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aprybysh on 7/25/16.
 */
public class NumberofElement {


    public static void main(String[] args) {

        NumberofElement num = new NumberofElement();

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };


        int key = 12;

        System.out.println(num.count1(a, key));
        String str = "abcdsxabcsxcabc";

        int i = 0;

        // System.out.println(num.cont2(str));
    }


    public int count1(int[] ar, int k) {


        int p;
        int count = 0;

        for (int i = 0; i < ar.length; i++) {



                while (ar[i] > 0) {


                    p = ar[i] % 10;
                    ar[i] = ar[i] / 10;
                    if (p == k) {
                        count += 1;

                    }
                }

        }


        return count;

    }


    public int cont2(String i) {

        System.out.println(i);


        int k = 99;


        return k += 1;


    }


}