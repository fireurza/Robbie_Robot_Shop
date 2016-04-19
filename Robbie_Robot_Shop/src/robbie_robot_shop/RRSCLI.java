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
        else if (input == 'T' || input == 't'){
            createTestData();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
        
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
    
    public static void createTestData(){
        // if part count = 0 make all test parts
        if (Shop.torsoCounter == 0){
            Shop.createTorso("testTorso", 99.99, 99.99, "testTorso Description", false, true, 3, 2);
        }
        if (Shop.armCounter == 0){
            Shop.createArm("testArm", 99.99, 99.99, "testArm Description", false, true, 99.99);
        }
        if (Shop.headCounter == 0){
            Shop.createHead("testHead", 99.99, 99.99, "testHead Description", false, true);
        }
        if (Shop.batteryCounter == 0){
            Shop.createBattery("testBattery", 99.99, 99.99, "testBattery Description", false, true, 99.99, 99.99);
        }
        if (Shop.locomotorCounter == 0){
            Shop.createLocomotor("testLocomotor", 99.99, 99.99, "testLocomotor Description", false, true, 99.99, 99.99);
        }
        // make test model
        if (Shop.modelCounter == 0){
            Shop.createModel("testModel", 0, 3, 3, 3, 1, 1, 4, 2);
        }
        // make test customer
        if (Shop.customerCounter == 0){
            Shop.newCustomer("testCustomer");
        }
        // make test employee - salesAssociate & Boss
        if (Shop.employeeCounter == 0){
            Shop.newEmployee("testSalesAssociate", "Sales");
            Shop.newEmployee("testBOSS", "Boss");
        }
        // make test order
        if (Shop.orderCounter == 0){
            Shop.newOrder(0, 0, 0, 99, 1.0);
        }
        IOFile file = new IOFile();
        file.writeAll();
        

        System.out.println("TEST parts, model, customer, & employees created");
    }
}