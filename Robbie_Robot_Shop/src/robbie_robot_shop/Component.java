/*

 */
package robbie_robot_shop;

/**
 *
 */
public abstract class Component {
    String name;
    int partNumber;
    String type;
    double weight;
    double price;
    
    public Component(String myName, int myPartNumber, String myType, double myWeight, double myPrice)
    {
        this.name = myName;
        this.partNumber = myPartNumber;
        this.type = myType;
        this.weight = myWeight;
        this.price = myPrice;
    }
    
    public Component()
    {
     
    }
    
    //Getters
    public String getName()
    {
        return this.name;
    }
    
    public int getPartNumber()
    {
        return this.partNumber;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public double getWeight()
    {
        return this.weight;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    public void create()
    {
        
    }
    
    public void view()
    {
        
    }
    
    
    abstract void printSpecs(); 
}
