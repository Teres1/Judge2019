package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Calculate3 {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        int k = Integer.parseInt(rd.readLine());
        BigInteger nFact=BigInteger.ONE;
        BigInteger kFact=BigInteger.ONE;
        BigInteger nkFact=BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            nFact=nFact.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= k; i++) {
            kFact=kFact.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= n-k; i++) {
            nkFact=nkFact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(nFact.divide(nkFact.multiply(kFact)));

    }
}
