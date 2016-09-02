/**
 * Created by aprybysh on 7/22/16.
 */
public class PrintUniqeElemant {


    public static void main(String[] args) {

        int[] ar = {12, 10, 9, 4, 2, 10, 10, 45};

        PrintUniqeElemant p = new PrintUniqeElemant();
        //p.print(ar);
        p.unique(ar);


    }


    public void print(int[] ar) {

        for (int i = 1; i < ar.length; i++) {

            for (int j = i; j < ar.length; j++) {

                if (ar[i] == ar[j]) {
                    break;

                }

                if (j == ar.length - 1) {
                    System.out.print(ar[i] + " ");
                }
            }

            if (i == ar.length - 1) {
                System.out.print(ar[i] + " ");
            }

        }
    }


    public void unique(int[] ar) {

        for (int i = 0; i < ar.length; i++) {

            int k = ar.length-1;
            int j = i +1;

            while ( j <= k){

                if (ar[i] == ar [k] || ar[i] == ar [j] ){
                    break;
                }

                if (j == k && ar[i] != ar [k] )
                {
                    System.out.print(ar[i] + " ");
                }

                j++;
                k--;
            }

            if (i == ar.length - 1) {
                System.out.print(ar[i] + " ");
            }
        }
    }

}
