package Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CustomStack {
    static int top = -1;
    static ArrayList<Integer> stack = new ArrayList<>();
    static ArrayList<Integer> sorted =  new ArrayList<>();


    public static void push(int x) {

        stack.add(x);
        if(top==-1)
          sorted.add(x);
        else
        {
            if(x<=sorted.get(0))
            {
                sorted.add(x);
            }
        }
        top++;


    }

    public static void pop() {

        if(top==-1)
            return;
        if(stack.get(top)==sorted.get(0))
        {
            sorted.remove(0);
        }
        stack.remove(top);
        top--;

    }

    public static int top() {
        if(top==-1)
            return top;

        return stack.get(top);

    }

    public static int getMin() {
        if(top==-1)
            return top;

        return sorted.get(0);

    }
    public static void main(String args[])
    {
        push(10);
        push(12);
        push(9);
        for(int i=top;i>=0;i--)
            System.out.println(stack.get(i));
        System.out.println("min="+getMin());
        pop();
        for(int i=top;i>=0;i--)
            System.out.println(stack.get(i));
        System.out.println("min="+getMin());
        for(int i=top;i>=0;i--)
            System.out.println(stack.get(i));


//        push(2);
//        push(-2);
//        push(A);
//        for(int i=top;i>=0;i--)
//            System.out.println(stack.get(i));
//        getMin();
//        pop();
//        getMin();
//        top();
//        for(int i=top;i>=0;i--)
//            System.out.println(stack.get(i));


    }
}