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
        Torso[] torsos = Shop.getTorsoArray();
        Head[] heads = Shop.getHeadArray();
        Arm[] arms = Shop.getArmArray();
        Locomotor[] locomotors = Shop.getLocomotorArray();
        Battery[] batteries = Shop.getBatteryArray();
        int BatteriesAvailable = 0;
        int ArmsAvailable = 0;
        int modelBattery[] = {-1,-1,-1};
        int modelArm[] = {-1,-1};
        
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Model Creator====");
        System.out.println("");
        // Display Torso Options
        RRSCLIPartManager.printAllComponents(1);
        // Get user input for torso type
        int modelTorso = CLIinput.getInt(" Enter a Torso part number");
        // Get number of batteries and arms supported by torso
        for (int i = 0; i < Shop.torsoCounter; i++){
            if(Shop.robotParts[1][i].getPartNumber() == modelTorso){
                BatteriesAvailable = torsos[i].getBatteryCompartments();
                ArmsAvailable = torsos[i].getArmSockets();
                break;
            }
        }
        RRSCLIPartManager.printAllComponents(3);
        // loop through getting user input on that many batteries
        for (int i = 1; i <= BatteriesAvailable; i++){
            modelBattery[i] = CLIinput.getInt(" Enter a Battery part number");
        }
        RRSCLIPartManager.printAllComponents(2);
        // loop through getting user input on that many arms
        for (int i = 1; i <= ArmsAvailable; i++){
            modelArm[i] = CLIinput.getInt(" Enter an Arm part number");
        }
        // disply Locomotor options
        RRSCLIPartManager.printAllComponents(4);
        // get user input for locomotor type
        int modelLocomotor = CLIinput.getInt(" Enter a Locomotor part number");
        // Display Head Options
        RRSCLIPartManager.printAllComponents(0);
        // get user input on head type
        int modelHead = CLIinput.getInt(" Enter a Head part number");
        // disply options to user
        System.out.println("");
        System.out.print("Torso: ");
        System.out.println(modelTorso);
        System.out.print("Batteries: ");
        for(int i = 1; i <= BatteriesAvailable; i++){
            System.out.print(modelBattery[i]);
            if(i < BatteriesAvailable){
            System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.print("Arms: ");
        for(int i = 1; i <= ArmsAvailable; i++){
            System.out.print(modelArm[i]);
            if(i < ArmsAvailable){
            System.out.print(", ");
            }
        }
        System.out.print("Locomotor: ");
        System.out.println(modelLocomotor);
        System.out.print("Head: ");
        System.out.println(modelHead);
        // verify to create model or exit
        int input = CLIinput.getChar(" (C)reate model or E(x)it ");
        if (input == 'C' || input == 'c'){
            // shop call to create model
            Shop.createModel(modelTorso, modelBattery[1], modelBattery[2], modelBattery[3], modelArm[1], modelArm[2], modelLocomotor, modelHead);
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
