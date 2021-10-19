/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class IOLAB {

    
   public static boolean isTriangle(int n, int m, int o){
         return n <= m + o && m <= n + o && o <= m + n;
       
   
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isTriangle(5,4,2));
       
        
    }
    
}
