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
public class ArrayTesting {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Get n
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the prime number ceiling: ");
        n = in.nextInt();
        in.close();
        
        //initialize numbers array, ture = prime number
        boolean[] isPrime = new boolean[n];
        isPrime[0] = false;
        for (int c = 1; c < n; c++){
            isPrime[c] = true;
    }
       
        for (int i = 2; i <= n; i++)
            
            if (isPrime[i-1]) {
                System.out.println(i);
            
        
        //cross off all subsequent multiples:
        for (int j = 2 * i; j<=n; j+=i){
            isPrime[j-1] = false;
        }
        
        
    
}
}
}