package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotDivisibleNumber {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        for (int i = 1; i < n+1; i++) {
            if(i%3!=0&&i%7!=0){
                System.out.print(i+" ");
            }
        }
    }
}
