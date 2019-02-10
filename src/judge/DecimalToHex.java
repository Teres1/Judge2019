package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToHex {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(rd.readLine());
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            if (n % 16 == 1) {
                result.insert(0, 1);
            } else if (n % 16 == 0) {
                result.insert(0, 0);
            } else if (n % 16 == 2) {
                result.insert(0, 2);
            } else if (n % 16 == 3) {
                result.insert(0, 3);
            } else if (n % 16 == 4) {
                result.insert(0, 4);
            } else if (n % 16 == 5) {
                result.insert(0, 5);
            } else if (n % 16 == 6) {
                result.insert(0, 6);
            } else if (n % 16 == 7) {
                result.insert(0, 7);
            } else if (n % 16 == 8) {
                result.insert(0, 8);
            } else if (n % 16 == 9) {
                result.insert(0, 9);
            } else if (n % 16 == 10) {
                result.insert(0, "A");
            } else if (n % 16 == 11) {
                result.insert(0, "B");
            } else if (n % 16 == 12) {
                result.insert(0, "C");
            } else if (n % 16 == 13) {
                result.insert(0, "D");
            } else if (n % 16 == 14) {
                result.insert(0, "E");
            } else if (n % 16 == 15) {
                result.insert(0, "F");
            }
            n /= 16;
        }
        System.out.println(result);

    }
}
