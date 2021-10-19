/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class Concatenate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String comma = (", ");
        String day = ("Saturday");
        String month = ("January");
        int date = 16;
        int year = 2021;
        String americanDate = (day + comma + month + " " + date + comma + year);
        String europeanDate = (day + " " + date + " " + month + " " + year);
        System.out.println("American Format:");
        System.out.println(americanDate);
        System.out.println("European Format:");
        System.out.println(europeanDate);
    }
    
}
