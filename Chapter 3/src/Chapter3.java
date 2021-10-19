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
public class Chapter3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declare and assign variables
        String SN;
        double Price;
        int amount;
        Scanner A = new Scanner(System.in);
        
        System.out.print("What is the part number?");
        SN = A.nextLine();
        System.out.print("How much does one part cost?");
        Price = A.nextDouble();
        System.out.print("How many are being purchased?");
        amount = A.nextInt();
        
        double total = Price * (double) amount;
        
        System.out.print("The total cost for ");
        System.out.print(amount);
        System.out.print(" of part ");
        System.out.print(SN);
        System.out.print(" at $");
        System.out.printf("%.2f",Price);
        System.out.print(" each is $");
        System.out.printf("%.2f", total);
        
        
        
        
        
        
        
    }
    
}
