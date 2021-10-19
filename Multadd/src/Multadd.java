/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class Multadd {
    
    public static double multadd(double b, double c){
    return b + c;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double b = (Math.sin(3.14159/4));
        double c = ((Math.cos(3.14159/4))/2);
        System.out.println(multadd(b,c));
        System.out.println(b);
        System.out.println(c);
              
    }
    
}
