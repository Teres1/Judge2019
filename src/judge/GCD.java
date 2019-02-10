package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String []input=rd.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b=Integer.parseInt(input[1]);
        System.out.println(gcd(a,b));
    }
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }
}
