/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class DrawTheCallStack {

   
    public static void fA(int x) {
        x = x + 3;
        System.out.println(x);
        fB(x);
    }
    
    public static void fB(int x) {
        x = x * 3;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 0;
        fA(x);
        System.out.println(x);
        fB(x);
        System.out.println(x);
    }
    
}