/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author: Haseem Arshad
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

        int v1 = Integer.parseInt(args[0]);
        int v2 = Integer.parseInt(args[1]);
        int v3 = Integer.parseInt(args[2]);
        int v4 = Integer.parseInt(args[3]);
        
        System.out.println((v1>v2 && v2>v3 && v3>v4) || (v1<v2 && v2<v3 && v3<v4)); 
    }
}
