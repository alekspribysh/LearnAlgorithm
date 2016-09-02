/**
 * Created by aprybysh on 7/25/16.
 */
public class Bazz_Buzz {


    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Bazz_Buzz b = new Bazz_Buzz();
        b.buz(ar);
    }

    public void buz(int [] ar){


        for (int i = 0; i < ar.length; i++){

            if ( ar[i] % 3 == 0 && ar [i] % 5 == 0){

                System.out.println("foo");
            }

            else {

                if ( ar[i] % 3 == 0 ){

                    System.out.println("Bazz");
                }

                if ( ar[i] % 5 == 0){

                    System.out.println("Buzz");
                }

            }



        }


    }


}
