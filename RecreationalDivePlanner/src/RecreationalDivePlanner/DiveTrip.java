package RecreationalDivePlanner;

import java.util.ArrayList;
import java.util.Scanner;

public class DiveTrip {
    
private String diveTripName;
private String dateOfDive;
private int numberOfDivers;
private ArrayList<String> diverNames;
private int numberOfDives;
private ArrayList<Dive>Dives;
//private int residualNitrogenTime;
//private int adjustedNoDecompressionLimits;


DiveTrip(String diveTripNameInput, String dateOfDiveInput, int numberOfDiversInput, int numberOfDivesInput, ArrayList<String>diverNamesInput){
    this.diveTripName = diveTripNameInput;
    this.dateOfDive = dateOfDiveInput;
    this.numberOfDivers = numberOfDiversInput;
    this.numberOfDives = numberOfDivesInput;
    this.diverNames = diverNamesInput;
    //ArrayList<Dive> Dives = new ArrayList<Dive>();
    

}

public void changeTripName(String tripNameInput){
    diveTripName = tripNameInput;
}

public void changeDateOfDive (String dateInput){
    dateOfDive = dateInput;
}

public void changeNumberOfDivers(int numberInput){
    numberOfDivers = numberInput;
}

public void changeNumberOfDives(int numberInput){
    numberOfDives = numberInput;
}

public void changeDiverNames(ArrayList<String> diverNamesInput){
    diverNames = diverNamesInput;
}

public void setupDives(){
    Dives = new ArrayList<Dive>();
    Dive DiveOne = new Dive("DiveOne");
    if (numberOfDives == 1){
        DiveOne.lastDiveSetup();
    }else{
        DiveOne.diveSetup();
    }
    Dives.add(DiveOne);
    if(Dives.size() < numberOfDives){
        Dive DiveTwo = new Dive("Dive Two");
        if(numberOfDives == 2){
            DiveTwo.lastDiveSetup(DiveOne.pressureGroupAfterSurfaceInterval);
        }else{
            DiveTwo.diveSetup(DiveOne.pressureGroupAfterSurfaceInterval);
        }
        Dives.add(DiveTwo);
    
        if(Dives.size() < numberOfDives){
            Dive DiveThree = new Dive("Dive Three");
            if(numberOfDives == 3){
                DiveThree.lastDiveSetup(DiveTwo.pressureGroupAfterSurfaceInterval);
            }else{
                DiveThree.diveSetup(DiveTwo.pressureGroupAfterSurfaceInterval);
            }
            Dives.add(DiveThree);
        
            if(Dives.size() < numberOfDives){
                Dive DiveFour = new Dive("Dive Four");
                if(numberOfDives == 4){
                    DiveFour.lastDiveSetup(DiveThree.pressureGroupAfterSurfaceInterval);
                }else{
                    DiveFour.diveSetup(DiveThree.pressureGroupAfterSurfaceInterval);
                }
                Dives.add(DiveFour);
            }
        }
    }
}



    private void printDiveList(){
        for (Dive dive : Dives){
            dive.printDive();
        }
    }
    
    public void printTripInfo(){
        System.out.print("Trip Name: " + diveTripName);
        System.out.println("\t Date: " + dateOfDive);
        System.out.print("Number of divers: " + numberOfDivers);
        System.out.println("\t number of dives: " + numberOfDives);
        System.out.print("Divers: ");
        for (String diver : diverNames){
            System.out.print(diver + "; ");
        }
        System.out.println();
        
        printDiveList();
        
        
    }
    
}
