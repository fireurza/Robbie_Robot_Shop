/*
 */
package robbie_robot_shop;

/**
 *
 */
public class Locomotor extends Component{
    double maxSpeed;
    double powerConsumptionRate;

    public Locomotor()
    {
        super();
    }
    
    public double getMaxSpeed(){
        return this.maxSpeed;
    }
    
    public double getPowerConsumtionRate(){
        return this.powerConsumptionRate;
    }
    
    public void setMaxSpeed(double myMaxSpeed){
        this.maxSpeed = myMaxSpeed;
    }
    
    public void setPowerConsumptionRate(double myPowerConsumptionRate){
        this.powerConsumptionRate = myPowerConsumptionRate;
    }
    
    public double powerConsumed(int speed){
        double powerConsumed = this.powerConsumptionRate * speed;
        return powerConsumed;
    }    
}
