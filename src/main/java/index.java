/**
 * Created by aprybysh on 4/28/16.
 */
public class Index {

    static Index ix = new Index();


    public static void main(String[] args) {

        int [] ar = { 0,2, 3, 3, 3, 10, 10 };
        int x  = 10;
        ix.puk(ar, x);

    }

    public int[] puk ( int[] ar, int v){

        int [] ar1 = {-1, -1};
        for (int i = 0; i < ar.length; i++){

            if (ar[i] == v){

                ar1[0] = i;
                int j = i+1;
                while( i+1 < ar.length && ar[j] == v){
                    ar1[1] = j;
                    j++;
                    i++;
                }
            }
        }


        for (int a : ar1){
            System.out.println( a + " ");
        }

        return ar1;
    }


}
