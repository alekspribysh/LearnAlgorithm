/**
 * Created by aprybysh on 9/4/15.
 */
public class Recursia {

    public static void main(String[] args) {
        int n = 8818;
        int k = 68;

        int[] array = {11, 12, 1, 11, 3, 6, 5, 4, 11, 11};
        int index = 0;


        //System.out.println(factorial(n));
        //System.out.println(febonachi(n));
        // System.out.println(gcd2(n, k));
        //System.out.println(ears(n));
        // System.out.println(count7(n));
        //System.out.println(array11(array, index));
        System.out.println(count8(n));


    }


    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }

        int pred = factorial(n - 1);
        int cur = pred * n;


        return cur;
        //return factorial(n-1)*n;
    }

    public static int febonachi(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 1;
        }
//        int feb1 = febonachi(n - 1);
//        int feb2 = febonachi(n - 2);

        int feb = febonachi(n - 1) + febonachi(n - 2);

        //return febonachi(n-1)+febonachi(n-2);
        return feb;
    }


    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static int ears(int n) {
        if (n == 0) {
            return n;
        }

        if (n % 2 == 0) {
            return ears(n - 1) + 3;
        } else {
            return ears(n - 1) + 2;
        }

    }

    public static int count7(int n) {
        int c = 0;
        if (n < 7) {
            return 0;
        } else {
            if (n % 10 == 7) {
                c = 1;
            } else {
                c = 0;
            }
        }
        return c + count7(n / 10);

    }


    public static int array11(int[] array, int index) {

        int le = array.length - index;

        if (le == 0) {
            return 0;
        }

        int count = array11(array, index + 1);

        if (array[index] == 11) {
            count = count + 1;

        }

        return count;

    }

    public static int count8(int n) {

        int count;
        if (n < 8) {
            return 0;
        }
        if (n % 10 == 8) {
            count = 1;
        } else {
            count = 0;
        }

        return count + count8(n / 10);


    }

}



