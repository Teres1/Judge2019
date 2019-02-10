package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintDeck {
        public static void main(String[]args)throws IOException {
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            String input= rd.readLine();
            String []arr={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
            int n=0;
            for (int i = 0; i < arr.length; i++) {
                if(input.equals(arr[i])){
                    n=i;
                }
            }
            for (int i = 0; i < n+1; i++) {
                System.out.println(arr[i] +" of spades, "+ arr[i] +" of clubs,"
                +arr[i]+ " of hearts, "+arr[i]+ " of diamonds");
            }
    }
}
