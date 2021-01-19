package LAB6;

import java.util.StringTokenizer;
public class ex_StringToken {

    public static void main(String[] args) {
        String msg = "I work at  RUTS, Nakornsithammarat,Thailand.";
        StringTokenizer token = new StringTokenizer(msg);

        //count word
        System.out.println("word in message:"+token.countTokens());

        while (token.hasMoreElements()){
            System.out.println(token.nextToken());
        }






    }
}
