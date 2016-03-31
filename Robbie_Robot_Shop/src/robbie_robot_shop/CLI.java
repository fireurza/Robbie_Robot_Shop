/*
 */
package robbie_robot_shop;

import java.util.Scanner;

/*
 */
public class CLI {
    
    /*
    * Print a brief explanation of navigating through the CLI
    */
    private static void printHelp() {
         System.out.println("Type the number next to the desired optionto select an option");
         System.out.println("");
     }
    
    private static void printTitle() {
        System.out.println("========================");
        System.out.println("Welcome to Robbie Robots");
        System.out.println("========================");
    }
    
    private static int menu1() {
        printTitle();
        System.out.println("==========MAIN==========");
        System.out.println("");
        System.out.println("1 - Shop");
        System.out.println("2 - Exit");
        System.out.println("");
        printHelp();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        return input;
    }
    
    private static void clearScreen(){
        for(int i = 1; i< 100; i++){
            System.out.println("");
        }
    }
    
    private static int shop(){
        clearScreen();
        printTitle();
        System.out.println("==========SHOP==========");
        System.out.println("");
        System.out.println("1 - Create Part");
        System.out.println("2 - Design Model");
        System.out.println("3 - Browse Catalog");
        System.out.println("4 - Exit");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        return input;
        }
    
    public static void main(String[] args) {
        clearScreen();
        // Display menu 1
        int input = menu1();
        boolean done = false;
        // Check menu 1 selection
        if(input == 1){
            do {
            clearScreen();
            // Call Shop Function
            int input2 = shop();
            if (input2 == 1){
                // Create part
            }
            if (input2 == 2){
                // Design Model
            }
            if (input2 == 3){
                // Browse Catalog
            }
            if (input2 == 4){
                // exit shopping menu
                done = true;
            }
            else {
                System.out.println("Unrecognized input");
                
            }
            }while (!done);
        }
        else if(input == 2){
            clearScreen();
            // Exit Program Function
            return;
        }
        else {
            System.out.println("Unrecognized input, pleaswe try again");
        }
    }
}
