package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        byte n = Byte.parseByte(rd.readLine());
        double x=Double.parseDouble(rd.readLine());
        double res=1;
        for (int i = 1; i <n+1 ; i++) {
           res+=factorial(i)/Math.pow(x,i);
        }
        System.out.printf("%.5f",res);

    }
    private static long factorial(int num){
        long res=1;
        for (int i = 1; i <num+1 ; i++) {
            res*=i;
        }
        return res;
    }
}
