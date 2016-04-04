/*

 */
package robbie_robot_shop;

/**
 *
 */
public abstract class Component {
    private String name;
    private int partNumber = 0; 
    private String type;
    private double weight;
    private double price;
    private String description;
    private boolean isObsolete = false; // A way to mark obsolete parts
    private boolean isApproved = false; // A way to limit parts from production while testing
    private static int numberOfParts = 0; //# of parts in sequestial whole numbers
    // Constructors for createing new parts
    public Component(String myName, String myType, double myWeight, double myPrice, String myDescription, boolean myObsolete, boolean myApproved)
    {
        this.name = myName;
        this.partNumber = numberOfParts++;
        this.type = myType;
        this.weight = myWeight;
        this.price = myPrice;
        this.description = myDescription;
        this.isObsolete = myObsolete;
        this.isApproved = myApproved;
    }
    
    public Component(){
        
    }
    
    //Getters for viewing information
    public String getName(){
        return this.name;
    }
    
    public int getPartNumber(){
        return this.partNumber;
    }
    
    public String getType(){
        return this.type;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public boolean getIsObsolete() {
        return isObsolete;
    }
    
    public boolean getIsApproved() {
        return isApproved;
    }
    
    // Setters for editing information
    public void setName(String myName){
        this.name = myName;
    }
    
    public void setPartNumber(int myPartNumber){
        this.partNumber = myPartNumber;
    }
    
    public void setType(String myType){
        this.type = myType;
    }
    
    public void setWeight(double myWeight){
        this.weight = myWeight;
    }
    
    public void setPrice(double myPrice){
        this.price = myPrice;
    }
    
    public void setDescription(String myDescription){
        this.description = myDescription;
    }
    
    public void setObsolete(boolean myObsolete){
        this.isObsolete = myObsolete;
    }
    
    public void setApproved(boolean myApproved){
        this.isApproved = myApproved;
    }
}
