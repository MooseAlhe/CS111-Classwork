/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author: Mustafa Alhelawe
 *  netID: mma244
 *  email: mma244@scarletmail.rutgers.edu
 *
 *************************************************************************/

public class RunLengthEncoding 
{

    /* 
     * Encode the original string by finding sequences in the string
     * where the same character repeats. Replace each such sequence
     * by a token consisting of: the number of characters in the sequence
     * followed by the repeating character.
     * Return the encoded string.
     */
    public static String encode (String original)  
    {
        String newString = "";
        int counter = 1;
        int i = 0;
        while (i < original.length() - 1)
        {
            if (original.charAt(i) == original.charAt(i + 1))
            {
                counter++;
                i++;
            }
            else if (i == 0 && counter == 1)
            {
                newString += original.charAt(i);
                i++;
            }
            else if (counter == 1)
            {
                newString += original.charAt(i);
                i++;
            }
            else
            {
                newString += counter;
                counter = 1;
                newString += original.charAt(i);
                i++;
            }
        }
        if (counter > 1)
        {
            newString += counter;
        }
        newString += original.charAt(i);
        return newString;
    }

    /*
     * Decodes the original string encoded with the encode method.
     * Returns the decoded string.
     *
     * YOUR decode METHOD MUST BE RECURSIVE, do not use while, do/while, 
     * or for loops
     */
    public static String decode (String original)  
    {
        if (original.length() == 0)
        {
            return "";
        }
        
        if (Character.isDigit(original.charAt(0)))
        {
           int digit = original.charAt(0) - '0';
           if (digit == 0)
           {
               return decode(original.substring(2));
           }
           else
           {
                int prevDigit = digit - 1;
                return original.charAt(1) + decode(prevDigit + original.substring(1));
           }
        }
        else
        {
            return original.charAt(0) + decode(original.substring(1));
        }
        
    }

    public static void main (String[] args) 
    {
        System.out.println(decode(encode("qwwwwweeeeerrrrtttttyyyy")));
    }
}
