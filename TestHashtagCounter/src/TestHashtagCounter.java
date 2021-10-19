/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.ius.HashtagCounter;
import java.util.Scanner;

/**
 *
 * @author wikap
 */
public class TestHashtagCounter {

    
    /** Used tweet/String to test class HashtagCounter.java
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input for String tweet.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a tweet: ");
        String tweet = in.nextLine();
        
        //Create instance for HashtagCounter, fire up constructor
        HashtagCounter count = new HashtagCounter(tweet);
        
        //get the numbers ready for output.
        int hashtags = count.getHashtags();
        int numbersigns = count.getNumberSigns();
        
        //output
        System.out.printf("There is/are %d hashtag(s) and %d numbersign(s)"
                + " in the tweet \"%s\".\n", hashtags, numbersigns, tweet);
    }
    
}
