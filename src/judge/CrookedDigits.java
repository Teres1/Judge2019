package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrookedDigits {
    public static void main(String[]args)throws IOException{
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        String n=rd.readLine().replaceAll("\\-","")
                .replaceAll("\\.","");
        while(n.length()>1){
            int sum=0;
            for (int i = 0; i < n.length(); i++) {
                sum+=n.charAt(i)-48;
            }
            n=sum+"";
        }
        System.out.println(n);
    }
}
