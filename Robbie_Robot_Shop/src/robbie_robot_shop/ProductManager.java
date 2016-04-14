
package robbie_robot_shop;


public class ProductManager {
    private String name;
    private int employeeNumber=1;
    
    public ProductManager(String name){
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
