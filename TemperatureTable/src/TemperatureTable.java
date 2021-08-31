/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class TemperatureTable {

    /**
     * @param args the command line arguments
     */
    
    //fahrenheit = (celcius * 9.0 / 5.0 + 32.0);
    
    //method converts celcius to fahrenheit and outputs both.
    public static void outputTwoTemps (double degreesC){
        double degreesF = ((double)degreesC * 9.0 / 5.0 + 32.0);
        
        System.out.printf("%.1f \t \t %.1f \n", degreesC, degreesF);
        
        
        
        
    }
    public static void main(String[] args) {
        System.out.println("Degrees (C) Degrees (F)");
        double start = .0;
        outputTwoTemps(start);
        outputTwoTemps(start +5.0);
        outputTwoTemps(start + 10.0);
        outputTwoTemps(start + 15.0);
        outputTwoTemps(start +20.0);
        
    }
    
}
