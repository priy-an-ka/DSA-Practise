package Stacks;

import java.util.ArrayList;

public class balancedParanthesisAll {
    static int top=-1;
    static ArrayList<Character> braces = new ArrayList<>();
    public static void push(char ch)
    {
        braces.add(ch);
        top++;

    }

    public static int pop(char ch)
    {
        if( (ch==')' && braces.get(top)=='(') || (ch=='}' && braces.get(top)=='{') || (ch==']' && braces.get(top)=='['))
        {
            braces.remove(top);
            top--;
        }
        else
            return 0;
        return 1;

    }


    public static int solve(String A) {
        char ch;
        for(int i=0;i<A.length();i++)
        {
            ch = A.charAt(i);
            if(top==-1 && (ch==')' || ch=='}' || ch==']'))
            {
                return 0;
            }

            if(ch=='(' || ch=='{' || ch=='[' )
                push(ch);
            if(ch==')' || ch=='}' || ch==']' )
                pop(ch);
        }

        if(top==-1)
            return 1;
        else
            return 0;

    }

    public static void main(String args[]) {

        String A="{([})}";

        int res = solve(A);
        if(res==1)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");



    }
}
