/*
 * Dustin Craig Keefer - 1000917479
 * CSE 1325 - Object Oriented Programming
 */
package robbie_robot_shop;

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
        System.out.println("(S)earch Parts");
        System.out.println("(B)rowse Parts");
        System.out.println("(E)dit Part");
        System.out.println("(N)ew part");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'S' || input == 's'){
            searchParts();
        }
        if (input == 'B' || input == 'b'){
            browseParts();
        }
        else if (input == 'E' || input == 'e'){
            editPart();
        }
        else if (input == 'N' || input == 'n'){
            newPart();
        }
        else if (input == 'X' || input == 'x'){
            exit = true;
        }
        else{
            System.out.println("Unrecognized Input");
        }
        }while(!exit);
    }

    public static void viewPart(int partNumber){
        // Display part information on screen
        
//        boolean exit = false;
//        do{
//        RRSCLI.clearScreen();
//        RRSCLI.printTitle();
//        System.out.println("=======View Part========");
//        System.out.println("");
//        //System.out.println("(B)rowse");
//        //System.out.println("(S)earch");
//        System.out.println("E(x)it");
//        int input = CLIinput.getChar(" Select Option ");
//        if (input == 'B' || input == 'b'){
//            browseParts();
//        }
//        else if (input == 'S' || input == 's'){
//            searchParts();
//        }
//        else if (input == 'X' || input == 'x'){
//            exit = true;
//        }
//        else{
//            System.out.println("Unrecognized Input");
//        }
//        }while(!exit);
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
        int input = CLIinput.getChar(" Select Option ");
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
        System.out.println("Enter part number");
        System.out.println("E(x)it");
        int input = CLIinput.getChar(" Select Option ");
        if (input == 'X' || input == 'x'){
            exit = true;
        }
        // TODO Part Number Lookup
        // viewPart(input);
        else{
            System.out.println("Unrecognized Part Number");
        }
        }while(!exit);
    }
    
    public static void browseParts(){
        // TODO Display Parts
            // Open part file
            // display contents
            // give options to sort by different categories
    }
        
    public static void searchParts(){
        // TODO Search Through Parts
            // open part file
            // give option to search by category and give input
            // display items corresponing to input
    }
    
    public static void newTorso(){
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Torso Creator===");
        System.out.println("");
        String Tname = CLIinput.getString("Enter Name");
        double Tweight = CLIinput.getDouble("Enter Weight ##.##");
        double Tprice = CLIinput.getDouble("Enter Price");
        String Tdescription = CLIinput.getString("Enter Description");
        boolean Tobsolete = CLIinput.getBoolean("Is this an Obsolete part (Y/N)");
        boolean Tapproved = CLIinput.getBoolean("Has this part been Approved (Y/N)");
        System.out.println("Is this information correct?");
        System.out.println(Tname);
        System.out.println(Tweight);
        System.out.println(Tprice);
        System.out.println(Tdescription);
        System.out.println(Tobsolete);
        System.out.println(Tapproved);
        System.out.println("");
        int input = CLIinput.getChar(" (C)reate part or E(x)it ");
        if (input == 'C' || input == 'c'){
            Shop.createTorso(Tname, Tweight, Tprice, Tdescription, Tobsolete, Tapproved);
        }
        else if (input == 'X' || input == 'x'){
            return;
        }
    }
    
    public static void newBattery(){
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Battery Creator====");
        System.out.println("");
        String Bname = CLIinput.getString("Enter Name");
        double Bweight = CLIinput.getDouble("Enter Weight ##.##");
        double Bprice = CLIinput.getDouble("Enter Price");
        String Bdescription = CLIinput.getString("Enter Description");
        boolean Bobsolete = CLIinput.getBoolean("Is this an Obsolete part (Y/N)");
        boolean Bapproved = CLIinput.getBoolean("Has this part been Approved (Y/N)");
        double Benergy = CLIinput.getDouble("How much Energy does this battery have ##.##");
        double BmaxPower = CLIinput.getDouble("What is this batteries Max Power rating ##.##");
        System.out.println("Is this information correct?");
        System.out.println(Bname);
        System.out.println(Bweight);
        System.out.println(Bprice);
        System.out.println(Bdescription);
        System.out.println(Bobsolete);
        System.out.println(Bapproved);
        System.out.println(Benergy);
        System.out.println(BmaxPower);
        System.out.println("");
        int input = CLIinput.getChar(" (C)reate part or E(x)it ");
        if (input == 'C' || input == 'c'){
            Shop.createBattery(Bname, Bweight, Bprice, Bdescription, Bobsolete, Bapproved, Benergy, BmaxPower);
        }
        else if (input == 'X' || input == 'x'){
            return;
        }
   }
    
    public static void newHead(){
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Head Creator====");
        System.out.println("");
        String Hname = CLIinput.getString("Enter Name");
        double Hweight = CLIinput.getDouble("Enter Weight ##.##");
        double Hprice = CLIinput.getDouble("Enter Price");
        String Hdescription = CLIinput.getString("Enter Description");
        boolean Hobsolete = CLIinput.getBoolean("Is this an Obsolete part (Y/N)");
        boolean Happroved = CLIinput.getBoolean("Has this part been Approved (Y/N)");
        System.out.println("Is this information correct?");
        System.out.println(Hname);
        System.out.println(Hweight);
        System.out.println(Hprice);
        System.out.println(Hdescription);
        System.out.println(Hobsolete);
        System.out.println(Happroved);
        System.out.println("");
        int input = CLIinput.getChar(" (C)reate part or E(x)it ");
        if (input == 'C' || input == 'c'){
            Shop.createHead(Hname, Hweight, Hprice, Hdescription, Hobsolete, Happroved);
        }
        else if (input == 'X' || input == 'x'){
            return;
        }
    }
    
    public static void newArm(){
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Arm Creator====");
        System.out.println("");
        String Aname = CLIinput.getString("Enter Name");
        double Aweight = CLIinput.getDouble("Enter Weight ##.##");
        double Aprice = CLIinput.getDouble("Enter Price");
        String Adescription = CLIinput.getString("Enter Description");
        boolean Aobsolete = CLIinput.getBoolean("Is this an Obsolete part (Y/N)");
        boolean Aapproved = CLIinput.getBoolean("Has this part been Approved (Y/N)");
        double ApowerConsumption = CLIinput.getDouble("What is this Arms Power Consumtion Rate ##.##");
        System.out.println("Is this information correct?");
        System.out.println(Aname);
        System.out.println(Aweight);
        System.out.println(Aprice);
        System.out.println(Adescription);
        System.out.println(Aobsolete);
        System.out.println(Aapproved);
        System.out.println(ApowerConsumption);
        System.out.println("");
        int input = CLIinput.getChar(" (C)reate part or E(x)it ");
        if (input == 'C' || input == 'c'){
            Shop.createArm(Aname, Aweight, Aprice, Adescription, Aobsolete, Aapproved, ApowerConsumption);
        }
        else if (input == 'X' || input == 'x'){
            return;
        }
    }
    
    public static void newLocomotor(){
        RRSCLI.clearScreen();
        RRSCLI.printTitle();
        System.out.println("====New Torso Creator===");
        System.out.println("");
        String Lname = CLIinput.getString("Enter Name");
        double Lweight = CLIinput.getDouble("Enter Weight ##.##");
        double Lprice = CLIinput.getDouble("Enter Price");
        String Ldescription = CLIinput.getString("Enter Description");
        boolean Lobsolete = CLIinput.getBoolean("Is this an Obsolete part (Y/N)");
        boolean Lapproved = CLIinput.getBoolean("Has this part been Approved (Y/N)");
        double LmaxSpeed = CLIinput.getDouble("What is the Max Speed of this Locomotor ##.##");
        double LpowerConsumed = CLIinput.getDouble("How power does this Locomotor Consume ##.##");
        System.out.println("Is this information correct?");
        System.out.println(Lname);
        System.out.println(Lweight);
        System.out.println(Lprice);
        System.out.println(Ldescription);
        System.out.println(Lobsolete);
        System.out.println(Lapproved);
        System.out.println(LmaxSpeed);
        System.out.println(LpowerConsumed);
        System.out.println("");
        int input = CLIinput.getChar(" (C)reate part or E(x)it ");
        if (input == 'C' || input == 'c'){
            Shop.createLocomotor(Lname, Lweight, Lprice, Ldescription, Lobsolete, Lapproved, LmaxSpeed, LpowerConsumed);
        }
        else if (input == 'X' || input == 'x'){
            return;
        }
    }
}
