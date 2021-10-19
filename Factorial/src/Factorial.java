/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class Factorial {

    
    /**
     * 
     * @param n
     * @return 
     */
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        int recurse = factorial(n-1);
        int result = n * recurse;
        return result;
    } 
    
    public static double factorialLoop(double n){
        double result=1.0;
        for (;n>0;n--){
           result = result * n;
        }
        return result;
    }
    
    public static double myexp(double x, double n){
        double sum = 0.0;
        for(;n>=0;n--){
            sum = sum + ((x * n)/factorialLoop(n));
    }    
        return sum;    
    }
    
    public static void check (double x, double n){
        System.out.printf("x =%.1f, myexp(x) = %f, Math.exp(x) = %f\n",x, myexp(x,n), Math.exp(x));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i <=10; i = i + 2)
        check(1,i);
        
    }
    
}
