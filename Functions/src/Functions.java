/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class Functions {
    
    /** Is Divisible
     * Tests whether n is divisible by m.
     * 
     * @param m and n integers to test
     * @return true if n is divisible by m, false otherwise 
     */
    public static boolean isDivisible(int n, int m){
        return n % m == 0;
    }
    
    /** isTriangle
     * Tests whether length if a, b and c could form triangle.
     * 
     * @param a tests if larger that b + c 
     * @param b tests if larger than a + c
     * @param c tests if larger than a + b
     * @return true if all three sides are larger than the sum or the other two. 
     * false otherwise.
     */
    public static boolean isTriangle(int a, int b, int c){
        return a <= b + c && b <= a + c && c <= a + b;
    }
    
    /** multAdd
     *  Multiplies two parameters and adds a third.
     * @param a multiplied with b, sum added to c
     * @param b multiplied with a, sum added to c
     * @param c added to sum of a * b.
     * @return returns sum of parameters.
     */
    public static double multAdd(double a, double b, double c){
        double sum = a * b + c;
        return sum;
    }
    
    /** expSum
     * Assignment of variables to be invoked in multAdd
     * @param x Solves for x.
     * Uses multAddMethod
     * @return Returns multAdd value to main. 
     */
    public static double expSum(double x){
        double a = x;
        double b = Math.exp(-x);
        double c = Math.sqrt(1 - Math.exp(-x));
        return multAdd(a,b,c);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //6.2
        //Testing isDivisble true
        System.out.printf("Is 8 divisble by 4? %s\n", isDivisible(8,4));
        //Testing isDivisible False
        System.out.printf("Is 9 divisible by 4? %s\n\n", isDivisible(9, 4));
        
    //6.3
        //Testing isTriangle true
        System.out.printf("Can lengths 4, 5 and 6 units form a triangle? %s\n", 
                isTriangle(4, 5, 6));
        //Testing isTriangle false
        System.out.printf("Can lengths 4, 4, and 9 units form a triangle? %s\n\n"
                ,isTriangle(4, 4, 9));
        
    //6.4
        //Testing multAdd
        System.out.printf("1.0 * 2.0 + 3.0 = %.1f\n", multAdd(1.0, 2.0, 3.0));
        
        //Testing trig queston using multAdd
        System.out.printf("sin(Pi/4) + cos(Pi/4)/2 = %f\n", multAdd(Math.cos
        (Math.PI/4.0), 0.5, Math.sin(Math.PI/4.0)));
        
        //Testing logarithm question using MultAdd
        System.out.printf("log(10) + log(20) = %f\n\n", multAdd(1.0, 
                Math.log10(10), Math.log10(20)));
        
        //Testing euler's number question using expSum and multAdd
        System.out.printf("xe^-x + squareroot of (1 - e^-x) = %f\n", expSum(2));
    //end
    }
    
    
    
}
