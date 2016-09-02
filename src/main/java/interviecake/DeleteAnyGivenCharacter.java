package interviecake;

/**
 * Created by aprybysh on 8/17/16.
 */
public class DeleteAnyGivenCharacter {

    public static void main(String[] args) {
        String input = "Hello world";

        char  a = 'o';
        remove(input, a);

    }


    public static void remove(String input, char c){

        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < input.length()){

            if (input.charAt(i) != c){

                 builder.append(input.charAt(i));
                i++;
            }
            else i++;

        }

        System.out.println(builder.toString());

    }
}
