/*
 * Dustin Craig Keefer - 1000917479
 * CSE 1325 - Object Oriented Programming
 */
package robbie_robot_shop;

/**
 *
 * @author dusti
 */
public class RRSCLIReportManager {
    public static void reportManager(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("======Report Manager======");
        System.out.println("");
//        System.out.println("(S)earch Reports");
        System.out.println("(B)rowse Reports");
//        System.out.println("(E)dit Report");
        System.out.println("(N)ew Report");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'S' || input == 's'){
            searchReports();
        }
        else if (input == 'B' || input == 'b'){
            browseReports();
        }
        else if (input == 'E' || input == 'e'){
            editReport();
        }
        else if (input == 'N' || input == 'n'){
            newReport();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }
    
    public static void newReport(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("======Generate New Report======");
        System.out.println("");
        System.out.println("(C)ustomer Reports");
        System.out.println("(E)mployee Reports");
        System.out.println("Robot (M)odel Reports");
        System.out.println("Robot (P)art Reports");
        System.out.println("(S)ales Reports");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'C' || input == 'c'){
            
        }
        else if (input == 'E' || input == 'e'){
            
        }
        else if (input == 'M' || input == 'm'){
            
        }
        else if (input == 'P' || input == 'p'){
            
        }
        else if (input == 'S' || input == 's'){
            
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }
    
    public static void browseReports(){
        
    }
    
    public static void editReport(){
        
    }
    
    public static void searchReports(){
        
    }
}
