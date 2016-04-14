
package robbie_robot_shop;


public class Boss {
    private String name;
    private int employeeNumber=1;
    
    public Boss(String name){
        this.name = name;
        this.employeeNumber = employeeNumber++;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
