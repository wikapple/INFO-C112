
package RecreationalDivePlanner;
import java.util.ArrayList;
/**
 *
 * @author wikap
 */
public class MainClass {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to my recreational dive planner project!\n");
        DiveTrip myDivePlan = SetupDivePlan.fullDiveTripSetup();
        myDivePlan.setupDives();
        myDivePlan.printTripInfo();
        
        
        }
    }
