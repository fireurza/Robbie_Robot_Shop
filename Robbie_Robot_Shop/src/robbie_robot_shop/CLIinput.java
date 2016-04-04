/*
 * Adapted for use from 
 * Java Programming for Engineers
 * Julio Sanchez, Maria P. Canton
 * ISBN: 0849308100
 * Publisher: CRC Press
 * 
 * MenuDemo.java
 * Chapter 9
 */
package robbie_robot_shop;

import java.io.IOException;
/**
 *
 */
public class CLIinput {
    
    public static int getInt(String userInput){
        while(true){
            flushInput();
            printInputPrompt(userInput);
            try{
                return Integer.valueOf(inString().trim()).intValue();
            }
            catch (NumberFormatException e){
                System.out.println("Invalid Input. Not An Integer");
            }
        }
    }
    
    public static char getChar(String userInput){
        int inputChar = 0;
        
        flushInput();
        printInputPrompt(userInput);
        
        try{
            inputChar = System.in.read();
        }
        
        catch (java.io.IOException e) {
            System.out.println("Input Error");
        }
        
        flushInput();
        
        return(char) inputChar;
    }
    
    public static void flushInput() {
        int trash;
        
        try {
            while((System.in.available()) != 0){
                trash = System.in.read();
            }
        }
        catch (java.io.IOException e){
            System.out.println("Input Error");
        }
    }
    
    public static void printInputPrompt(String inputPrompt){
        System.out.println(inputPrompt + " ");
        System.out.flush();
    }
    
    public static String getString(String userInput){
        flushInput();
        printInputPrompt(userInput);
        String additionalInput = inString();
        return additionalInput;
    }
    
    public static String inString(){
        int inputChar;
        String returnString = "";
        boolean finished = false;
        
        while (!finished){
            try{
                inputChar = System.in.read();
                if (inputChar < 0 || (char) inputChar == '\n'){
                    finished = true;
                }
                else if ((char) inputChar != '\r')
                    returnString = returnString + (char) inputChar; // Enter into string
            }
            catch (java.io.IOException e){
                System.out.println("Input Error");
                finished = true;
            }
        }
        return returnString;
    }
    
    public static double getDouble(String userInput){
        while(true){
            flushInput();
            printInputPrompt(userInput);
            try{
                return Double.valueOf(inString().trim()).doubleValue();
            }
            catch (NumberFormatException e){
                System.out.println("Invalid Input. Not A Floating Point Number");
            }
        }
    }
}
