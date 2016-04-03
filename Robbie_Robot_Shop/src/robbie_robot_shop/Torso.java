/*
 */
package robbie_robot_shop;

/**
 *
 */
public class Torso extends Component {
    private int batteryCompartments;
    private int armSockets;
    
    // constructors
    public Torso()
    {
        super();
    }
    
    // getters
    public int getBatteryCompartments(){
        return this.batteryCompartments;
    }
    
    public int getArmSockets(){
        return this.armSockets;
    }
    
    // setters
    public void setBatteryCompartments(int myBatteryCompartments){
        this.batteryCompartments = myBatteryCompartments;
    }
    
    public void setArmSockets(int myArmSockets){
        this.armSockets = myArmSockets;
    }
    
    @Override
    void printSpecs()
    {
        System.out.println(this.myName);
    }
}
