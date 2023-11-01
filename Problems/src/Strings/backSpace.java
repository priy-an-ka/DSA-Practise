package Strings;

public class backSpace {
    public static void main(String[] args) {
        String s= "a##b", t = "c#d#"; // a##
        StringBuilder ss = new StringBuilder("");
        StringBuilder st = new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            char cur=s.charAt(i);
            if(cur!='#') {
                ss.append(cur);

            }
            else
            {
                if(ss.length()==0)
                    continue;
                else
                {
                    ss.deleteCharAt(ss.length()-1);
                }
            }
        }
        System.out.println(ss);
//        for(int i=0;i<st.length();)
//        {
//            char ch=st.charAt(i);
//            if(ch=='#')
//            {
//                st.deleteCharAt(i);
//                st.deleteCharAt(i-1);
//            }
//            else
//            {
//                i++;
//            }
//
//
//        }
       // System.out.println(ss.toString().equals(st.toString()));

    }
}
