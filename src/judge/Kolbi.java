package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kolbi {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[]input=rd.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        long quantity=Long.parseLong(input[1]);
        long []arr=new long[n];
        int number=0;
        arr[0]=0;
        arr[1]=1;
        for (int i = 1; i < n-1; i++) {
            arr[i+1]=arr[i]+i+1;
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>=quantity){
                if(i%2==0) {
                    number = i + 1;
                    break;
                }else{
                    number=i+2;
                    break;
                }
            }
        }
        System.out.println(number);
    }
}
