/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wikap
 */
public class DiveTrip {
    String tripName;
    String tripDate;
    String tripLocation;
    int numberOfDivers;
    int numberOfDives;
    
    public DiveTrip(String tripNameInput, String tripDateInput, String 
            tripLocationInput, int numberOfDiversInput, int numberOfDivesInput){
        
        this.tripName = tripNameInput;
        this.tripDate = tripDateInput;
        this.tripLocation = tripLocationInput;
        this.numberOfDivers = numberOfDiversInput;
        this.numberOfDives = numberOfDivesInput;
        
    }
    
}
