package Recursion;

public class reverseStringRecursion {

    public static String reverseString(String str, int index)
    {
        if(index==str.length())
            return "";
        else
            return reverseString(str, index+1) + str.charAt(index);



    }
    public static void main(String args[])
    {
        String str = "Priyanka";
        int index = 0;
        System.out.println(reverseString(str, index));
    }
}
