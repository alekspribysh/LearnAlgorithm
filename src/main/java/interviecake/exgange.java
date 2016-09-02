package interviecake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aprybysh on 8/5/16.
 */
public class exgange {

    public static void main(String[] args) {

        int key = 124;

        int[] ar = {8, 4, 3, 2, 1};

        change(ar, key);


    }


    public static int[] change(int[] ar, int key) {

        HashMap<Integer, Integer>  map = new HashMap<Integer, Integer>();


        for (int i = 0; i < ar.length; i++) {

            int count = 0;

            while (key >= ar[i]) {


                key -= ar[i];
                count++;

              //  map.put(ar[i], count);

            }

            if (count != 0){
                System.out.println( "coins, " + ar[i] + " amount " + count);

            }



        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            Integer ke = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println("coins, " + ke + " amount " + value);
//        }



        return ar;
    }

}
