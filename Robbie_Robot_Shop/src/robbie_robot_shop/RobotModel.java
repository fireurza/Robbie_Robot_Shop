/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robbie_robot_shop;


public class RobotModel {
    private String name;
    private int modelNumber=1;
    private double price;
    //RobotPart[] rp=new RobotParts[6];

public RobotModel(){
}    
    
public RobotModel(String n,double p){
this.name=n;
this.modelNumber=this.modelNumber++;
this.price=p;
}  



static double getComponentCost(int modelNumber,double price)
{
    return price;
}

//static double getMaxSpeed()
//{
//    return maxSpeed;
//}

}
