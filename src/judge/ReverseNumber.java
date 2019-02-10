package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String num = rd.readLine();
        System.out.println(reverseNum(num));
    }
    private static String reverseNum(String num){
        if(num.length()==1){
            return num;
        }
        return reverseNum(num.substring(1))+num.charAt(0);
    }
}
