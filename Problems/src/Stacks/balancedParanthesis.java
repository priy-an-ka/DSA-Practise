package Stacks;

import java.util.ArrayList;

public class balancedParanthesis {
    static int top=-1;
    static ArrayList<Character> braces = new ArrayList<>();
    public static void push(char ch)
    {
        braces.add(ch);
        top++;

    }

    public static void pop()
    {
         braces.remove(top);
         top--;
    }


    public static int solve(String A) {
        char ch;
        for(int i=0;i<A.length();i++)
        {
            ch = A.charAt(i);
            if(top==-1 && ch==')')
            {
                return 0;
            }

            if(ch=='(')
                push(ch);
            if(ch==')')
                pop();
        }

        if(top==-1)
            return 1;
        else
            return 0;

    }

    public static void main(String args[]) {

        String A="((()))(";
        int res = solve(A);
        if(res==1)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");



    }
}
