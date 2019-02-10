package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestIncreasingSequene {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(rd.readLine());
        }
        int start=arr[0];
        int count=1;
        int maxCount=1;
        for (int i = 1; i < n; i++) {
            if(start<arr[i]){
                count++;
                start=arr[i];
            }else{
                count=1;
                start=arr[i];
            }
            if(maxCount<count){
                maxCount=count;
            }
        }
        System.out.println(maxCount);
    }
}
