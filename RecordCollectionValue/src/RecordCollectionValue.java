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
public class RecordCollectionValue {

    
    /** Asks user to enter titles and values of records, returns only the values.
     * 
     * @param numRecords length of array
     * @return returns array of values
     */
    public static double[] readCollection(int numRecords){
        //initialize scanner for this method.
        Scanner in = new Scanner(System.in);
        
        //initialize arrays needed
        double recordValues[] = new double[numRecords];
        String recordTitles[] = new String[numRecords]; 
        
        //get the for loop started
        for (int i = 0; i < numRecords; i++){
            System.out.printf("Please enter record %d's title: ", i+1);
            recordTitles[i] = in.nextLine();
            System.out.printf("Please enter record %d's value: $", i+1);
            recordValues[i] = in.nextDouble();  
            in.nextLine();          //fixing Scannerbug
        }
        System.out.println(recordTitles[1]);
        return recordValues;
    }
    
    /** Calculates and outputs sum and mean of an array of values.
     * 
     * @param recordValues Array of values to be analyzed 
     */
    public static void analyzeData (double[] recordValues){
        //initialize sum
        double sum = 0.0;
        //Get enhanced for loop started
        for(double traverse : recordValues){
            sum += traverse;
        }
        //Calculate mean
        double mean = sum / recordValues.length;
        
        //Output calculations
        System.out.printf("The collection has a total value of $%.2f and the "
                + "average value is $%.2f", sum, mean);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize Scanner
        Scanner in = new Scanner(System.in);
        
        //Find out how many items are in array using n.
        System.out.print("Enter how many records are in the collection: ");
        int n = in.nextInt();
        
        //recordValues gets array of record values by invokes readCollection.
        double [] recordValues = readCollection(n);
        
        //invoke analyzeData to get sum and mean.
        analyzeData(recordValues);
        
    }
    
}
