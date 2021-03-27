package com.company;
import java.util.*;

public class Main2 {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<Character>();
        Stack<Character> compare = new Stack<Character>();
        for (char c : S.toCharArray()){

            if (stack.isEmpty() || compare.isEmpty()){
                stack.push(c);
                compare.push(c);
            }
            else {
                if (c != compare.peek()){
                    stack.push(c);
                    compare.push(c);
                }
                else {
                    stack.pop();
                    compare.pop();
                }
            }
        }
        String s = "";
        while (!stack.empty()){
            s+=stack.pop();
        }
        StringBuffer sbr = new StringBuffer(s);
        sbr.reverse();
        return sbr.toString();
    }
}

