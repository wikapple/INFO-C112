
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// We need to import the following library to display the message dialog window.

/**  This is a list of functions we need to use.
 *  1. Create an integer variable:
 *        int integerName = 0;
 *  2. Collect user input from a dialog:
 *       String userInput = JOptionPane.showInputDialog("your message");
 *  3. Print out a message using a message dialog:
 *       JOptionPane.showMessageDialog(null, "your message", "title of the dialog", JOptionPane.PLAIN_MESSAGE);
 *
 *  4. When we use the dialog message, at the very end, we need to add one line of code:
 *         System.exit(0);
 *  5. Convert a string to an integer
 *         int intNum = Integer.parseInt(stringVariable);
 *  6. Generate a random integer in the range of [minimum, maximum]
 *         int random = minimum + (int) (Math.random() * maximum);
 *  7. Decision Structure
 *      if(condition) {
 *               your instructions ...
 *      } else {
 *               your instructions ...
 *      }**  8. Loop Structure
 *      while (condition) {
 *               your instructions ...
 *      }
 **/
package c100numberguessinggame;

import javax.swing.JOptionPane;

/**
 *
 * @author wikap
 */
public class C100NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int integername = 0;
        int minimum = 1;
        int maximum = 10;
        String userInput = JOptionPane.showInputDialog("Guess a number between 1 and 10");
        
        /*System.out.println(userInput);*/
        int intNum = Integer.parseInt(userInput);
        JOptionPane.showMessageDialog(null, intNum, "Your guess", 
        JOptionPane.PLAIN_MESSAGE);
        int random = minimum + (int) (Math.random() * maximum);
        /*System.out.println(random);*/
        JOptionPane.showMessageDialog (null, random, "The correct number",
     JOptionPane.PLAIN_MESSAGE);
    }
    
}