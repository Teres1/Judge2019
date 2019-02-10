package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sort {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] in = rd.readLine().split(" ");
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < in.length; i++) {
            list.add(Integer.parseInt(in[i]));
        }
        if (list.get(0) > list.get(1) && list.get(1) > list.get(2) && list.get(2) > list.get(3)) {
            System.out.println("Descending");
        }else if(list.get(0) < list.get(1) && list.get(1) < list.get(2) && list.get(2) < list.get(3)){
            System.out.println("Ascending");
        }else{
            System.out.println("Mixed");
        }
    }
}
