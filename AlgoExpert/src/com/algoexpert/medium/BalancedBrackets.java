package com.algoexpert.medium;

import java.util.Arrays;
import java.util.Stack;


/**
 * Stack is the most appropriate data structure to use it for this.
 * There are multiple cases which one needs to take care of or rather your brackets are not balanced or imbalanced
 *  - if stack is empty and encounter a closing bracket
 *  - if you have traversed the the input and still the stack is not empty
 *  - if the pattern of opening and closing doesn't match
 *
 */

public class BalancedBrackets {


    private static Stack<Character> characterStack=new Stack<>();


    private static boolean checkBalance(String input)
    {
        for(int index=0;index<input.length();index++)
        {
            Character ch=input.charAt(index);
            if(ch.equals('(')|| ch.equals('{') || ch.equals('['))
            {
                characterStack.push(ch);

            }
            else if(ch.equals(')')|| ch.equals('}') || ch.equals(']'))
            {
                if(characterStack.empty())
                    return false;

                Character popedChar= characterStack.pop();
                String combinator = ""+popedChar+ch;
                if(combinator.equals("()") || combinator.equals("{}") || combinator.equals("[]"))
                {

                }
                else
                    return false;
            }
        }
        if(characterStack.empty())
        return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String input ="[{[]}]{[()]}[[]]";
        boolean flag=checkBalance(input);
        System.out.println(flag);
    }
}
