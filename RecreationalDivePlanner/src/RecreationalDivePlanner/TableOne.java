package RecreationalDivePlanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author wikap
 */
public class TableOne {

 
    private int depthEstimate;
    private int depthTime;
    private final int[][] tableOne;
    private final Integer[] depthArray;
    private final char[] pressureGroups;
    private ArrayList<Integer> atDepthTimes;
    
    
    //The Constructor
    TableOne(){
       
        //Depth columns 
       depthArray = new Integer[] {35,40,50,60,70, 80, 90,100,110,120,130,140};
        
       //Get pressure groups list
       pressureGroups = new char[26];
       int unicodeIndex = 65;
       for (int j = 0; j < pressureGroups.length; j++){
           pressureGroups[j] = (char)unicodeIndex;
           unicodeIndex++;
       }
       
        //Assign values to array:
        tableOne = new int[][] {
            {10, 9, 7, 6, 5, 4, 4, 3, 3, 3, 3, 0}, 
            {19, 16, 13, 11, 9, 8, 7, 6, 6, 5, 5, 4},
            {25, 22, 17, 14, 12, 10, 9, 8, 7, 6, 6, 5},
            {29, 25, 19, 16, 13, 11, 10, 9, 8, 7, 7, 6},
            {32, 27, 21, 17, 15, 13, 11, 10, 9, 8, 7, 7},
            {36, 31, 24, 19, 16, 14, 12, 11, 10, 9, 8, 8},
            {40, 34, 26, 21, 18, 15, 13, 12, 11, 10, 9, -1},
            {44, 37, 28, 23, 19, 17, 15, 13, 12, 11, 10, -1},
            {48, 40, 31, 25, 21, 18, 16, 14, 13, 11, -1, -1},
            {52, 44, 33, 27, 22, 19, 17, 15, 13, 12, -1, -1},
            {57, 48, 36, 29, 24, 21, 18, 16, 14, 13, -1, -1},
            {62, 51, 39, 31, 26, 22, 19, 17, 15, -1, -1, -1},
            {67, 55, 41, 33, 27, 23, 21, 18, 16, -1, -1, -1},
            {73, 60, 44, 35, 29, 25, 22, 19, -1, -1, -1, -1},
            {79, 64, 47, 37, 31, 26, 23, 20, -1, -1, -1, -1},
            {85, 69, 50, 39, 33, 28, 24, -1, -1, -1, -1, -1},
            {92, 74, 53, 42, 35, 29, 25, -1, -1, -1, -1, -1},
            {100, 79, 57, 44, 36, 30, -1, -1, -1, -1, -1, -1},
            {108, 85, 60, 47, 38, -1, -1, -1, -1, -1, -1, -1},
            {117, 91, 63, 49, 40, -1, -1, -1, -1, -1, -1, -1},
            {127, 97, 67, 52, -1, -1, -1, -1, -1, -1, -1, -1},
            {139, 104, 71, 54, -1, -1, -1, -1, -1, -1, -1, -1},
            {152, 111, 75, 55, -1, -1, -1, -1, -1, -1, -1, -1},
            {168, 120, 80, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {188, 129, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {205, 140, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            };
    }
    
    
    
    
    
    
    public char getPressureGroup(){
        depthEstimate = DepthEstimate();
        int roundedDepth = depthRounder(depthEstimate);
        int depthIndex = depthIndexFinder(roundedDepth);
        atDepthTimes = getAtDepthTimes(depthIndex);
        depthTime = getTimeEstimate();
        int timeRoundedUp = timeRounder(depthTime);
        char pressureGroup = pressureGroup(timeRoundedUp);
        SafetyChecks safetyCheck = new SafetyChecks();
        safetyCheck.checkLimits(timeRoundedUp, atDepthTimes);
        return pressureGroup;
    }
    
        public char getPressureGroup(char lastPressureGroup){
        depthEstimate = DepthEstimate();
        int roundedDepth = depthRounder(depthEstimate);
        int depthIndex = depthIndexFinder(roundedDepth);
        int residualNitrogen = residualNitrogenCalculation(lastPressureGroup, depthIndex);
        System.out.println("Residual Nitrogen: " + residualNitrogen);
        atDepthTimes = getAtDepthTimes(depthIndex);
        depthTime = getTimeEstimate(residualNitrogen);
        int totalBottomTime = depthTime + residualNitrogen;
        int timeRoundedUp = timeRounder(totalBottomTime);
        char pressureGroup = pressureGroup(timeRoundedUp);
        SafetyChecks safetyCheck = new SafetyChecks();
        safetyCheck.checkLimits(timeRoundedUp, atDepthTimes);
        return pressureGroup;
    }
    
    public int getDepthEstimate(){
        return depthEstimate;
    }
    public int getDepthTime(){
        return depthTime;
    }
    
    public int DepthEstimate(){
        Scanner in = new Scanner(System.in);
        int depthEstimate = 0;
        boolean depthEstimateLoop = true;
        while (depthEstimateLoop){
            System.out.println("How deep do you plan to dive on dive?");
            
            System.out.println("(in feet, up to 130 feet deep)");
            if (in.hasNextInt()){
                depthEstimate = in.nextInt();
                if(depthEstimate >5 && depthEstimate <=140){
                depthEstimateLoop = false;
                }
                else{
                    System.err.println("Invalid depth!");
                }
            }
            else{
                String badDepthEstimate = in.nextLine();
                System.err.println(badDepthEstimate + "is not a valid response");
                System.err.println("Enter a valid integer for depth");
            }
        }
        return depthEstimate;
    }
    
    private int depthRounder(int depthEstimate){
        //Integer[] depthArray = {35,40,50,60,70,100,110,120,130,140};
        int depthRounder = 0;
        
        if (depthEstimate <= depthArray[0]){
            depthRounder = depthArray[0];
        }
        
        else if (depthEstimate > depthArray[(depthArray.length-1)]){
            System.err.println("Too deep for recreational dive!");
            depthRounder(depthEstimate);
        }else
        for (int i = 0; i< depthArray.length; i++){
             if (depthEstimate == depthArray[i])
            {depthRounder = depthArray[i];
            }else if (depthEstimate > depthArray[i] && depthEstimate <= depthArray[i+1]){
                depthRounder = depthArray[i+1];
            }
        }
        return depthRounder;
    }
    
    private int residualNitrogenCalculation(char pressureGroupBeforeDive, int depthIndex){
       int rowIndex = -1;
       for (int i = 0; i<=pressureGroups.length-1; i++){
           if (pressureGroupBeforeDive == pressureGroups[i]){
               rowIndex = i;
           }
       }
       int residualNitrogenCalculation =  tableOne[rowIndex][depthIndex];
       return residualNitrogenCalculation;
      
    }
    
    private int depthIndexFinder(int depthRounder){
        int depthIndex= Arrays.asList(depthArray).indexOf(depthRounder);
        
        
        //stub
        return depthIndex;
    }
    
        /*
    Uses the index of a column from tableOne to turn column values into a one 
    dimensional array
    */
    public ArrayList<Integer> getAtDepthTimes(int depthIndex){

        //Creating an array list to add values to
        ArrayList<Integer> atDepthTimes = new ArrayList<Integer>();
        
        //traverse the rows of 2D array
        for (int i = 0; i < tableOne.length; i++){
                //if value in column is -1, break the loop
              if(tableOne[i][depthIndex] == -1){
                  break;
              }
              
            //otherwise, add the value to the one dimensional array  
            atDepthTimes.add(tableOne[i][depthIndex]);    
        }
//        //print array to double check it is working correctly
//        for (int number: atDepthTimes) {
//            System.out.println(number);
//
//        }
        return atDepthTimes;
        }
    
    private int getTimeEstimate(){
        Scanner in = new Scanner(System.in);
        int maxTimeIndex = (atDepthTimes.size()-1);
        
        int timeMax = atDepthTimes.get(maxTimeIndex); 
        
        int timeEstimate = 0;
        boolean timeEstimateLoop = true;
        while(timeEstimateLoop){
        System.out.println("How long do you plan to be on this dive? (in minutes)");
        System.out.println("Note that you can dive up to " + timeMax + " minutes");
        if (in.hasNextInt()){
                timeEstimate = in.nextInt();
                if(timeEstimate >0 && timeEstimate <=timeMax){
                timeEstimateLoop = false;
                }
                else{
                    System.err.println("Invalid time!");
                }
            }
            else{
                String badDepthEstimate = in.nextLine();
                System.err.println("Your entry: " + badDepthEstimate + " is invalid!");
                System.err.println("Enter a valid integer for time in minutes");
            }
        }
        
        return timeEstimate;
    }
    
        private int getTimeEstimate(int residualNitrogen){
        Scanner in = new Scanner(System.in);
        int maxTimeIndex = (atDepthTimes.size()-1);
        
        int timeMax = (atDepthTimes.get(maxTimeIndex)-residualNitrogen); 
        
        int timeEstimate = 0;
        boolean timeEstimateLoop = true;
        while(timeEstimateLoop){
        System.out.println("How long do you plan to be on this dive? (in minutes)");
        System.out.println("Note that you can dive up to " + timeMax + " minutes");
        if (in.hasNextInt()){
                timeEstimate = in.nextInt();
                if(timeEstimate >0 && timeEstimate <=timeMax){
                timeEstimateLoop = false;
                }
                else{
                    System.err.println("Invalid time!");
                }
            }
            else{
                String badDepthEstimate = in.nextLine();
                System.err.println("Your entry: " + badDepthEstimate + " is invalid!");
                System.err.println("Enter a valid integer for time in minutes");
            }
        }
        
        return timeEstimate;
    }
    
    private int timeRounder(int timeEstimate){
        int timeRounder = 0;
        int arrayLength = atDepthTimes.size();
        
        if (timeEstimate <= atDepthTimes.get(0)){
            timeRounder = atDepthTimes.get(0);
        }
        else{
            for (int i = 0; i < arrayLength; i++){

           if(timeEstimate == atDepthTimes.get(i)){
               timeRounder = atDepthTimes.get(i);
           }
           else if (timeEstimate > atDepthTimes.get(i) && timeEstimate < atDepthTimes.get(i+1)){
               timeRounder = atDepthTimes.get(i+1);
           }
        }
        }
        return timeRounder;
    }
    
    private char pressureGroup(int roundedTime){
      int timeColumnIndex = atDepthTimes.indexOf(roundedTime);
       char pressureGroup = pressureGroups[timeColumnIndex];
        
        return pressureGroup;
    }
    
    
    
}
