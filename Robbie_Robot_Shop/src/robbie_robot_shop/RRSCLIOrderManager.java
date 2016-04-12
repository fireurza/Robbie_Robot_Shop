/*
 * Dustin Craig Keefer - 1000917479
 * CSE 1325 - Object Oriented Programming
 */
package robbie_robot_shop;

/**
 *
 * @author dusti
 */
public class RRSCLIOrderManager {
    public static void orderManager(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("======Order Manager======");
        System.out.println("");
//        System.out.println("(S)earch Orders");
        System.out.println("(B)rowse Orders");
//        System.out.println("(E)dit Order");
        System.out.println("(N)ew Order");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'S' || input == 's'){
            searchOrders();
        }
        if (input == 'B' || input == 'b'){
            browseOrders();
        }
        else if (input == 'E' || input == 'e'){
            editOrder();
        }
        else if (input == 'N' || input == 'n'){
            newOrder();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }
    
    public static void newOrder(){
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Order Creator====");
        System.out.println("");
        int customerName = CLIinput.getInt(" Enter the customers number");
        int employeeName = CLIinput.getInt(" Enter Sales Associate Number");
        int robotModel = CLIinput.getInt(" Enter robot model");
        int quantity = CLIinput.getInt("Enter quantity requested");
        
        // disply options to user
        System.out.println("");
        System.out.println("");
        System.out.println(customerName);
        System.out.println(employeeName);
        System.out.println(robotModel);
        System.out.println(quantity);
        System.out.println("");
        
        // verify to create model or exit
        int input = CLIinput.getChar(" (C)reate order or E(x)it ");
        if (input == 'C' || input == 'c'){
            // shop call to create model
            Shop.newOrder(customerName, employeeName, robotModel, quantity);
        }
        else if (input == 'X' || input == 'x'){
            return;
        }
        else {
            System.out.println("Unrecognized input: Default action E(x)it");
        }
    }
    
    public static void editOrder(){
        
    }
    
    public static void browseOrders(){
        boolean exit = false;
        // Display Parts
       
            printAllOrders();
        
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
    
    public static void searchOrders(){
        
    }
    
    public static void viewOrder(){
        
    }
    
    public static void printAllOrders(){
        Order[] orders = Shop.getOrders();
        System.out.println("Customer, Sales Associate, Robot Model, Quantity");
        
            
        for(int i = 0; i < Shop.orderCounter; i++){
            if(orders[i] != null){
                System.out.print(orders[i].getOrderNumber());
                System.out.print(", ");
                System.out.print(orders[i].getDate());
                System.out.print(", ");
                System.out.print(orders[i].getCustomer());
                System.out.print(", ");
                System.out.print(orders[i].getEmployee());
                System.out.print(", ");
                System.out.print(orders[i].getLineItem());
                System.out.print(", ");
                System.out.print(orders[i].getQuantity());
                System.out.print(", ");
                System.out.println(orders[i].getStatus());
            }
        }
    }
}
