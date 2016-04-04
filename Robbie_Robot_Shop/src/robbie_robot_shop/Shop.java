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
    
    public static Torso createTorso(String Tname, double Tweight, double Tprice, String Tdescription, boolean Tobsolete, boolean Tapproved, int TbatteryCompartments, int TarmSockets){
        Torso T1 = new Torso();
        T1.setType("Torso");
        T1.setName(Tname);
        T1.setWeight(Tweight);
        T1.setPrice(Tprice);
        T1.setDescription(Tdescription);
        T1.setObsolete(Tobsolete);
        T1.setApproved(Tapproved);
        T1.setBatteryCompartments(TbatteryCompartments);
        T1.setArmSockets(TarmSockets);
        return T1;
    }
    public static Locomotor createLocomotor(String Lname, double Lweight, double Lprice, String Ldescription, boolean Lobsolete, boolean Lapproved, double LmaxSpeed, double LpowerConsumptionRate){
        Locomotor L1 = new Locomotor();
        L1.setType("locomotor");
        L1.setName(Lname);
        L1.setWeight(Lweight);
        L1.setPrice(Lprice);
        L1.setDescription(Ldescription);
        L1.setObsolete(Lobsolete);
        L1.setApproved(Lapproved);
        L1.setMaxSpeed(LmaxSpeed);
        L1.setPowerConsumptionRate(LpowerConsumptionRate);
        return L1;
    }
    public static Battery createBattery(String Bname, double Bweight, double Bprice, String Bdescription, boolean Bobsolete, boolean Bapproved, double Benergy, double BmaxPower){
        Battery B1 = new Battery();
        B1.setType("battery");
        B1.setName(Bname);
        B1.setWeight(Bweight);
        B1.setPrice(Bprice);
        B1.setDescription(Bdescription);
        B1.setObsolete(Bobsolete);
        B1.setApproved(Bapproved);
        B1.setEnergy(Benergy);
        B1.setMaxPower(BmaxPower);
        return B1;
    }
    public static Head createHead(String Hname, double Hweight, double Hprice, String Hdescription, boolean Hobsolete, boolean Happroved){
        Head H1 = new Head();
        H1.setType("head");
        H1.setName(Hname);
        H1.setWeight(Hweight);
        H1.setPrice(Hprice);
        H1.setDescription(Hdescription);
        H1.setObsolete(Hobsolete);
        H1.setApproved(Happroved);
        return H1;
    }
    public static Arm createArm(String Aname, double Aweight, double Aprice, String Adescription, boolean Aobsolete, boolean Aapproved, double ApowerConsumptionRate){
        Arm A1 = new Arm();
        A1.setType("arm");
        A1.setName(Aname);
        A1.setWeight(Aweight);
        A1.setPrice(Aprice);
        A1.setDescription(Adescription);
        A1.setObsolete(Aobsolete);
        A1.setApproved(Aapproved);
        A1.setPowerConsumptionRate(ApowerConsumptionRate);
        return A1;
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
