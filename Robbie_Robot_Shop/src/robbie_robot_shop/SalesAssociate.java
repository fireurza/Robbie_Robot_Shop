package robbie_robot_shop;


public class SalesAssociate {
    private String name;
    private int employeeNumber=1;
//    Order[] orders=new Order[100000];
    
    public SalesAssociate(String name){
    this.name=name;
    this.employeeNumber=this.employeeNumber++;
    }
    
    public String getName(){
        return this.name;
    }
     public void setName(String name){
         this.name = name;
     }
    
    public int getEmployeeNumber(){
        return this.employeeNumber;
    }
}
