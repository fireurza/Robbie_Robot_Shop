package robbie_robot_shop;


public class Employee {
    private String name;
    private int employeeNumber=1;
    private String type;
//    Order[] orders=new Order[100000];
    
    public Employee(String name, String type){
    this.name=name;
    this.type = type;
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
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }
}
