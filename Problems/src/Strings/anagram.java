package Strings;

import java.util.HashMap;
import java.util.Map;

public class anagram {
    public static void main(String[] args) {
        String  s = "anagram", t = "nagaram";
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!map.containsKey(ch))
                map.put(ch,1);
            else
            {
                map.put(ch,map.get(ch)+1);
            }

        }

        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(!map.containsKey(ch))
            {
                System.out.println(false);
                 return;
            }
            map.put(ch,map.get(ch)-1);

        }
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            if(set.getValue()>0)
            {
                System.out.println(false);
                return;
            }

        }
        System.out.println(true);
        return;


    }
}
