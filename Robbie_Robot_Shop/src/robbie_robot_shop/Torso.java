/*
 */
package robbie_robot_shop;

/**
 *
 */
public class Torso extends Component {
    final int batteryCompartments = 1;
    Head head;
    Arm arm;
    Locomotor locomotor;
    Battery battery;
    String myName =  "Torso prototype";
    // constructors
    public Torso()
    {
        this.head = new Head();
        this.arm = new Arm();
        this.locomotor = new Locomotor();
        this.battery = new Battery();
    }
    
    // getters
    
    @Override
    void printSpecs()
    {
        System.out.println(this.myName);
    }
}
