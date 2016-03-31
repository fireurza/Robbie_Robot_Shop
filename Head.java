/*

 */
package robbie_robot_shop;

/**
 *
 */
public class Head extends Component{
    String myName = "Head prototype";
    
    public Head()
    {
        super();
    }
    
    @Override
    void printSpecs()
    {
        System.out.println(this.myName);
    }
    
}
