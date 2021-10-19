/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class FormattingOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("Four thirds = %.3f", 4.0/3.0); System.out.println();
        
        double pi = 3.14159;
        int x = (int) (pi * 20.0);
        System.out.println(x);
    }
    
}
