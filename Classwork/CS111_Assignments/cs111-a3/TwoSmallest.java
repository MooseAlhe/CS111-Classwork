/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author: Mustafa Alhelawe
 *  email: mma244@scarletmail.rutgers.edu
 *  netID: mma244
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest 
{

    public static void main(String[] args) 
    {
        double min1 = Double.parseDouble(args[0]); //first smallest
        double min2 = Double.parseDouble(args[1]); //second smallest
        double num;

        if (min1 > min2) //switches values
        {
            double temp = min1; 
            min1 = min2;
            min2 = temp;
        }
        for (int i = 2; i < args.length; i++) /* checks each argument in the command
                                                 line to see if it is smaller than 
                                                 the above values */   
        {
            num = Double.parseDouble(args[i]);
            if (num < min1)
            {
                min2 = min1;
                min1 = num;
            }
            else if (num < min2)
            {
                min2 = num;
            }
        }
        System.out.println(min1);
        System.out.println(min2);
    }

}
