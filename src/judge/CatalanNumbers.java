package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CatalanNumbers {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        BigInteger resultN=BigInteger.ONE;
        BigInteger resultNplus1=BigInteger.ONE;
        BigInteger result2N=BigInteger.ONE;
        for (int i = 1; i <= n+1; i++) {
            resultNplus1=resultNplus1.multiply(BigInteger.valueOf(i));
        }for (int i = 1; i <= n; i++) {
            resultN=resultN.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= 2*n; i++) {
            result2N=result2N.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result2N.divide(resultN.multiply(resultNplus1)));
    }
}
