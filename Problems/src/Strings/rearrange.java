package Strings;

public class rearrange {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        String word[] = new String[9];
        String words="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((int)ch>=48 && (int)ch<=57)
            {
                word[(int)ch-48-1]=words;
                words="";

            }
            else
            {
                if(ch!=' ')
                    words=words+ch;
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < word.length; i++) {
            if(word[i]!=null)
            {
                sb.append(word[i]);

            }
            if(i<word.length-1 && word[i+1]!=null)
            {
                sb.append(" ");
            }
        }
        String output = sb.toString();
        System.out.println(output);


    }
}
