package robbie_robot_shop;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Gasser
 */
public class Shop {
     
    public static Order[] orders=new Order[10000];
    // Containers for parts
    private static Head[] HeadArray = new Head[100];
    private static Torso[] TorsoArray = new Torso[100];
    private static Arm[] ArmArray = new Arm[100];
    private static Battery[] BatteryArray = new Battery[100];
    private static Locomotor[] LocomotorArray = new Locomotor[100];
    public static Component[][] robotParts = {HeadArray, TorsoArray, ArmArray, BatteryArray, LocomotorArray};
    
    // Counters to keep track of array indexes
    public static int headCounter = 0;
    public static int torsoCounter = 0;
    public static int armCounter = 0;
    public static int batteryCounter = 0;
    public static int locomotorCounter = 0;
    public static int modelCounter = 0;
    public static int customerCounter = 0;
    public static int employeeCounter = 0;
    public static int orderCounter = 0;
    
    private static RobotModel[] robotModels=new RobotModel[100];
    private static Customer[] customers=new Customer[100];
    private static Employee[] employees=new Employee[100];
    
    // Constructor
    public Shop(){
         
     }   
    
    // Utility methods
    
    public static void createTorso(String Tname, double Tweight, double Tprice, String Tdescription, boolean Tobsolete, boolean Tapproved, int TbatteryCompartments, int TarmSockets){
        Torso T1 = new Torso();
        T1.setPartNumber(Component.getNumberOfParts() + 1); 
        Component.incrementNumberOfParts();
        T1.setType("torso");
        T1.setName(Tname);
        T1.setWeight(Tweight);
        T1.setPrice(Tprice);
        T1.setDescription(Tdescription);
        T1.setObsolete(Tobsolete);
        T1.setApproved(Tapproved);
        T1.setBatteryCompartments(TbatteryCompartments);
        T1.setArmSockets(TarmSockets);
        TorsoArray[torsoCounter++] = T1;
        IOFile file = new IOFile();
        file.writeComponentFile();
    }
    public static void createLocomotor(String Lname, double Lweight, double Lprice, String Ldescription, boolean Lobsolete, boolean Lapproved, double LmaxSpeed, double LpowerConsumptionRate){
        Locomotor L1 = new Locomotor();
        L1.setPartNumber(Component.getNumberOfParts() + 1);
        Component.incrementNumberOfParts();
        L1.setType("locomotor");
        L1.setName(Lname);
        L1.setWeight(Lweight);
        L1.setPrice(Lprice);
        L1.setDescription(Ldescription);
        L1.setObsolete(Lobsolete);
        L1.setApproved(Lapproved);
        L1.setMaxSpeed(LmaxSpeed);
        L1.setPowerConsumptionRate(LpowerConsumptionRate);
        LocomotorArray[locomotorCounter++] = L1;
        IOFile file = new IOFile();
        file.writeComponentFile();
    }
    public static void createBattery(String Bname, double Bweight, double Bprice, String Bdescription, boolean Bobsolete, boolean Bapproved, double Benergy, double BmaxPower){
        Battery B1 = new Battery();
        B1.setPartNumber(Component.getNumberOfParts() + 1);
        Component.incrementNumberOfParts();
        B1.setType("battery");
        B1.setName(Bname);
        B1.setWeight(Bweight);
        B1.setPrice(Bprice);
        B1.setDescription(Bdescription);
        B1.setObsolete(Bobsolete);
        B1.setApproved(Bapproved);
        B1.setEnergy(Benergy);
        B1.setMaxPower(BmaxPower);
        BatteryArray[batteryCounter++] = B1;
        IOFile file = new IOFile();
        file.writeComponentFile();
    }
    public static void createHead(String Hname, double Hweight, double Hprice, String Hdescription, boolean Hobsolete, boolean Happroved){
        Head H1 = new Head();
        H1.setPartNumber(Component.getNumberOfParts() + 1);
        Component.incrementNumberOfParts();
        H1.setType("head");
        H1.setName(Hname);
        H1.setWeight(Hweight);
        H1.setPrice(Hprice);
        H1.setDescription(Hdescription);
        H1.setObsolete(Hobsolete);
        H1.setApproved(Happroved);
        HeadArray[headCounter++] = H1;
        IOFile file = new IOFile();
        file.writeComponentFile();
    }
    public static void createArm(String Aname, double Aweight, double Aprice, String Adescription, boolean Aobsolete, boolean Aapproved, double ApowerConsumptionRate){
        Arm A1 = new Arm();
        A1.setPartNumber(Component.getNumberOfParts() + 1);
        Component.incrementNumberOfParts();
        A1.setType("arm");
        A1.setName(Aname);
        A1.setWeight(Aweight);
        A1.setPrice(Aprice);
        A1.setDescription(Adescription);
        A1.setObsolete(Aobsolete);
        A1.setApproved(Aapproved);
        A1.setPowerConsumptionRate(ApowerConsumptionRate);
        ArmArray[armCounter++] = A1;
        IOFile file = new IOFile();
        file.writeComponentFile();
    }
    
    public static void editPart(){
        
    }
    
    public static void createModel(String Name, int Torso, int Battery1, int Battery2, int Battery3, int Arm1, int Arm2, int Locomotor, int Head){
        RobotModel RM = new RobotModel();
        RM.setName(Name);
        RM.setTorso(Torso);
        RM.setBattery1(Battery1);
        RM.setBattery2(Battery2);
        RM.setBattery3(Battery3);
        RM.setArm1(Arm1);
        RM.setArm2(Arm2);
        RM.setLocomotor(Locomotor);
        RM.setHead(Head);
        robotModels[modelCounter++] = RM;
        IOFile file = new IOFile();
        file.writeModelFile();
    }
    
    
    
    public static void editModel(){
    
    }
    
    public static void newCustomer(String name){
        Customer C1 = new Customer(name);
        customers[customerCounter++] = C1;
        IOFile file = new IOFile();
        file.writeCustomerFile();
    }
    
    public static void newEmployee(String name, String type){
        Employee E1 = new Employee(name, type);
        employees[employeeCounter++] = E1;
        IOFile file = new IOFile();
        file.writeEmployeeFile();
    }
    
    public static void editCustomer(){
        
    }
    
    public static void newOrder(int customer, int salesAssociate, int lineItem, int quantity, double billed){
        Order O1 = new Order(customer, salesAssociate, lineItem, quantity, billed);   
        orders[orderCounter++] = O1;
        double currentBill = customers[customer].getBill();
        currentBill = currentBill + billed;
        customers[customer].setBill(currentBill);
        IOFile file = new IOFile();
        file.writeOrderFile();
    }
    
    public static void runReport(){
        
    }
    
    public static void save(){
    
    }
    
    // Getters for separate component arrays
    public static Head[] getHeadArray(){
        return HeadArray;
    }
    public static Torso[] getTorsoArray(){
        return TorsoArray;
    }
    public static Arm[] getArmArray(){
        return ArmArray;
    }
    public static Battery[] getBatteryArray(){
        return BatteryArray;
    }
    public static Locomotor[] getLocomotorArray(){
        return LocomotorArray;
    }
    public static RobotModel[] getRobotModels(){
        return robotModels;
    }
    
    public static Customer[] getCustomers(){
        return customers;
    }
    
    public static Employee[] getEmployees(){
        return employees;
    }
    
    public static Order[] getOrders(){
        return orders;
    }
}
