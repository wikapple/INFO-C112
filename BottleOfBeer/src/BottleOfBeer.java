/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class BottleOfBeer {

    /**
     * @param args the command line arguments
     */
    public static void countdown(int x){
        if (x > 0){
            verse(x);
            countdown(x-1);
   }    else{
            ending();
    }
    }
    public static void verse (int x){
        System.out.println(x + " bottles of beer on the wall! " + x + 
                    " bottles of beer! Take one down, pass it around!" + (x-1) + 
                    "bottles of beer on the wall!");
        
    }
    public static void ending(){
        System.out.println("No bottles of beer on the wall, no bottles of beer,"
                + "ya can't take one down, ya' can't pass it around, 'cause "
                + "there are no more bottles of beer on the wall!");
        
    }
    
    public static void main(String[] args) {
        countdown(99);
    }
    
    
    
}
