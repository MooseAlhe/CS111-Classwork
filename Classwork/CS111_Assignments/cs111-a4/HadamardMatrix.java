/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author: Mustafa Alhelawe
 *  netId: mma244
 *  email: mma244@scarletmail.rutgers.edu
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix 
{

    public static void main(String[] args) 
    {

        int size = Integer.parseInt(args[0]);
        boolean[][] hadamard = new boolean[size][size];
        hadamard[0][0] = true;//first value is always true
       
        //converting the 2d array to hadamard matrix
        for (int k = 1; k < size; k += k) 
        {
            for (int i = 0; i < k; i++)
            {
                for (int j = 0; j < k; j++) 
                {
                    hadamard[i + k][j] = hadamard[i][j];//setting second row first column to true
                    hadamard[i][j + k] = hadamard[i][j];//setting first row second column to true
                    hadamard[i + k][j + k] = !hadamard[i][j];//setting second row second column to false
                }
            }
        }
       
        //printing the array
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                if (hadamard[i][j])
                    System.out.print("T ");
                else
                    System.out.print("F ");
            }
            System.out.println();
        }
    }
}
