/*
 * Dustin Craig Keefer - 1000917479
 * CSE 1325 - Object Oriented Programming
 */
package robbie_robot_shop;

/**
 *
 * @author dusti
 */
public class RRSCLIModelManager {
    
    public static void modelManager(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("======Model Manager======");
        System.out.println("");
//        System.out.println("(S)earch Models");
        System.out.println("(B)rowse Models");
//        System.out.println("(E)dit Model");
        System.out.println("(N)ew Models");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'S' || input == 's'){
            searchModels();
        }
        if (input == 'B' || input == 'b'){
            browseModels();
        }
        else if (input == 'E' || input == 'e'){
            editModel();
        }
        else if (input == 'N' || input == 'n'){
            newModel();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }
    
    public static void newModel(){
        Component[][] ArrayOfParts = Shop.robotParts; 
        int BatteriesAvailable = 0;
        int ArmsAvailable = 0;
                
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Model Creator====");
        System.out.println("");
        // Display Torso Options
        RRSCLIPartManager.printAllComponents(1);
        // Get user input for torso type
        int modelTorso = CLIinput.getChar(" Enter a Torso part number");
        // Get number of batteries and arms supported by torso
        for (int i = 0; i < Shop.torsoCounter; i++){
            if(Shop.robotParts[1][i].getPartNumber() == modelTorso){
//                BatteriesAvailable = ArrayOfParts[1][i].getBatteryCompartments();
//                ArmsAvailable = ArrayOfParts[1][i].getArmSockets();
                break;
            }
        }
        // loop through getting user input on that many battries
        for (int i = 0; i <= BatteriesAvailable; i++){
            
        }
        // loop through getting user input on that many arms
        for (int i = 0; i <= ArmsAvailable; i++){
            
        }
        // disply Locomotor options
        // get user input for locomotor type
        // Display Head Options
        RRSCLIPartManager.printAllComponents(0);
        // get user input on head type
        int modelHead = CLIinput.getChar(" Enter a Head part number");
        // disply options to user
        
// verify to create model or exit
        int input = CLIinput.getChar(" (C)reate model or E(x)it ");
        if (input == 'C' || input == 'c'){
            // shop call to create model
        }
        else if (input == 'X' || input == 'x'){
            return;
        }
        else {
            System.out.println("Unrecognized input: Default action E(x)it");
        }
    }
    
    public static void editModel(){
        
    }
    
    public static void browseModels(){
        
    }
    
    public static void searchModels(){
        
    }
    
    public static void viewModel(){
        
    }
}
