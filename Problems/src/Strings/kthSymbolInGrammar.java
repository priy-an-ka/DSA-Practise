package Strings;

public class kthSymbolInGrammar {
    public static void main(String[] args) {
        int n=3;
        int k=3;
        char ch=' ';

        StringBuilder str = new StringBuilder("0");
        while(n>1)
        {
            StringBuilder nextStr = new StringBuilder("");
            for(int i=0;i<str.length();i++)
            {
                ch= str.charAt(i);
                if(ch=='0')
                {
                    nextStr.append("01");
                }
                else
                {
                    nextStr.append("10");
                }

            }
            str=new StringBuilder(nextStr);
            n--;

        }
        ch = str.charAt(k-1);
        System.out.println(Integer.parseInt(String.valueOf(ch)));
       //  0 01 0110

    }
}
