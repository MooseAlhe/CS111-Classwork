

/*************************************************************************
 *  Compilation:  javac ISBNChecksum.java
 *  Execution:    java ISBNChecksum 020131452
 *
 *  @author: Mustafa Alhelawe
 *  email: mma244@scarletmail.rutgers.edu
 *  netID: mma244
 * 
 *  Takes a 9-digit integer as a command line argument, then computes
 *  and prints the checksum character
 *
 *  % java ISBNChecksum 020131452
 *  5
 *
 *  Print only the checksum character, nothing else.
 *
 *************************************************************************/

public class ISBNChecksum 
{

    public static void main (String[] args) 
    {
        int ISBN = Integer.parseInt(args[0]);
        int sum = 0;
        int digit;
        int checksum;

        for (int i = 2; i <= 10; i++)
        {
            digit = ISBN % 10;
            sum += (i * digit);
            ISBN /= 10;
        }
        if (sum % 11 == 1)
            System.out.println("X");
        else if (sum % 11 == 0)
            System.out.println("0");
        else 
        {
            checksum = 11 - (sum % 11);
            System.out.println(checksum);
        }
            
    }
}