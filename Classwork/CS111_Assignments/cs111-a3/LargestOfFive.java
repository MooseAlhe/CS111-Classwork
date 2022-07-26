/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Mustafa Alhelawe
 *  email: mma244@scarletmail.rutgers.edu
 *  netID: mma244
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive 
{

    public static void main (String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        int a = Integer.parseInt(args[3]);
        int b = Integer.parseInt(args[4]);
        int max;

        if (x > y)
            max = x;
        else
            max = y;
        if (z > max)
            max = z;
        if (a > max)
            max = a;
        if (b > max)
            max = b;

        System.out.println(max);

        
    }
}