/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;  //importing scanner

/**
 *
 * @author wikap
 */
public class HashtagCounter {

    /**
     * Takes in a tweet, counts and returns number of number signs.
     * @param tweet
     * @return 
     */
    public static int countNumberSigns(String tweet){
        int numberSign = 0;
        for (int i = 0 ; i <tweet.length() ; i++){
            char currentLetter = tweet.charAt(i);
            if (currentLetter == '#'){
                numberSign++;
            }
        }
        return numberSign;
    }
    
    /**
     * Takes in a tweet, counts and returns the numbers of hashtags.
     * Note: does not discern letters and numbers from symbols.
     * @param tweet
     * @return 
     */
    public static int countHashtags(String tweet){
        int hashtags = 0; //Declare hashtag variable
        
        //start for loop. Last element of string cannot be a hashtag.
        for (int i = 0 ; i < tweet.length()-1 ; i++){
            //declare for loop variables
            char currentLetter = tweet.charAt(i);
            char nextLetter = tweet.charAt(i+1);
            
            if (currentLetter == '#'){ //only concerned with element #
                
                //index 0 requires special if statement.
                if (i == 0){
                    if (nextLetter != ' '){
                   //only a hashtag if next element is not a space.
                    hashtags++;
                    }
                    }
                
                //if statement for all other indices
                }else if (tweet.charAt(i-1) == ' ' && nextLetter != ' '){ //hashtag if previous element is a space and next element is not a space.
                    hashtags++;
                }
            }
        return hashtags;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the text of a tweet: "); //instruction
        String tweet = in.nextLine(); //declare and assign value to tweet
        
        //counting number signs
        int numberSigns = countNumberSigns(tweet);
        int hashtags = countHashtags(tweet);
        
        //Final Output:
        System.out.printf("There is/are %d hashtag(s) and %d numbersign(s)"
                + " in the tweet \"%s\".\n", hashtags, numberSigns, tweet);
    }
}
