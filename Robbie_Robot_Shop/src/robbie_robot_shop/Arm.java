/*
 */
package robbie_robot_shop;

/**
 *
 */
public class Arm extends Component{
    String myName = "Arm prototype";
    
    public Arm()
    {
        super();   
    }
    
    int powerConsumed(int speed){
        int totalConsumed = 0;
        return totalConsumed;
    }
    
    
    @Override
    void printSpecs()
    {
        System.out.println(this.myName);
    }
}
