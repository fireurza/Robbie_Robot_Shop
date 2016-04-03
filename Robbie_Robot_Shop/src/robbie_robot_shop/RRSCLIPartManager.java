/*
 * Dustin Craig Keefer - 1000917479
 * CSE 1325 - Object Oriented Programming
 */
package robbie_robot_shop;

import java.util.Scanner;

/**
 *
 * @author dusti
 */
public class RRSCLIPartManager {
    
    public static void partManager(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("======Part Manager======");
        System.out.println("");
        //System.out.println("(V)iew Part");
        System.out.println("(N)ew part");
        //System.out.println("(E)dit Part");
        System.out.println("E(x)it");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 'V' || input == 'v'){
            viewPart();
        }
        else if (input == 'N' || input == 'n'){
            newPart();
        }
        else if (input == 'E' || input == 'e'){
            editPart();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }

    public static void viewPart(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("=======View Part========");
        System.out.println("");
        //System.out.println("(B)rowse");
        //System.out.println("(S)earch");
        System.out.println("E(x)it");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 'B' || input == 'b'){
            browseParts();
        }
        else if (input == 'S' || input == 's'){
            searchParts();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }

    public static void newPart(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Part Creator====");
        System.out.println("");
        System.out.println("New (T)orso");
        System.out.println("New (B)attery");
        System.out.println("New (H)ead");
        System.out.println("New (A)rm");
        System.out.println("New (L)ocomotor");
        System.out.println("E(x)it");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 'T' || input == 't'){
            newTorso();
        }
        else if (input == 'B' || input == 'b'){
            newBattery();
        }
        else if (input == 'H' || input == 'h'){
            newHead();
        }
        else if (input == 'A' || input == 'a'){
            newArm();
        }
        else if (input == 'L' || input == 'l'){
            newLocomotor();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }
    
    public static void editPart(){
        boolean exit = false;
        do{
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("======Part Editor=======");
        System.out.println("");
        System.out.println("E(x)it");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }
    
    public static void browseParts(){
        
    }
        
    public static void searchParts(){
        
    }
    
    public static void newTorso(){
        
    }
    
    public static void newBattery(){
        
    }
    
    public static void newHead(){
        
    }
    
    public static void newArm(){
        
    }
    
    public static void newLocomotor(){
        
    }
    
    public static void main(String[] args){
        partManager();
    }
}
