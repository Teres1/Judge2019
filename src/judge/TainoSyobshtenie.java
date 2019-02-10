package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TainoSyobshtenie {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String s=rd.readLine();
        StringBuilder res=new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)<='z'&&s.charAt(i)>='a'||s.charAt(i)>='A'&&s.charAt(i)<='Z' ){
                res.append(s.charAt(i));
            }
        }
        System.out.print(res.toString());
    }
}
