/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */

import java.util.Scanner;

public class Celsius2Fahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declare
        double celcius, fahrenheit;
        Scanner in = new Scanner(System.in);
        
        
        // Output question
        System.out.println("What is the temperature in celcius?");
        
        // Assign value
        celcius = in.nextDouble();
        
        //Formula
        fahrenheit = ((double)celcius * 9.0 / 5.0 + 32.0);
        
        //Final Output
        System.out.printf("%.1f celcius = %.1f fahrenheit", celcius, fahrenheit);
        
    }
    
}
