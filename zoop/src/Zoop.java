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

public class Zoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String y, z;
        int x = 11;
        Scanner in = new Scanner(System.in);
        
        System.out.println("What was the name of your first pet?");
        y = in.nextLine();
        System.out.println("What is the name of the street that you grew up on?");
        z = in.nextLine();
        
        zoop(x,y,z);
    }
    public static void zoop(int x, String y, String z) {
        
        System.out.print(x);
        System.out.println(", " + y + ", " + z + ".");
    
}
}