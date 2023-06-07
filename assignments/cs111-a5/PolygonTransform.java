/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Haseem Arshad
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
    
        double [] a = new double [array.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = array[i];
        }
        return a;
    }

    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
        
        for (int i = 0; i < x.length; i++) {
            x[i]*= alpha;
            y[i]*= alpha;
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

        for (int i = 0; i < x.length; i++) {
            x[i] += dx;
            y[i] += dy;
            
        }
            
     }    
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

        double b = theta*Math.PI/180;
        double sine = Math.sin(b);
        double cosine = Math.cos(b);
        for(int i = 0 ;i<x.length ; i++)
        {
        double dx =0,dy=0;
        dx = x[i]*cosine - y[i]*sine;
        dy = y[i]*cosine + x[i]*sine;
        x[i] = dx;
        y[i] = dy;
       }
    }


    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

        StdDraw.setScale(-5.0, 5.0);
         double[] x = { 0, 1, 1, 0 };
         double[] y = { 0, 0, 2, 1 };
         double xcopy[] = copy(x);
         double ycopy[] = copy(y);
         double alpha = 2.0;
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(xcopy, ycopy);
            scale(xcopy, ycopy, alpha);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(xcopy, ycopy);   
     }
}
