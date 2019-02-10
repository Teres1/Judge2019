package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MostFrequent {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(rd.readLine());
        }
        int[]count=new int[10000];
        for (int i = 0; i <10001 ; i++) {
            for (int j = 0; j < n; j++) {


                if (i==arr[j]){
                    count[i]++;
                }
            }
        }
        int counter=0;
        int number=0;
        for (int i = 0; i < count.length; i++) {
            if(counter<count[i]){
                counter=count[i];
                number=i;
            }
        }
        System.out.println(number+"("+counter+" times)");
    }
}
