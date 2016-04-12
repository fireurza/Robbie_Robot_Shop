/*
 * Dustin Craig Keefer - 1000917479
 * CSE 1325 - Object Oriented Programming
 */
package robbie_robot_shop;

/**
 *
 * @author dusti
 */
public class RRSCLIEmployeeManager {
    public static void employeeManager(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("======Employee Manager======");
        System.out.println("");
//        System.out.println("(S)earch Employees");
        System.out.println("(B)rowse Employees");
//        System.out.println("(E)dit Employee");
        System.out.println("(N)ew Employee");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'S' || input == 's'){
            searchEmployees();
        }
        if (input == 'B' || input == 'b'){
            browseEmployees();
        }
        else if (input == 'E' || input == 'e'){
            editEmployee();
        }
        else if (input == 'N' || input == 'n'){
            newEmployee();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }
    
    public static void newEmployee(){
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Employee Creator====");
        System.out.println("");
        String employeeName = CLIinput.getString(" Enter the employees name");
        String employeeType = CLIinput.getString(" Enter employee type");
        
        // disply options to user
        System.out.println("");
        System.out.println("");
        System.out.println(employeeName);
        System.out.println(employeeType);
        System.out.println("");
        
        // verify to create model or exit
        int input = CLIinput.getChar(" (C)reate employee or E(x)it ");
        if (input == 'C' || input == 'c'){
            // shop call to create model
            Shop.newEmployee(employeeName, employeeType);
        }
        else if (input == 'X' || input == 'x'){
            return;
        }
        else {
            System.out.println("Unrecognized input: Default action E(x)it");
        }
    }
    
    public static void editEmployee(){
        
    }
    
    public static void browseEmployees(){
        boolean exit = false;
        // Display Parts
       
            printAllEmployees();
        
        System.out.println("E(x)it");
        do{
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }
    
    public static void searchEmployees(){
        
    }
    
    public static void viewEmployee(){
        
    }
    
    public static void printAllEmployees(){
        Employee[] employees = Shop.getEmployees();
        System.out.println("Name, Employee Number");
        
            
        for(int i = 0; i < Shop.employeeCounter; i++){
            if(employees[i] != null){
                System.out.print(employees[i].getName());
                System.out.print(", ");
                System.out.println(employees[i].getEmployeeNumber());
            }
        }
    }
}
