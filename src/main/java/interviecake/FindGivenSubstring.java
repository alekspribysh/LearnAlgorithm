package interviecake;

/**
 * Created by aprybysh on 8/19/16.
 */
public class FindGivenSubstring {


    public static void main(String[] args) {
        String s = "abcdegabcabccabciii";

        String sub = "abc";

        System.out.println(str(s, sub));
    }



    public static int str (String s, String sub){

        int count = 0;

        for (int i  =0; i <s.length(); i++ ){
            String temp = "";
            int k = i ;

            while(k -i < sub.length() && k < s.length()){

                temp += s.charAt(k);
                if(temp.equals(sub)) count +=1;
                k++;
            }

        }
        return count;
    }
}
