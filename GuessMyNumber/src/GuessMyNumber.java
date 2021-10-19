/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main (String[]args){
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        guess(number);
    }
    public static void guess(int number) {
       
        Scanner in = new Scanner(System.in);
        
        System.out.println("Guess a number between 0 and 100");
        int x = in.nextInt();
        
        if (x == number){
            System.out.println("You guessed it! it's " + number + "!");
        }
        else if (x > number){
            if (x - 50 > number) {
                System.out.println("You're waaaay too high! Guess again!");
                guess(number);
            }
            else if (x - 25 > number){
                System.out.println("You're quite a bit too high, guess again!");
                guess(number);
            }
            else if (x - 10 > number){
                System.out.println("You're too high, guess again.");
                guess(number);
            }
            else{
                System.out.println("you're just a tad too high! Guess again!");
                guess(number);
            }
        }
        else{
            if (x + 50 < number) {
                System.out.println("You're waaay too low! Guess again!");
                guess(number);
            }
            else if (x + 25 < number){
                System.out.println("You're too low, guess again!");
                guess(number);
            }
            else if (x + 10 < number){
                System.out.println("You're too low, guess again.");
                guess(number);
            }
            else{
                System.out.println("You're just a tad too low, guess again!");
                guess(number);
            }
        }
    }
    
}
