package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiggestPrimeNumber {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        BiggestPrimeNumber biggestPrimeNumber=new BiggestPrimeNumber();
        for (int i = n; i >=0 ; i--) {
            if(biggestPrimeNumber.isPrime(i)){
                System.out.println(i);
                break;
            }
        }
    }
    public boolean isPrime(int num){
            for (int j = 2; j <=Math.sqrt(num); j++) {
                if(num%j==0){
                    return false;
            }
        }
        return true;
    }
}
