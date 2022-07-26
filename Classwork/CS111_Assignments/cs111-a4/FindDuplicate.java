import java.beans.SimpleBeanInfo;

/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Mustafa Alhelawe
 *  netId: mma244
 *  email: mma244@scarletmail.rutgers.edu
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate 
{

	public static void main(String[] args) 
	{

		boolean duplicate = false;
		int arr[];
		arr = new int[args.length];
		for(int i = 0; i < args.length; i++)
		{
			arr[i] = Integer.parseInt(args[i]);
		}
		for(int i = 0; i < args.length; i++)
		{
			for(int j = i + 1; j < args.length; j++)
			{
				if (arr[i] == arr[j])
					duplicate = true;
			}
		}
			System.out.println(duplicate);
	}
}
