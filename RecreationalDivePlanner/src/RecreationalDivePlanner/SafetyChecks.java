package RecreationalDivePlanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author wikap
 */
public class SafetyChecks {
    boolean safetyStopRequired;
    String safetyStopWarning;
    String noStop;
    boolean noDecompressionLimitReached;
    String decompressWarning;
    String noDecompress;
    
    public SafetyChecks(){
        safetyStopRequired = false;
        safetyStopWarning = "Safety stop required!";
        noStop = "No safety stop required";
        noDecompressionLimitReached = false;
        decompressWarning = "No decompression limit reached!";
        noDecompress = "Within no decompression limits";
}
    
    
    public void checkLimits(int depth){
        if(depth >= 100){
            safetyStopRequired = true;
        }
        if(depth > 140){
            noDecompressionLimitReached = true;
        }
        outputWarnings();
    }
    
    public void checkLimits(int timeRounded, ArrayList<Integer> atDepthTimes){
        
        if (timeRounded >= atDepthTimes.get((atDepthTimes.size() -4))){
        safetyStopRequired = true;
        }        
        
        
        if (timeRounded >= atDepthTimes.get((atDepthTimes.size() -1))){
        noDecompressionLimitReached = true;
        }
        
        outputWarnings();
    }
    public void outputWarnings(){
        if (safetyStopRequired){
            System.out.println(safetyStopWarning);
        }else{
            System.out.println(noStop);
        }
        
        if (noDecompressionLimitReached){
            System.out.println(decompressWarning);
        }else{
            System.out.println(noDecompress);
        }
    }
    
}
