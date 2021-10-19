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

public class ConvertFromSeconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variables
        double seconds;
        int Seconds;
        int minutes;
        int hours;
        Scanner sec = new Scanner (System.in);
        
        //Input
        System.out.print("How many seconds?");
        seconds = sec.nextInt();
        
        //Algorithms
        Seconds = ((int) (seconds % 60));
        hours = ((int) (seconds/60/60));
        minutes = ((int) ((seconds/60)%60));
        
        //Output
        System.out.printf("%.0f seconds = %d hours, %d minutes, %d seconds",
                seconds, hours, minutes, Seconds);
    }
    
}
