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

public class TimeMethods {

    /**
     * @param args the command line arguments
     */
    
    public static void americanTime(String day, int date, String month, int year){
        System.out.print("American Format: ");
        System.out.println(day + ", " + month + " " + date + ", " + year + ".");
        
        
    }
    
    public static void europeanTime(String day, int date, String month, int year){
        System.out.print("European Format: ");
        System.out.println(day + ", " + date + " " + month + " " + year + ".");
        
        
    }
    
    public static void main(String[] args) {
        int date, year;
        String day, month;
        Scanner in = new Scanner(System.in);
        System.out.println("What day of the week is it?");
        day = in.nextLine();
        System.out.println("What month is it?");
        month= in.nextLine();
        System.out.println("What is the date of the month?");
        date = in.nextInt();
        System.out.println("What year is it?");
        year = in.nextInt();
        americanTime (day, date, month, year);
        europeanTime (day, date, month, year);
        
        
        
    }
    
}
