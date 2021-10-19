/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Start by declaring and assigning variables:
        int hour = 22;
        int minute = 5;
        int second = 20;
        int secondsInDay = 24 * 60 * 60;
        //More complex variables with operators:
        int secondsSinceMidnight = (hour * 60 * 60) + (minute * 60) + (second);
        int secondsUntilMidnight = secondsInDay - secondsSinceMidnight;
        int percentageOfDayOver = (secondsSinceMidnight * 100) / secondsInDay;
        //First Output
        System.out.println("Seconds since midnight:");
        System.out.println(secondsSinceMidnight);
        System.out.println("Seconds until midnight:");
        System.out.println(secondsUntilMidnight);
        System.out.println("Percentage of day over:");
        System.out.print(percentageOfDayOver);
        System.out.println("%");
        //Create variables for starting time
        int startHour = 21;
        int startMinute = 34;
        int startSecond = 30;
        int secondsSinceMidnightStart = (startHour * 60 * 60) + (startMinute * 60) + (startSecond);
        //Went back and updated hour, minute and second variables now that starting time was stored
        //Second Output
        System.out.println("Time since assignment started:");
        System.out.print(secondsSinceMidnight - secondsSinceMidnightStart);
        System.out.println(" seconds");
        
        
    }
    
}
