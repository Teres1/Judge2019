package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LongestSequenceOfEqual {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        short n = Short.parseShort(rd.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(rd.readLine().trim()));
        }
        int count=0;
        int max=0;
        int start=list.get(0);
        for(int i:list){
            if(i==start){
                count++;
            }else{
                start=i;
                count=1;
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
    }
}
