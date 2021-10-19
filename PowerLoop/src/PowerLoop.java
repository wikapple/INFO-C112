/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author wikap
 */
public class PowerLoop {

    /**
     * @param args the command line arguments
     */
    public static void powerLoop() {
        Scanner in = new Scanner(System.in);
        int n;
        double x;
        System.out.println("Enter a number: ");
        x = in.nextDouble();
        System.out.println("Enter an exponent to use: ");
        n = in.nextInt();
        while (n >= 0) {
            if (n % 2 == 0){
                System.out.println(Math.pow(Math.pow(x, n/2),2));
            } else{
            System.out.println(x * Math.pow(x,n-1));
            }
            n = n-1;
            
        }
            
        }
    public static int factorial(int n){
        while (n>=0){
            
        int recurse = factorial(n-1);
        int result = n * recurse;
 }  System.out.println(result);
    }
    
    public static void main(String[] args){
        
        
    }
    
}
