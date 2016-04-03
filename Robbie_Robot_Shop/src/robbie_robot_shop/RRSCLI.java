/*
 */
package robbie_robot_shop;

/*
 */
public class RRSCLI {
    
    /*
    * Print a brief explanation of navigating through the RRSCLI
    */
    
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
    
    public static void main(String[] args){
        boolean exit = false;
        do{
        clearScreen();
        printTitle();
        System.out.println("==========SHOP==========");
        System.out.println("");
        System.out.println("(P)arts");
        //System.out.println("(M)odels");
        //System.out.println("(O)rders");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'P' || input == 'p'){
            RRSCLIPartManager.partManager();
        }
        else if (input == 'M' || input == 'm'){
            
        }
        else if (input == 'O' || input == 'o'){
            
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
        
        }
}
