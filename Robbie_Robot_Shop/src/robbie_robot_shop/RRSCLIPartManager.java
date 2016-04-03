/*
 * Dustin Craig Keefer - 1000917479
 * CSE 1325 - Object Oriented Programming
 */
package robbie_robot_shop;

/**
 *
 * @author dusti
 */
public class RRSCLIPartManager {
    
    public static void partManager(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("======Part Manager======");
        System.out.println("");
        //System.out.println("(V)iew Part");
        System.out.println("(N)ew part");
        //System.out.println("(E)dit Part");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'V' || input == 'v'){
            viewPart();
        }
        else if (input == 'N' || input == 'n'){
            newPart();
        }
        else if (input == 'E' || input == 'e'){
            editPart();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }

    public static void viewPart(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("=======View Part========");
        System.out.println("");
        //System.out.println("(B)rowse");
        //System.out.println("(S)earch");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'B' || input == 'b'){
            browseParts();
        }
        else if (input == 'S' || input == 's'){
            searchParts();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }

    public static void newPart(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Part Creator====");
        System.out.println("");
        System.out.println("New (T)orso");
        System.out.println("New (B)attery");
        System.out.println("New (H)ead");
        System.out.println("New (A)rm");
        System.out.println("New (L)ocomotor");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'T' || input == 't'){
            newTorso();
        }
        else if (input == 'B' || input == 'b'){
            newBattery();
        }
        else if (input == 'H' || input == 'h'){
            newHead();
        }
        else if (input == 'A' || input == 'a'){
            newArm();
        }
        else if (input == 'L' || input == 'l'){
            newLocomotor();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }
    
    public static void editPart(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("======Part Editor=======");
        System.out.println("");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }
    
    public static void browseParts(){
        
    }
        
    public static void searchParts(){
        
    }
    
    public static void newTorso(){
        // Create new Torso here
//        String name;
//        double weight;
//        double price;
//        String description;
//        boolean approved;
//        boolean obsolete;
    }
    
    public static void newBattery(){
        // Create new battery here
//        String name;
//        double weight;
//        double price;
//        String description;
//        boolean approved;
//        boolean obsolete;
//        double energy;
//        double maxPower;
       
   }
    
    public static void newHead(){
        // Create new head here
//        String name;
//        double weight;
//        double price;
//        String description;
//        boolean approved;
//        boolean obsolete;
    }
    
    public static void newArm(){
        // Create new arm here
//        String name;
//        double weight;
//        double price;
//        String description;
//        boolean approved;
//        boolean obsolete;
    }
    
    public static void newLocomotor(){
        // Create new locomotor here
//        String name;
//        double weight;
//        double price;
//        String description;
//        boolean approved;
//        boolean obsolete;
    }
    
    public static void main(String[] args){
        partManager();
    }
}
