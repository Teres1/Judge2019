package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexToDecimal {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String input = rd.readLine();
        long result = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'F':
                    result += 15*Math.pow(16,input.length()-i-1);
                    break;
                case 'E':
                    result += 14*Math.pow(16,input.length()-i-1);
                    break;
                case 'D':
                    result += 13*Math.pow(16,input.length()-i-1);
                    break;
                case 'C':
                    result += 12*Math.pow(16,input.length()-i-1);
                    break;
                case 'B':
                    result += 11*Math.pow(16,input.length()-i-1);
                    break;
                case 'A':
                    result += 10*Math.pow(16,input.length()-i-1);
                    break;
                case '9':
                    result += 9*Math.pow(16,input.length()-i-1);
                    break;
                case '8':
                    result += 8*Math.pow(16,input.length()-i-1);
                    break;
                case '7':
                    result += 7*Math.pow(16,input.length()-i-1);
                    break;
                case '6':
                    result += 6*Math.pow(16,input.length()-i-1);
                    break;
                case '5':
                    result += 5*Math.pow(16,input.length()-i-1);
                    break;
                case '4':
                    result += 4*Math.pow(16,input.length()-i-1);
                    break;
                case '3':
                    result += 3*Math.pow(16,input.length()-i-1);
                    break;
                case '2':
                    result += 2*Math.pow(16,input.length()-i-1);
                    break;
                case '1':
                    result += 1*Math.pow(16,input.length()-i-1);
                    break;
            }
        }
        System.out.println(result);
    }
}
