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

public class CelsiusFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare variables
        double F;
        double C;
        Scanner in = new Scanner (System.in);
        
        //Input
        System.out.print("Enter temperature in Celsius.");
        C = in.nextDouble();
        
        //alogrithm
        F = (C * 9.0 / 5.0) + 32.0;
        
        //output
        System.out.print(C + " Celsius = ");
        System.out.printf( "%.1f Fahrenheit", F);
        System.out.println();
    
}}
