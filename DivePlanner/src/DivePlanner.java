/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;


/**
 *
 * @author wikap
 */
public class DivePlanner {
    
    private static String intro(){
        Scanner in = new Scanner(System.in);
        String divePlanNameInput = "MyDivePlan";
        System.out.println("Welcome to dive planner!\n");
        boolean introLoop = true;
        while (introLoop){
        System.out.println("would you like to name your dive plan? (y/n)");
        String response = in.nextLine();
        if (response.equals("y") || response.equals("yes")){
            System.out.println("What would you like to name your diveplan?");
            divePlanNameInput = in.nextLine();
            introLoop = false;
        }
        else if(response.equals("n") || response.equals("no")){
            introLoop = false;
        }
        else{
            System.err.println("Invalid response!/n");
        }
     
    }
        return divePlanNameInput;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TableOne tableOne = new TableOne(1);
        // TODO code application logic here
           String divePlanName = intro();
           char pressureGroup = tableOne.getPressureGroup();
           System.out.println("Your pressure group is: " + pressureGroup);
           TableTwo tableTwo = new TableTwo(1);
           char adjustedPressureGroup = tableTwo.surfaceIntervalGroup(pressureGroup);
           if (adjustedPressureGroup != pressureGroup){
           System.out.println("Your pressure group is now adjusted to: " + adjustedPressureGroup);
           }else{
               System.out.println("your pressure group is still " + adjustedPressureGroup);
           }
    }
    
}
