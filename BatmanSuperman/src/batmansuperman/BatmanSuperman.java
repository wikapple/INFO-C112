/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batmansuperman;

/**
 *
 * @author wikap
 */
import java.util.Scanner;

public class BatmanSuperman {
     public static double inputStatements(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to guess the square root of:\n");
        double a = in.nextDouble();
        formula(a);
        return a;
}
     
     public static void formula(double a){
     Scanner in = new Scanner(System.in);
      Double guess = -2.0;
while (guess != Math.sqrt(a)){
     System.out.println("Guess what the square root is of" + a);
     guess = in.nextDouble();
     double approximation = (guess + a/guess)/2;
     if (approximation == Math.sqrt(a)){
         System.out.println("You guessed it! the square root is " + approximation);
         continue;
    }else{
     System.out.println("The square root is closer to:" + approximation);
}
     }}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputStatements();
        
        
        
    }
    
}
