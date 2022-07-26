/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Mustafa Alhelawe
 *  netID: mma244
 *  email: mma244@scarletmail.rutgers.edu
 *
 *************************************************************************/

public class RecursiveAppend 
{

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) 
    {
        if (n == 0)
        {
            return original;
        }
        else
        {
            return original + appendNTimes(original, n - 1);
        }
    }

    public static void main (String[] args) 
    {
    
    }
}
