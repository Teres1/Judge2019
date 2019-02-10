package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kra4komer {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        Kra4komer km=new Kra4komer();
        System.out.println(km.transformMilesInMeters(n));

    }
    private int transformMilesInMeters(int miles){
        return miles*1609;
    }
}
