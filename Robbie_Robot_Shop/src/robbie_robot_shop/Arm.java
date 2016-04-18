/*
 */
package robbie_robot_shop;

/**
 *
 */
public class Arm extends Component{
    private double powerConsumptionRate;
    
    public Arm()
    {
        super();   
    }
    
    public void setPowerConsumptionRate(double myPowerConsumptionRate){
        this.powerConsumptionRate = myPowerConsumptionRate;
    }
    
    public double getPowerConsumptionRate(){
        return this.powerConsumptionRate;
    }
    
    public double powerConsumed(int speed){
        double powerConsumed = this.powerConsumptionRate * speed;
        return powerConsumed;
    }
    
    
    
}
