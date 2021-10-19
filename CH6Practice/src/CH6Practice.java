/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */

public class CH6Practice {

    /**
     * @param args the command line arguments
     */
public static double multAdd(double a, double b, double c){
    double sum = a * b + c;
    return sum;
}
    
public static void main(String[] args) {
     		double a1 = Math.cos(Math.PI/4.0);
		double b1 = 1.0/2.0;
		double c1 = Math.sin(Math.PI/4.0);
		System.out.print ("sin(pi/4) + cos(pi/4)/2 = ");
		System.out.println(multAdd (a1, b1, c1)); 
}


    
}
