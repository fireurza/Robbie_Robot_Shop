/*
 */
package robbie_robot_shop;

/**
 *
 */
public class Battery extends Component{
    double energy = 100;
    double maxPower = 200;
    String myName = "Battery prototype";
    static int myPartNumber = 0;

    
    public Battery()
    {
        super();     
    }
    
    double getEnergy()
    {
        return this.energy;
    }
    
    double getMaxPower()
    {
        return this.maxPower;
    }
    
    @Override 
    protected void printSpecs()
    {
        System.out.println(this.myName);
    }
}
