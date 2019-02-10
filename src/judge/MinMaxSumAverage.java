package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMaxSumAverage {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        double[]arr=new double[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Double.parseDouble(rd.readLine());
        }
        double min=Double.MAX_VALUE;
        double max=-Double.MAX_VALUE;
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }if(max<arr[i]){
                max=arr[i];
            }
            sum+=arr[i];
        }
        System.out.printf("%s=%.2f%n", "min",min);
        System.out.printf("%s=%.2f%n", "max",max);
        System.out.printf("%s=%.2f%n", "sum",sum);
        System.out.printf("%s=%.2f%n","avg", sum/n);

    }
}
