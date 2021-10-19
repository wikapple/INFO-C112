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
public class Chapter9 {
    
    /**
     * Enter and returns OLN String
     * @return 
     */
    public static String oLNEnter(){
        Scanner in = new Scanner(System.in);
        String OLN;
        System.out.println("Please enter your driver's license number in the format"
        + " xxxx-xx-xxxx:");
        OLN = in.next();
        return OLN;
    }
    

    /**
     * If OLN correct format, return true, otherwise return false       
     * @param OLN
     * @return 
     */
    public static boolean oLNValidation(String OLN){
        //Checking correct length
        if (OLN.length() != 12)
            return false;
        
        for (int i = 0 ; i < OLN.length() ; i++){
            char currentLetter = OLN.charAt(i);
            if (i==4 || i ==7){
                if (currentLetter != '-')
                    return false;
            }else{
                if(!Character.isDigit(currentLetter))
                        return false;
                }
            
        }
        
        return true;
    }

    public static void oLN(){
        String OLN = oLNEnter();
        boolean oLNValidation = oLNValidation(OLN);
        
       while (!oLNValidation){
           System.out.println("Incorrect format!");
           OLN=oLNEnter();
           oLNValidation = oLNValidation(OLN);
       }
       System.out.println("Thank you for the valid license number format!");
    }
    
    public static boolean isAbecedarian(String word){
        String word2 = word.toLowerCase();
        for (int i =1 ; i < word2.length() ; i++){
            char currentLetter = word2.charAt(i);
            char previousLetter = word2.charAt(i-1);
            if (currentLetter <= previousLetter)
                return false;
        }
        return true;
    }
    
    public static void abecedarian(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        System.out.println("");
        
            String answer;
        if(isAbecedarian(word)){
            answer = "";
        }else {
            answer = " not";
        }
            System.out.printf("%s is%s abecedarian.\n", word, answer);
    }
    
    
    public static void doubloon(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word to check it if is a doubloon: ");
        String word = in.nextLine();
        
        String answer;
        if (isDoubloon(word)){
            answer = "";
        }else{
            answer = " not";
        }
        
        System.out.printf("\"%s\" is%s a doubloon.\n", word, answer);
    }
    
    public static boolean isDoubloon(String word){
        //every letter appears exactly twice in the word
        String word2 = word.toLowerCase();
        char currentLetter;
        int letterCounter = 0;
        
        if (word2.length() % 2 != 0){
            return false;
        }    
        for (int i = 0 ; i < word2.length() ; i++){
            currentLetter = word2.charAt(i);
            letterCounter = 0;
            
            for (int j = 0 ; j < word2.length() ; j++){
                if (word2.charAt(j) == currentLetter){
                    letterCounter++;
                }
            }
            if (letterCounter != 2){
                return false;
            }
        }
        return true;
    }
    
    public static boolean canSpell (String tiles, String word){
        if (word.length() > tiles.length()){
            return false;
        }
        
        for (int i = 0 ; i < word.length() ; i++){
            char l1 = word.charAt(i);
            
            if (tiles.indexOf(l1) == -1){
                return false;
           }else {
                int firstWordCount = 0, secondWordCount = 0;
                
                for (int j = 0 ; j < tiles.length() ; j++){
                    if (tiles.charAt(j) == l1){
                        firstWordCount++;
                    }
                }
                for(int x = 0 ; x < word.length() ; x ++){
             
                    if (word.charAt(x) == l1){
                        secondWordCount++;
                    }
                }
                if(secondWordCount > firstWordCount){
                    return false;
                }
            }
        }
        
        
        return true;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //oLN();  //The OLN Method
        //abecedarian();
        //doubloon();
        
        //Scanner in = new Scanner(System.in);
        //System.out.print("Enter your set of tiles: ");
        //String tiles = in.nextLine();
        //System.out.print("Enter a word to test: ");
        //String word = in.nextLine();
        
        //if (canSpell(tiles,word)){
            //System.out.println("word match!");
       //}else{
            //System.out.println("no match!");
        //}
        String a = "a";
        String A = "A";
        int x = a.compareTo(A);
        System.out.println(x);
        }
        
        
            
            
        
        
        
        
    
    
}
