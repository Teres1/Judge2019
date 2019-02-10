package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class OddNumber {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        HashSet<Long>numbers=new HashSet<>();
        for (int i = 0; i < n; i++) {
            Long number=Long.parseLong(rd.readLine());
            if(numbers.contains(number)){
                numbers.remove(number);
            }
            else{
                numbers.add(number);
            }
        } System.out.println(numbers.toArray()[0]);
    }
}
