package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddingPolynomials {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        String [] firstPolynomCoeff=rd.readLine().split(" ");
        int[]arr1=new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]=Integer.parseInt(firstPolynomCoeff[i]);
        }
        String [] secondPolynomCoeff=rd.readLine().split(" ");
        int[]arr2=new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i]=Integer.parseInt(secondPolynomCoeff[i]);
        }
        int[]result=new int[n];
        for (int i = 0; i < n; i++) {
            result[i]=arr1[i]+arr2[i];
        }
        for (int i = 0; i < n; i++) {

            System.out.print(result[i]+" ");
        }
    }
}
