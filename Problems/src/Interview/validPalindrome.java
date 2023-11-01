package Interview;

import java.util.Locale;

public class validPalindrome {

    public static boolean validatePalindrome(String str) {

        int start=0, end=str.length()-1;
        while(start<end)
        {
            if(str.charAt(start)==str.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                return false;
            }

        }
        return true;

    }


    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String alphanum="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int val=(int)c;
            if(val>=97&&val<=122)
                alphanum+=c;
        }
        return validatePalindrome(alphanum);

    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
