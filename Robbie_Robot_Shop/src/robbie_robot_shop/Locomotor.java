/*
 */
package robbie_robot_shop;

/**
 *
 */
public class Locomotor extends Component{
    int maxSpeed;

    public Locomotor()
    {
        super();
    }
    
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int myMaxSpeed){
        this.maxSpeed = myMaxSpeed;
    }
    
    int powerConsumed(int speed){
        int totalPower = 0;
        return totalPower;
    }
    
    @Override
    void printSpecs()
    {
        System.out.println(this.myName);
    }
}
