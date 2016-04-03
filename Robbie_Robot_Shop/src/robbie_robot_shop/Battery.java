/*
 */
package robbie_robot_shop;

/**
 *
 */
public class Battery extends Component{
    private double energy;
    private double maxPower;

    
    public Battery()
    {
        super();     
    }
    
    public double getEnergy()
    {
        return this.energy;
    }
    
    public double getMaxPower()
    {
        return this.maxPower;
    }
    
    public void setEnergy( double myEnergy){
        this.energy = myEnergy;
    }
    
    public void setMaxPower(double myMaxPower){
        this.maxPower = myMaxPower;
    }
    
    
}