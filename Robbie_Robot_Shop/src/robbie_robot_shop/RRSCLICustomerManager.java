/*
 * Dustin Craig Keefer - 1000917479
 * CSE 1325 - Object Oriented Programming
 */
package robbie_robot_shop;

/**
 *
 * @author dusti
 */
public class RRSCLICustomerManager {
    public static void customerManager(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("======Customer Manager======");
        System.out.println("");
//        System.out.println("(S)earch Customers");
        System.out.println("(B)rowse Customers");
//        System.out.println("(E)dit Customer");
        System.out.println("(N)ew Customer");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'S' || input == 's'){
            searchCustomers();
        }
        else if (input == 'B' || input == 'b'){
            browseCustomers();
        }
        else if (input == 'E' || input == 'e'){
            editCustomer();
        }
        else if (input == 'N' || input == 'n'){
            newCustomer();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }
    
    public static void newCustomer(){
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Customer Creator====");
        System.out.println("");
        String customerName = CLIinput.getString(" Enter the customers name");
        
        // disply options to user
        System.out.println("");
        System.out.println("");
        System.out.println(customerName);
        System.out.println("");
        
        // verify to create model or exit
        int input = CLIinput.getChar(" (C)reate customer or E(x)it ");
        if (input == 'C' || input == 'c'){
            // shop call to create model
            Shop.newCustomer(customerName);
        }
        else if (input == 'X' || input == 'x'){
            return;
        }
        else {
            System.out.println("Unrecognized input: Default action E(x)it");
        }
    }
    
    public static void editCustomer(){
        
    }
    
    public static void browseCustomers(){
        boolean exit = false;
        // Display Parts
       
            printAllCustomers();
        
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
    
    public static void searchCustomers(){
        
    }
    
    public static void viewCustomer(){
        
    }
    
    public static void printAllCustomers(){
        Customer[] customers = Shop.getCustomers();
        System.out.println("Customer Number, Name, Bill");
        
            
        for(int i = 0; i < Shop.customerCounter; i++){
            if(customers[i] != null){
                System.out.print(customers[i].getCustomerNumber());
                System.out.print(", ");
                System.out.print(customers[i].getName());
                System.out.print(", ");
                System.out.println(customers[i].getBill());
                
            }
        }
    }
}
