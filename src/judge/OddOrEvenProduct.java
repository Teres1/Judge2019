package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddOrEvenProduct {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        String []input=rd.readLine().split(" ");
        int []arr=new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(input[i]);
        }
        long oddProduct=1;
        long evenProduct=1;
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                oddProduct*=arr[i];
            }else{
                evenProduct*=arr[i];
            }
        }
        if(oddProduct==evenProduct){
            System.out.println("yes "+oddProduct);
        }else{
            System.out.println("no "+oddProduct+" "+evenProduct);
        }
    }
}
