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
        int quantity = 0;
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Order Creator====");
        System.out.println("");
        RRSCLICustomerManager.printAllCustomers();
        int customerName = CLIinput.getInt(" Enter the customers number");
        // TODO Check if that is a valid customer
        RRSCLIEmployeeManager.printAllEmployees();
        int employeeName = CLIinput.getInt(" Enter Sales Associate Number");
        // TODO Check if that is a valid sales associate
        RRSCLIModelManager.printAllModels();
        int robotModel = CLIinput.getInt(" Enter robot model");
        // TODO Check if that is a valid robot model
        do{
        quantity = CLIinput.getInt("Enter quantity requested");
        }while (quantity<1);
        
        // disply options to user
        System.out.println("");
        System.out.println("");
        System.out.print("Customer Name: ");
        Customer customers[] = Shop.getCustomers();
        System.out.println(customers[customerName].getName());
        System.out.print("Sales Associate: ");
        Employee employees[] = Shop.getEmployees();
        System.out.println(employees[employeeName].getName());
        System.out.println("RobotModel: ");
        RobotModel robots[] = Shop.getRobotModels();
        System.out.println(robots[robotModel].getName());
        System.out.print("Quantity Sold: ");
        System.out.println(quantity);
        System.out.print("Price Billed: ");
        // TODO Calculate bill
        System.out.println("");
        
        // verify to create model or exit
        int input = CLIinput.getChar(" (C)reate order or E(x)it ");
        if (input == 'C' || input == 'c'){
            // shop call to create model
            // TODO calculate bill
            double bill = 0;
            //double bill = robots(robotModel].getPrice * quantity;
            Shop.newOrder(customerName, employeeName, robotModel, quantity, bill);
            // TODO Add bill to customers data
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
        System.out.println("Order Number, Date order placed, Customer, Sales Associate, Robot Model, Quantity, Status");
        Customer customers[] = Shop.getCustomers();
        Employee employees[] = Shop.getEmployees();
        RobotModel robots[] = Shop.getRobotModels();
        
        for(int i = 0; i < Shop.orderCounter; i++){
            if(orders[i] != null){
                System.out.print(orders[i].getOrderNumber());
                System.out.print(", ");
                System.out.print(orders[i].getDate());
                System.out.print(", ");
                System.out.print(customers[orders[i].getCustomer()].getName());
                System.out.print(", ");
                System.out.print(employees[orders[i].getEmployee()].getName());
                System.out.print(", ");
                System.out.print(robots[orders[i].getLineItem()].getName());
                System.out.print(", ");
                System.out.print(orders[i].getQuantity());
                System.out.print(", ");
                System.out.println(orders[i].getStatus());
            }
        }
    }
}
