package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(rd.readLine());
        DecimalToBinary db=new DecimalToBinary();
        System.out.print(db.decimalToBinary(n));
    }
    private String decimalToBinary(long num){
        StringBuilder res=new StringBuilder();
        while(num>0){
            res.insert(0,num%2);
            num/=2;
        }
        return res.toString();
    }
}
