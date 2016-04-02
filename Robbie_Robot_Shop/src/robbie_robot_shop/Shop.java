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
    
    public Shop(){
         
     }   
    
    void createRobotPart(){}
    
    void createRobotModel(){}
    
    void newCustomer(){}
    
    void placeOrder(){}
    
    void runReport(){}
    
    void save(){}
}
