package Interview;

import javax.swing.tree.TreeNode;
import java.util.*;

public class LongestSubstringWithoutRepeatChar {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength=0, length=0, left=0, right=0;
        char ch=' ';
        String sub="";
        length=1;

        for(right=0;right<s.length();right++)
        {
            ch=s.charAt(right);
            if(!set.contains(ch))
            {
                set.add(ch);
                maxLength = (int) Math.max(maxLength, right-left+1);

            }
            else {
                while(s.charAt(left)!=s.charAt(right))
                {
                    set.remove(s.charAt(left));
                    left++;

                }
                set.remove(s.charAt(left));
                left++;
                set.add(ch);

            }
        }
//        List<Integer> arr= new ArrayList<>();
//        List<List<Integer>> output= new ArrayList<>();
//
//        arr.add(1);
//        output.add(arr);
//        arr = new ArrayList<>();
//        arr.add(10);
//        output.add(arr);
//
//


        return maxLength;



    }


    public static void main(String[] args) {
        String str="abcdabcdefga";
        System.out.println(lengthOfLongestSubstring(str));

    }



}
