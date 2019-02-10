package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubsetOfSumSWithRecursion {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int s=Integer.parseInt(rd.readLine());
        String[]input=rd.readLine().split(" ");
        int[]arr=new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i]=Integer.parseInt(input[i]);
        }
        if(isThereExistSubsetWithSumS(0,arr,s)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    public static boolean isThereExistSubsetWithSumS(int start,int[]arr,int s){
        if(s==0){
            return true;
        }if(start>=arr.length){
            return false;
        }if(isThereExistSubsetWithSumS(start+1,arr,s-arr[start])){
            return true;
        }
        return isThereExistSubsetWithSumS(start+1,arr,s);
    }
}
