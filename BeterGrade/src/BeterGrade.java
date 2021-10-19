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

public class BeterGrade {

    public static String numericalGradeToLetter(double numericalgrade){
        String lettergrade;
        if (numericalgrade >=90 && numericalgrade<=100){
            lettergrade="A";
    
        }else if (numericalgrade <90 && numericalgrade >=80){
            lettergrade="B";
       
       }else if (numericalgrade <80 && numericalgrade >=70) {
           lettergrade="C";
           
       }else if (numericalgrade < 70 && numericalgrade >=60){
            lettergrade="D";
            
       }else{
           lettergrade = "F";
       }
        return lettergrade;
    }
    
    
    public static String plusOrMinus (double numericalgrade){
        String symbol;
        double between0and10 = numericalgrade % 10;
        
        if (numericalgrade < 60){
            symbol = "";
        
       }else if (between0and10 > 7){
        symbol = "+";
        
       }else if (between0and10>=3){
        symbol = "";
        
       }else{
           symbol = "-";
      } 
        return symbol;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numericalgrade;
        System.out.println("Please Enter a Numerical Grade:");
        numericalgrade = in.nextDouble();
        numericalGradeToLetter(numericalgrade);
       
        System.out.printf("%.0f is a %s%s.\n", numericalgrade, 
                numericalGradeToLetter(numericalgrade), plusOrMinus(numericalgrade));
    }
    
}
