package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryDigitsCount {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String input = rd.readLine();
        char b = input.charAt(0);
        int n = Integer.parseInt(rd.readLine());
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(rd.readLine());
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = Long.toString(arr[i], 2);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == b) {
                    count++;

                }
            }
            System.out.println(count);
            count=0;
        }
    }
}
