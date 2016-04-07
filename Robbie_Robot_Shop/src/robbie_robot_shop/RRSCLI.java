/*
 * Dustin Craig Keefer
 * RobbieRobots CLI Main Menu
 */
package robbie_robot_shop;

//import java.io.File;
import java.io.IOException;
//import java.util.Formatter;

public class RRSCLI {
    
    public static void main(String[] args) throws IOException{
        boolean exit = false;
        do{
        clearScreen();
        printTitle();
        System.out.println("==========SHOP==========");
        System.out.println("");
        System.out.println("(P)arts");
        System.out.println("(M)odels");
        System.out.println("(O)rders");
        System.out.println("(C)ustomers");
        System.out.println("(E)mployees");
        System.out.println("(R)eports");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'P' || input == 'p'){
            RRSCLIPartManager.partManager();
        }
        else if (input == 'M' || input == 'm'){
            RRSCLIModelManager.modelManager();
        }
        else if (input == 'O' || input == 'o'){
            RRSCLIOrderManager.orderManager();
        }
        else if (input == 'C' || input == 'c'){
            RRSCLICustomerManager.customerManager();
        }
        else if (input == 'E' || input == 'e'){
            RRSCLIEmployeeManager.employeeManager();
        }
        else if (input == 'R' || input == 'r'){
            RRSCLIReportManager.reportManager();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
//        IOFile.writeAll();
    }
    
    public static void printTitle() {
        System.out.println("========================");
        System.out.println("     Robbie Robots");
        System.out.println("========================");
    }
    
    public static void clearScreen(){
        for(int i = 1; i< 100; i++){
            System.out.println("");
        }
    }
}
