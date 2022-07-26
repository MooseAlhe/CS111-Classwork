/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Mustafa Alhelawe
 *  netID: mma244
 *  email: mma244@scarletmail.rutgers.edu
 *
 *************************************************************************/

public class PolygonTransform 
{


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) 
    {
        double[] newArray = new double[array.length];
        for(int i = 0; i < array.length; i++)
        {
            newArray[i] = array[i];
        }
        return newArray;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) 
    {
       for (int i = 0; i < x.length; i++)
       {
           x[i] *= alpha;
           y[i] *= alpha;
       }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) 
    {
        for (int i = 0; i < x.length; i++)
        {
            x[i] += dx;
            y[i] += dy;
        }
        
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) 
    {
        double rad = Math.toRadians(theta);
        double temp;
        for (int i = 0; i < x.length; i++)
        {
            temp = x[i];
            x[i] = x[i]*Math.cos(rad) - y[i]*Math.sin(rad);
            y[i] = y[i]*Math.cos(rad) + temp*Math.sin(rad);
        }
    
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) 
    {
  
    }
}
