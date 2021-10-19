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
public class TwoLoops {

    /*
    *Displays conversion table gallons to liters
    */
    public static void volumeTable(){
        //Display header
        System.out.println("Gallons\tLiters");
        System.out.println("---------------");
        
        //Statements
        double Gallons = 1.0;
        double Liters;
        
        //for loop
        for ( ;Gallons <20.0;Gallons++){
            Liters = Gallons * 3.78541;
            System.out.printf("%.1f\t%.1f\n", Gallons, Liters);
        }
    }
    
    /*
    *Outputs amount of negative numbers user enters.
    */
    public static void numberOfNegatives(){
        //Statements
        Scanner in = new Scanner(System.in);
        boolean keepgoing = true;
        int NegCount = 0;
        
        //While statement
        while (keepgoing){
            System.out.print("\n\nEnter as many positive or negative integers as you"
                    + " like. Press 0 to end.");
            int input = in.nextInt();
            if (input < 0 ){
                NegCount++;
          } else if (input == 0){
              keepgoing = false;
            }
        }
        System.out.printf("You entered %d negative numbers.\n", NegCount);
    }
    
    
    /**
     * invokes assignment's methods.
     */
    public static void main(String[] args) {
        volumeTable();
        numberOfNegatives();
    }
}
    
