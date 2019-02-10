package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BracketsExpressions {
    public static void main(String[]args)throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String input = rd.readLine();
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='('){
                stack.push(i);

            }if(input.charAt(i)==')'){
                System.out.println(input.substring(stack.pop(),i+1));
            }
        }
    }
}
