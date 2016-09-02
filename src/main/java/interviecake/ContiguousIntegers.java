package interviecake;

/**
 * Created by aprybysh on 8/19/16.
 */
public class ContiguousIntegers {


    public static void main(String[] args) {

        int [] ar = {-10, 2, 3, -2, 0, 5, -15, 20};

        System.out.println(sum(ar));
    }


    public static int sum(int [] ar){
        int  larg = Integer.MIN_VALUE;

        for (int i =0; i < ar.length; i++){

            for ( int j =  i + 1; j <ar.length; j++){

                int tempsum1 = ar[i];

                while (j < ar.length){

                    tempsum1 += ar[j];

                    if ( tempsum1 > larg) larg = tempsum1;
                    j++;

                }

            }

        }

        return larg;
    }
}
