package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToDecimal {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String input= rd.readLine();
        long res=0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='1'){
                res+=Math.pow(2,input.length()-i-1);
            }
        }
        System.out.println(res);
    }
}
