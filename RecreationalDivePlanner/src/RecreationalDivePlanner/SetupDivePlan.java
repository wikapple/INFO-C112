/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecreationalDivePlanner;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author wikap
 */
public class SetupDivePlan {
    
    public static DiveTrip fullDiveTripSetup(){
        String name = inputTripName();
        String date = inputDate();
        int dives = inputNumberOfDives();
        int divers = inputNumberOfDivers();
        ArrayList<String>diverNames =  inputDiverNames(divers);
        DiveTrip myDiveTrip = new DiveTrip(name, date, dives, divers, diverNames);
        return myDiveTrip;
    }
    

    public static String inputTripName(){
        Scanner in = new Scanner(System.in);
        String tripName;
        boolean nameLoop = true;
        String nameInput ="";
        
        while (nameLoop){
            System.out.println("What do you want to name your dive trip? (press enter to skip)");
            nameInput = in.nextLine();
            if (nameInput.length()< 25){
                nameLoop = false;
            }else{
                System.err.println("Invalid response, please make the name shorter");
            }
        }
        
        if (nameInput.equals("")){
            tripName = "My Dive Trip";
        }else{
            tripName = nameInput;
        }
        return tripName;
    }
    // 5/5/2020
    public static String inputDate(){
        Scanner in = new Scanner(System.in);
        boolean dateLoop = true;
        String dateInput = "";
        while (dateLoop){
            System.out.println("Enter the date of your dive. (mm/dd/yyyy)");
            dateInput = in.nextLine();
        
            if((dateInput.charAt(2) == '/')&& (dateInput.charAt(5) == '/')){
                dateLoop = false;
            }else if(dateInput.charAt(1)== '/' && (dateInput.charAt(4)== '/' || dateInput.charAt(3) == '/')){
                dateLoop = false;
            }else{
               System.err.println("Invalid date format"); 
        }
        }
        return dateInput;
    }
    
    public static int inputNumberOfDivers(){
        Scanner in = new Scanner(System.in);
        int numberOfDivers = 0;
        boolean diversLoop = true;
        while(diversLoop){
            System.out.println("How many people are diving?");
            if (in.hasNextInt()){
                numberOfDivers = in.nextInt();
                if (Debug.betweenInts(numberOfDivers, 1, 30)){
                    diversLoop = false;
                }else{
                    System.err.println("invalid number");
                }
            }else{
                String invalidResponse = in.nextLine();
                System.err.println(invalidResponse + " is not a valid response.");
            }
        }
        return numberOfDivers;
    }
    
        public static int inputNumberOfDives(){
        Scanner in = new Scanner(System.in);
        int numberOfDives = 0;
        boolean divesLoop = true;
        while(divesLoop){
            System.out.println("How many dives will you go on?");
            if (in.hasNextInt()){
                numberOfDives = in.nextInt();
                if (Debug.betweenInts(numberOfDives, 1, 5)){
                    divesLoop = false;
                }else{
                    System.err.println("invalid number");
                }
            }else{
                String invalidResponse = in.nextLine();
                System.err.println(invalidResponse + " is not a valid response.");
            }
        }
        return numberOfDives;
    }
        
    public static ArrayList<String> inputDiverNames(int numberOfDivers){
        Scanner in = new Scanner(System.in);
        ArrayList<String> divers = new ArrayList<String>();        
        for (int i = 1; i <=numberOfDivers; i++){
            boolean diveNameLoop = true;
            while (diveNameLoop){
                System.out.println("Enter the name of diver " + i + ":");
                String input = in.nextLine();
                if (Debug.betweenInts(input.length(), 1, 25)){
                    divers.add(input);
                    diveNameLoop = false;
                }else {
                System.err.println("Enter a name between 0 and 25 characters long");
                }
            }
        }
        return divers;
    }
}
