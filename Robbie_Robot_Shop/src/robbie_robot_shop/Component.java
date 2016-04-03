/*

 */
package robbie_robot_shop;

/**
 *
 */
public abstract class Component {
    private String name;
    private int partNumber;
    private String type;
    private double weight;
    private double price;
    
    // Constructors for createing new parts
    public Component(String myName, int myPartNumber, String myType, double myWeight, double myPrice)
    {
        this.name = myName;
        this.partNumber = myPartNumber;
        this.type = myType;
        this.weight = myWeight;
        this.price = myPrice;
    }
    
    public Component(){
        
    }
    
    //Getters for viewing information
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
    
    // Setters for editing information
    public void setName(String myName)
    {
        this.name = myName;
    }
    
    public void setPartNumber(int myPartNumber)
    {
        this.partNumber = myPartNumber;
    }
    
    public void setType(String myType)
    {
        this.type = myType;
    }
    
    public void setWeight(double myWeight)
    {
        this.weight = myWeight;
    }
    
    public void setPrice(double myPrice)
    {
        this.price = myPrice;
    }
}
