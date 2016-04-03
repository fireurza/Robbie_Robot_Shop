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

/**
 *
 */
public class CLIinput {
    
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
}
