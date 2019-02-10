package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Tribonacci {
    public static void main(String[]args)throws IOException{
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        BigInteger t1=new BigInteger(rd.readLine());
        BigInteger t2=new BigInteger(rd.readLine());
        BigInteger t3=new BigInteger(rd.readLine());
        int n=Integer.parseInt(rd.readLine());
        for (int i = 0; i < n-3; i++) {
            BigInteger t4 = t1.add(t2).add(t3);
            t1=t2;
            t2=t3;
            t3=t4;
        }
        System.out.println(t3);
    }
}
