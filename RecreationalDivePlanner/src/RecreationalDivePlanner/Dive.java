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
public class Dive{
    
    String diveName;
    int diveDepth;
    int diveTime;
    char pressureGroupAfterDive;
    int surfaceInterval;
    char pressureGroupAfterSurfaceInterval;
    int residualNitrogenTime;
    int adjustedNoDecompressionLimits;
            
          Dive(String nameInput){
             this.diveName = nameInput;
            }
    
          
    public void diveSetup(){
        System.out.println("Time to setup " + diveName);
        TableOne tableOne = new TableOne();
        pressureGroupAfterDive = tableOne.getPressureGroup();
        diveDepth = tableOne.getDepthEstimate();
        diveTime = tableOne.getDepthTime();
        TableTwo tableTwo = new TableTwo();
        pressureGroupAfterSurfaceInterval = tableTwo.surfaceIntervalGroup(pressureGroupAfterDive);
        surfaceInterval = tableTwo.getSurfaceInterval();
    }
    public void diveSetup(char lastPressureGroup){
        System.out.println("Time to setup " + diveName);
        TableOne tableOne = new TableOne();
        pressureGroupAfterDive = tableOne.getPressureGroup(lastPressureGroup);
        diveDepth = tableOne.getDepthEstimate();
        diveTime = tableOne.getDepthTime();
        TableTwo tableTwo = new TableTwo();
        pressureGroupAfterSurfaceInterval = tableTwo.surfaceIntervalGroup(pressureGroupAfterDive);
        surfaceInterval = tableTwo.getSurfaceInterval();
    }
        public void lastDiveSetup(){
        System.out.println("Time to setup " + diveName);
        TableOne tableOne = new TableOne();
        pressureGroupAfterDive = tableOne.getPressureGroup();
        diveDepth = tableOne.getDepthEstimate();
        diveTime = tableOne.getDepthTime();
//        TableTwo tableTwo = new TableTwo();
//        pressureGroupAfterSurfaceInterval = tableTwo.surfaceIntervalGroup(pressureGroupAfterDive);
//        surfaceInterval = tableTwo.getSurfaceInterval();
    }
    
            public void lastDiveSetup(char lastPressureGroup){
        System.out.println("Time to setup " + diveName);
        TableOne tableOne = new TableOne();
        pressureGroupAfterDive = tableOne.getPressureGroup(lastPressureGroup);
        diveDepth = tableOne.getDepthEstimate();
        diveTime = tableOne.getDepthTime();
//        TableTwo tableTwo = new TableTwo();
//        pressureGroupAfterSurfaceInterval = tableTwo.surfaceIntervalGroup(pressureGroupAfterDive);
//        surfaceInterval = tableTwo.getSurfaceInterval();
    }
          
     public void printDive(){
         System.out.println("\t" + diveName);
         System.out.println("Dive depth: " + diveDepth + "Feet\t\tTime on Dive: " + diveTime + " minutes");
         System.out.print("Pressure group after dive: " +pressureGroupAfterDive + "\t\t");
         if (surfaceInterval > 0){
         System.out.println("Pressure group after surface interval[" + surfaceInterval + " minutes): " + pressureGroupAfterSurfaceInterval);
         }
         System.out.println();
     }
}
