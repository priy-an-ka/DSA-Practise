package Interview;

import java.util.Stack;

public class validParathesis {
    public static void main(String[] args) {
        String s= "{[]}";
        Stack<Character> stck = new Stack<>();
        int count=0;
        while(count<s.length())
        {
            char ch= s.charAt(count);
            if(ch=='(' || ch=='{'||ch=='[')
            {
                stck.push(ch);
            }
            else
            {
                if(!stck.isEmpty())
                {
                    char popped = stck.pop();
                    if((popped == '(' && ch == ')') ||
                            (popped == '{' && ch == '}') ||
                            (popped == '[' && ch == ']')){
                        count++;
                        continue;
                    }

                    else
                        System.out.println(false);
                        return;
                }
                else
                {
                    System.out.println(false);
                    return;
                }


            }

            count++;
        }
        System.out.println(stck.isEmpty());

    }
}
