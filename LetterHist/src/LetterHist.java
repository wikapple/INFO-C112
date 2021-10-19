/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class LetterHist {

    /** Takes a string, returns a histogram array for the letters of that string.
     * 
     * @param args the command line arguments
     */
    public static int[] letterHist (String TheString){
        String TheString2 = TheString.toLowerCase();    //Get rid of variance between lower and upper case letters
        int[] LetterHist = new int[25];   //Declare our alphabet array
        
        //standard for statement traversal
        for (int i = 0 ; i < TheString2.length() ; i ++){
            char letter = TheString.charAt(i); //Get the letter value
            int index = ((int)letter-65); //cast an int to be sure, then substract the unicode value.
            LetterHist[index]++; //adding to the alphabet array.
        }
        return LetterHist;    //return statement
    }

    /**Create string, invoke letterHist, outputs histogram.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        String TheString = "AAAABCD"; //The String
        int[] LetterHist = letterHist(TheString);  //Invoking method to calculate
        
        //output
        for (int i = 65; i <=90; i++){
            char m = (char)i;
            System.out.print(m);
        }
        System.out.println("");
        for (int q : LetterHist)     
           System.out.print(q); 
            
        
    }
    
}
