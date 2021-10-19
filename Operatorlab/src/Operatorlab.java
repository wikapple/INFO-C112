/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class Operatorlab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Chapter 2 lab
        
        // Step 1
        int leftInt, rightInt, intResult;
        leftInt = 3;
        rightInt = 5;
        intResult = leftInt + rightInt;
        
        System.out.print("The result of \"");
        System.out.print(rightInt);
        System.out.print(" plus ");
        System.out.print(leftInt);
        System.out.print("\" is ");
        System.out.println(intResult);
        
        //Step 2
        int thirdOperand = 6;
        int operandResult = thirdOperand * intResult;
        
        System.out.print("The result of \"");
        System.out.print(thirdOperand);
        System.out.print(" times the sum of ");
        System.out.print(rightInt);
        System.out.print(" plus ");
        System.out.print(leftInt);
        System.out.print("\" is ");
        System.out.println(operandResult);
        
        //Step 3
        String good, bad;
        good = "goodtimes";
        bad = "badtimes";
        
        System.out.print("The result of \"");
        System.out.print(good);
        System.out.print(" concatenated with ");
        System.out.print(bad);
        System.out.print("\" is ");
        System.out.println(good + bad);
        
        //Step 4
        double leftDouble, rightDouble,doubleResult;
        leftDouble = 4.5;
        rightDouble = 1.5;
        doubleResult = leftDouble / rightDouble;
        
        System.out.print("The result of \"");
        System.out.print(leftDouble);
        System.out.print (" divided by ");
        System.out.print(rightDouble);
        System.out.print("\" is ");
        System.out.println(doubleResult);
        
        //step 5
        System.out.print("The result of \"one and one half times the result of "
                + "adding five and three\" is ");
        System.out.println((1.5 * (double)intResult));
        
        //step 6
        System.out.print("The result of \"1 left shifted by 2\" is ");
        System.out.println(1<<2);
        
        //step 7
        System.out.print("The result of \"8 right shifted by 1\" is ");
        System.out.println(8>>1);
        
        //step 8
        System.out.print("The result of \"255 bitwise AND 17\" is ");
        System.out.println(255 & 17);
        
        //step 9
        double third = 1.0/3.0;
        
        System.out.print("The result of \" one third as a floating point value\" is ");
        System.out.println(third);
        
        
    }
    
}
