package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SubsetWithSumS {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(rd.readLine());
        String[] input = rd.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        int sum = 0;
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - i - 1];
        }
        boolean isYes=false;
        for (int i = 0; i < arr.length-1; i++) {
            sum = arr2[i];
            for (int j = i+1; j < arr.length; j++) {
                if (sum + arr2[j] <= s) {
                    sum += arr2[j];
                    if (sum == s) {
                        isYes = true;
                        break;
                    }
                }else {
                    continue;
                }
            }
        }
        if (isYes) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

