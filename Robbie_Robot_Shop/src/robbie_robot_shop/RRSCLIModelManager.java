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
        System.out.println("======Model Manager=====");
        System.out.println("");
        System.out.println("(S)earch Models");
        System.out.println("(B)rowse Models");
        System.out.println("(E)dit Model");
        System.out.println("(N)ew Model");
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
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Model Creator====");
        System.out.println("");
        System.out.println("Choose (T)orso by entering it's part number");
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
    
    public static void editModel(){
        
    }
    
    public static void browseModels(){
        
    }
    
    public static void searchModels(){
        
    }
    
    public static void viewModel(){
        
    }
}
