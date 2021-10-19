/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
//importing classes
import java.util.Scanner;
import java.util.Random;

public class Branches {

    /**
     * @param args the command line arguments
     */
    public static void calculateSalary(){
        //declaring variables
        Double hourlyrate, hoursworked, salary;
        Scanner in = new Scanner(System.in);
        
        //taking input
        System.out.println("How many hours were worked?");
        hoursworked = in.nextDouble();
        System.out.println("What is the hourly rate?");
        hourlyrate = in.nextDouble();
        double overtime = (hourlyrate*1.5) * (hoursworked - 40);
        
        //if statement for overtime calculation
        if (hoursworked <= 40.0){
            salary = hoursworked * hourlyrate;
    }    else {
            salary = (overtime) + (hourlyrate * 40.0);    
    }
        
        //salary output
        System.out.printf("The weekly salary is %.2f\n", salary);
    }
    
    public static void guessNumber(){
        //declare variables
        int number, guess;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        number = random.nextInt(10) + 1;
        
        //taking input
        System.out.println("Please guess a number between 1 and 10.");
        guess = in.nextInt();
        
        //if statements
        if (guess == number) {
            System.out.println("You got it!");
        }
        else if (guess > number){
            System.out.printf("Too high! :(\n The number I was thinking of was"
                    + " %d.\n", number);
        }
        else {
        System.out.printf("Too low! :(\n The number I was thinking of was"
                    + " %d.\n", number);
        }
    }
            
    public static void main(String[] args) {
        calculateSalary();
        guessNumber();
    }
    
}
