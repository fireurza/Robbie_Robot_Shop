/*
 */
package robbie_robot_shop;

import java.util.Scanner;

/*
 */
public class RRSCLI {
    
    /*
    * Print a brief explanation of navigating through the RRSCLI
    */
    private static void printHelp() {
         System.out.println("Type the number next to the desired optionto select an option");
         System.out.println("");
     }
    
    private static void printTitle() {
        System.out.println("========================");
        System.out.println("     Robbie Robots");
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
        System.out.println("1 - Parts");
        System.out.println("2 - Models");
        System.out.println("3 - Orders");
        System.out.println("4 - Exit");
        System.out.println("");
        printHelp();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        return input;
        }
    
    private static int part(){
        clearScreen();
        printTitle();
        System.out.println("==========PART==========");
        System.out.println("");
        System.out.println("1 - Create New Part");
        System.out.println("2 - Edit Old Part");
        System.out.println("3 - Browse Parts");
        System.out.println("4 - Exit");
        System.out.println("");
        printHelp();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        return input;
        }
    
    private static int model(){
        clearScreen();
        printTitle();
        System.out.println("==========PART==========");
        System.out.println("");
        System.out.println("1 - Create New Model");
        System.out.println("2 - Edit Old Model");
        System.out.println("3 - Browse Models");
        System.out.println("4 - Exit");
        System.out.println("");
        printHelp();
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
                int input3 = part();// Create part
                if (input3 == 1){
                    // Create New Part
                }
                if (input3 == 2){
                    
                }
                if (input3 == 3){
                    
                }
                if (input3 == 4){
                    
                }
            }
            else if (input2 == 2){
                // Design Model
            }
            else if (input2 == 3){
                // Browse Catalog
            }
            else if (input2 == 4){
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
            // Exit Program Function - Save any data and exit gracefully
            
            return;
        }
        else {
            System.out.println("Unrecognized input, pleaswe try again");
        }
    }
}
