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
public class ArrayUtils {

    /**
     * @param args the command line arguments
     */
    
    /**
     * Returns lowest value in array
     * @param numbers
     * @return 
     */
    public static double minValue (double[] numbers){
        double minvalue = numbers[0];
        for (double x: numbers){
            if (x < minvalue){
                minvalue = x;
            }
        }
        return minvalue;
    }
    
    /**
     * Returns index of lowest value in array
     * @param numbers
     * @return 
     */
    public static int indexOfMin (double[] numbers){
        int indexofmin = 0;
        double minvalue = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i]<minvalue){
                minvalue = numbers[i];
                indexofmin = i;
            }
        }
        return indexofmin;
    }
    
    public static void main(String[] args) {
        //Array length
        Scanner in = new Scanner(System.in);
        System.out.print("How many entries will be made into the number list? ");
        int n = in.nextInt();
        double numbers[] = new double[n];
        
        //Entering array numbers
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter a double: ");
            numbers[i] = in.nextDouble();
        }
        
        //double [] numbers = {1.0,2.0,1.4,1.8,4.6,1.4,9.7,4.5,0.5, 3.2,1.7};
        //declaring and assigning variables by invoking methods
        double minvalue = minValue(numbers);
        int indexofmin = indexOfMin(numbers);
        
        //Test
        System.out.println(minvalue);
        System.out.println(indexofmin);
    }
    
}
