/**
 * Created by aprybysh on 7/29/16.
 */
public class Multiply {

    public static void main(String[] args) {

        int [] ar = {1, 7, 0, 4};

        multy(ar);


    }


    public static int [] multy (int [] ar){

        int [] ar1 = new int[ar.length];



        for (int i = 0; i < ar.length; i++){
            int temp =1;


             for (int j = 0; j < ar.length; j++){

                 if (i != j){

                     temp *= ar[j];
                 }
             }
            ar1[i] =temp;

        }

        for (int i = 0; i < ar1.length; i++ ){
            System.out.println(ar1[i]);
        }



        return ar1;
    }
}
