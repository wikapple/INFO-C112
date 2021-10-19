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
public class ListAnalyzer {


public static void printInstructions(){
    System.out.println("Enter numbers in order to calculate their mean \nand the"
            + " variance between them. when finsihed, \npress q to quit and calculate"
            + " results.\n\n");
}

//public static void echoData(){
    //Scanner in = new Scanner(System.in);
    //Double accumulator = 0.0;
    //int i=0;
    //boolean keepGoing = true;
    //do{
        //System.out.print("Enter a number or press 'q' to quit: ");
       // if (in.hasNextDouble()){
            //Double currentValue = in.nextDouble();
            //in.nextLine();
            //accumulator = accumulator + currentValue;
            //i = i + 1;
        //}else{
            //keepGoing = false;
    //}}while(keepGoing);
    
    //System.out.printf("The sum of the values is: %.1f\n", accumulator);
    //mean(accumulator, i);


//5}

public static void analyzeData(){
        Scanner in = new Scanner(System.in);
    Double accumulator = 0.0, cumulativeSumOfSquares = 0.0;
    int i=0;
    boolean keepGoing = true;
    do{
        System.out.print("Enter a number or press 'q' to quit: ");
        if (in.hasNextDouble()){
            Double currentValue = in.nextDouble();
            in.nextLine();
            accumulator = accumulator + currentValue;
            cumulativeSumOfSquares += currentValue * currentValue;
            i += 1;
            keepGoing = true;
        }else{
            keepGoing = false;
    }}while(keepGoing);
    
    
    
    System.out.printf("\nYou entered %d values.\nThe sum of the values is: %.1f\n"
            , i, accumulator);
    mean(accumulator, i, cumulativeSumOfSquares);
}

public static void mean(double sum, int i, double cumulativeSumOfSquares){
    Double mean, variance=0.0;
    if (sum != 0){
        mean = sum / i;
        variance = cumulativeSumOfSquares/i - mean*mean;
    }else{
           mean = .0;
           }
           System.out.printf("The mean is: %.1f.\nThe variance is %f.\n\n"
                   , mean, variance);
    }
    

public static void main(String[] args) {
    printInstructions();
    //echoData();
    analyzeData();
    }
    
}
