package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] input = rd.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int count = 0;
        GoodNumbers gn = new GoodNumbers();
        for (int i = a; i < b + 1; i++) {
            if (gn.checkIsAGoodNumber(i + "")) {
                count++;
            }
        }
        System.out.println(count);
    }

    private boolean checkIsAGoodNumber(String num) {
        int n = Integer.parseInt(num);
        String num1 = num.replaceAll("0", "");
        boolean isGood = true;
        for (int i = 0; i < num1.length(); i++) {
            if (n % (num1.charAt(i) - '0') != 0) {
                isGood = false;

            }
        }
        return isGood;
    }
}
