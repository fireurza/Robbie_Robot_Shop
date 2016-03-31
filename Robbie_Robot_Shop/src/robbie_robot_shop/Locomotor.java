/*
 */
package robbie_robot_shop;

/**
 *
 */
public class Locomotor extends Component{
    int maxSpeed;
    String myName = "Locomotor prototype";

    public Locomotor()
    {
        super();
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
