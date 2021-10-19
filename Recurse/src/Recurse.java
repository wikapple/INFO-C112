/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class Recurse {

    
    
    /**
    * Returns the first character of the given String.
    */
    public static char first(String s) {
        return s.charAt(0);
}
    
    /**
    * Returns all but the first letter of the given String.
    */
    public static String rest(String s) {
        return s.substring(1);
}
    
    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }
    
    /**
    * Returns the length of the given String.
    */
    public static int length(String s) {
        return s.length();
    }

    /**
     * Prints string with one char per line
     * @param s 
     */
    public static void printString (String s){
        char FirstLetter = first(s);
        System.out.println(FirstLetter);
        s = new String(rest(s));
        int length = length(s);
        if (length > 0)
            printString(s);
        
    }
        
    
    public static void printBackward (String s){
        char FirstLetter = first(s);
        s = new String(rest(s));
        int length = length(s);
        if (length > 0)
            printBackward(s);
        System.out.println(FirstLetter);
    }
    
    public static String reverseString (String s){
        
    
    public static void main(String[] args) {
        String s = "Hello World!";
        printString(s);
        printBackward(s);
        System.out.println(reverseString(s));
    }
}