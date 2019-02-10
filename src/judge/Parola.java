package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parola {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String []input=rd.readLine().split(" ");
        int k = Integer.parseInt(input[1]);
        StringBuilder s=new StringBuilder();
        for (int i =input[0].length()-1;i>=0; i--) {
            s.append(input[0].charAt(i));
        }
        int n=Integer.parseInt(s.toString());
        int result=n%k+n/k;
        System.out.println(result);
    }
}
