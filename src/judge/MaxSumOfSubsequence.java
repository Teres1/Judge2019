package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSumOfSubsequence {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(rd.readLine());
        }
        int maxSum=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]+sum>0) {
                sum += arr[i];
            }else {
                sum = 0;
            }
            if(maxSum<sum){
                maxSum=sum;
            }
        }
        System.out.println(maxSum);
    }
}
