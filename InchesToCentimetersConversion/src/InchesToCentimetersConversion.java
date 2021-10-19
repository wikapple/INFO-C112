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

public class InchesToCentimetersConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int inch;
        double cm;
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many inches? ");
        inch = in.nextInt();
        
        final double CM_PER_INCH = 2.54;
        cm = inch * CM_PER_INCH;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");
        
        

        
    }
    
}
