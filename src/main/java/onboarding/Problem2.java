package onboarding;

import java.util.Stack;

public class Problem2 {
    private static Stack<Character> stack = new Stack<>();

    public static String solution(String cryptogram) {
        return decryptCode(cryptogram);
    }

    private static String decryptCode(String cryptogram){
        for(Character ch : cryptogram.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == ch)
                stack.pop();
            else
                stack.add(ch);
        }

        return convertStackToString();
    }

    private static String convertStackToString(){
        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

}
