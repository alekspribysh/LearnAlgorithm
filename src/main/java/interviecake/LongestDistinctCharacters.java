package interviecake;

/**
 * Created by aprybysh on 8/19/16.
 */
public class LongestDistinctCharacters {

    public static void main(String[] args) {
        String s = "abababcdefababcdab";
        //String s ="geeksforgeeks";
       // String s = "abcabcd";

        System.out.println(strin(s));
    }


    public static int strin(String s) {

        String temp = "";
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            boolean b = true;

            if (temp.length() == 0) {

                temp = "" + s.charAt(i);

                b = false;
            }

                int k = temp.length() - 1;
                while (k >= 0) {

                    if (temp.charAt(k) == s.charAt(i)) {

                        b = false;

                        if (temp.length() > str.length()){

                            str = temp;
                        }

                        temp = "";


                    }

                    k--;
                }

                if (b) {

                    temp += s.charAt(i);
                }



        }

        return str.length();
    }

}
