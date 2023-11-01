package Interview;
import java.util.HashMap;
import java.util.Iterator;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!map.containsKey(ch))
                map.put(ch,1);
            else
                map.replace(ch,map.get(ch)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(!map.containsKey(ch))
                return false;
            else
            {
                map.replace(ch,map.get(ch)-1);
                if(map.get(ch)==0)
                    map.remove(ch);
            }
        }

        return map.isEmpty();

    }

    public static void main(String[] args) {
        String s = "anagram", t = "naagaram";
        System.out.println(isAnagram(s,t));
    }
}
