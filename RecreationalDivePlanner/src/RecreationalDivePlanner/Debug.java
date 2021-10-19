/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecreationalDivePlanner;

/**
 *
 * @author wikap
 */
public class Debug {
    
    public static boolean yesOrNo(String stringInput){
        String lowerCase = stringInput.toLowerCase();
        if (lowerCase.equals("y") || lowerCase.equals("yes")){
            return true;
        }else if (lowerCase.equals("n")|| lowerCase.equals("no")){
            return true;
        }else{
        return false;
        }
    
    }
    
    public static boolean betweenInts(int input, int lowerLimit, int upperLimit){
        if (input >= lowerLimit && input <= upperLimit){
            return true;
        }else{
            return false;
        }
    }
}
