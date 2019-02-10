package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixOfNumbers {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n+i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
