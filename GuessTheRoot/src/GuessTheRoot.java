/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */

//importing scanner
import java.util.Scanner;

public class GuessTheRoot {
    
    public static void testOne(double given){
        Scanner in = new Scanner(System.in);
        double guess, approximation;
    do{
        System.out.println("Guess the square root of " + given + ":");
        guess = in.nextDouble();
        
        approximation = (guess + given/guess)/2;
        System.out.println(approximation);
        
        }while (guess != Math.sqrt(given));
        
        System.out.println("You guessed it!");
        }
    
    public static void testTwo(double a){
        double x0, x1;
        x0 = a/2;
        System.out.println(x0);
        x1 = (x0 + a/x0)/2;
        System.out.println(x1);
        
    do{    
            x0 = x1;
            x1 = (x0 + a/x0)/2;
            System.out.println(x1);
     }    while (Math.abs(x1-x0) > .00001);
        }
            

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double given;
        
        System.out.println("Enter a number:");   //guessing the sqrt
        given = in.nextDouble();
        
        String answer;
        System.out.println("Do you want to guess or have system guess?");
        testTwo(given);
    }
       
}

