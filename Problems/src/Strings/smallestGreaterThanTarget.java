package Strings;

public class smallestGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters  = {'b','f','j'} ;
        char target= 'p';
        int targ = (int)target;
        int maxTarg= Integer.MAX_VALUE;
        int ascii=-1;

        for(int i=0;i<letters.length;i++)
        {
            ascii = (int)letters[i];
            if(ascii<=targ)
                continue;

            if(ascii>targ && ascii<maxTarg)
            {
                maxTarg = ascii;
                ascii=-1;
                break;
            }
        }
        if(ascii==-1)
            System.out.println( (char)maxTarg);
        else
            System.out.println( letters[0]) ;

    }
}
