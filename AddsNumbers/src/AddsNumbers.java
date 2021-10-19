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

public class AddsNumbers {

    
    
    /**
     * @param args the command line arguments
     */
    public static void wierdAddition (int x, int y){
        if (y < 20) {
            int total = y + x;
            System.out.println(total);
            y = y + 1;
            wierdAddition(x,y);
        }
        else if (x < 20){
            int total = y + x + y;
            System.out.println(total);
            x = x + 1;
            wierdAddition(x,y);
            
       }else {
                    System.out.println("done");
                    }
        
    }
   
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a completely random integer between 1 and 10\t");
        int x = in.nextInt();
        System.out.print("Enter another completely random integer between 1 and"
                + " 10\t");
        int y = in.nextInt();
        wierdAddition(x,y);
    }
    
}
