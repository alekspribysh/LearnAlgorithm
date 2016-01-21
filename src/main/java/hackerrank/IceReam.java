package hackerrank;

/**
 * Created by aprybysh on 1/19/16.
 */
public class IceReam {

    public static void main(String[] args) {

        int [] arra = {1, 2, 3, 3 };

        IceReam iceReam= new IceReam();
        iceReam.find(arra);
        System.out.println("-----");


    }


    public void find (int[] arr ){
        for (int i = 1; i < arr.length-1; i++) {
            int sum1 = 0;
            int sum2 = 0;
            int k = i;
            int z = i;

            while (k > 0) {
                sum1 +=arr[k - 1];
                k--;

            }
            while (z < arr.length - 1) {
                if (sum2 > sum1){
                    break;
                }
                sum2 += arr[z + 1];

                z++;
            }

            if (sum1 == sum2 ) {
                System.out.println("YES");
                return;
            }

        }
        System.out.println("NO");


    }


}
