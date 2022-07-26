/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Mustafa Alhelawe
 *  netId: mma244
 *  email: mma244@scarletmail.rutgers.edu
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker
{
     public static void main(String[] args)
     {

                int randomNumber = 0;
                double distanceBetweenPoints = 0.0;
                int x = 0;
                int y = 0;
                int number = Integer.parseInt(args[0]);
                int count = 0;
      
                System.out.println("(" + x + "," + y + ")");
                //Execute the condition
                while(count < number)
                {
                     //Get the random number between 1 and 4
                     randomNumber = (int) (Math.random()*4);
                     //if randomNumber is 1 then move east
                     if (randomNumber == 1)
                           x += 1;
                     //If the randomNumber is  2, move west
                     else if(randomNumber == 2)
                           x -= 1;
                     //If the randomNumber is 3, move north
                     else if (randomNumber == 3)
                           y += 1;
                     //If random number is 4, move south
                     else
                           //Move south
                           y -= 1;
                     //Print the new point
                     System.out.println("(" + x + "," + y + ")");
                     //Increment the count by "1'
                     count++;
                }
                //Calculate the Euclidean squared distance Between Points
                distanceBetweenPoints = (x)*(x) + (y)*(y);
                //Print the squared distance
                System.out.println("Squared distance = " +  distanceBetweenPoints);
    }
}


