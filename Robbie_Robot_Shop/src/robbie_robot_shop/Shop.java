package robbie_robot_shop;

/**
 *
 * @author Gasser
 */
public class Shop {
     
    Order[] orders=new Order[10000];
    Component[] robotParts=new Component[100];
    RobotModel[] robotModels=new RobotModel[100];
    Customer[] customers=new Customer[100];
    SalesAssociate[] salesAssociates=new SalesAssociate[100];
    
    // Constructor
    public Shop(){
         
     }   
    
    // Utility methods
    
    public static void createTorso(String name, double weight, double price, String description, boolean obsolete, boolean approved){
    
    }
    public static void createLocomotor(String Lname, double Lweight, double Lprice, String Ldescription, boolean Lobsolete, boolean Lapproved, double LmaxSpeed, double LpowerConsumed){
        
    }
    public static void createBattery(String Bname, double Bweight, double Bprice, String Bdescription, boolean Bobsolete, boolean Bapproved, double Benergy, double BmaxPower){
        
    }
    public static void createHead(String Hname, double Hweight, double Hprice, String Hdescription, boolean Hobsolete, boolean Happroved){
        
    }
    public static void createArm(String Aname, double Aweight, double Aprice, String Adescription, boolean Aobsolete, boolean Aapproved, double ApowerConsumption){
        
    }
    
    public static void editPart(){
        
    }
    
    public static void createModel(){
    
    }
    
    public static void editModel(){
    
    }
    
    public static void newCustomer(){
    
    }
    
    public static void editCustomer(){
        
    }
    
    public static void placeOrder(){
    
    }
    
    public static void runReport(){
    
    }
    
    public static void save(){
    
    }
}
