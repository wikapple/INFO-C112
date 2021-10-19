/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigInteger;

/**
 *
 * @author wikap
 */
public class Big {

    
    public static void factorial(){
        int factorial;
        BigInteger big;
        for (int i = 0 ; i <=30 ; i++){
            System.out.print(i + "\t");
            factorial = 1;
            if (i == 0){
                factorial = 0;
                big = BigInteger.valueOf(factorial);
           }else{
                big = BigInteger.valueOf(factorial);
                for (int j = i ; j > 0 ; j--){
                   big = big.multiply(BigInteger.valueOf(j));
                }
            }        
           System.out.println(big);
        }
    }
    
    public static int pow(int x, int n){
        if (n == 0) return 1;

        
        
        int power = n/2;
        int Starter = 1;
        BigInteger bigT = new BigInteger("1");
        for (int i = 1 ; i <= power ; i++){
            bigT = bigT.multiply(BigInteger.valueOf(x));
        }
        // find x to the n/2 recursively
        int t = pow(x, power);

        
        System.out.println(bigT);
        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            return t * t;
        } else {
            return t * t * x;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int answer = pow(4,4);
    System.out.println(answer);
    }
    
}
