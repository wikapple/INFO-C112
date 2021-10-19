/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class mathtraining {

    
    public static boolean test (double solution, int tester){
        if (solution == tester){
            return true;
        }else{ 
        return false;}
        }
    
    public static double equation (int x, int y){
        double squaredX = Math.pow(x, 2);
        double squaredY = Math.pow(y, 2);   
        double solution = squaredX - (2*x*y) + squaredY;
        System.out.println(solution);
        return solution;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int mustEqual = 0;
        double answer = equation(x,y);
        System.out.println(test(answer, mustEqual));
    }
    
}
