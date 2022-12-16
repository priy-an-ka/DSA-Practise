package Recursion;

public class duplicateAdjacentCharacters {

    public static String duplicateRemoval(String str, int index, String output)
    {

        if(index==str.length()-1)
            return output+str.charAt(index);
        if(str.charAt(index)==str.charAt(index+1))
        {
            return duplicateRemoval(str,index+1,output);
        }
        else
        {
            output=output+str.charAt(index);
            return duplicateRemoval(str,index+1, output);

        }


    }
    public static void main(String args[])
    {
        String str = "aaaaaaaaaaaaaa";
        int index = 0;
        String output="";
        System.out.println(duplicateRemoval(str, index, output));
    }
}
