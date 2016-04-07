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
    private int head;
    private int torso;
    private int battery1, battery2, battery3;
    private int arm1, arm2;
    private int locomotor;
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

public int getModelNumber(){
    return this.modelNumber;
}

public void setName(String Name){
    this.name = Name;
}

public String getName(){
    return this.name;
}

public void setPrice(double price){
    this.price = price;
}

public double getPrice(){
    return this.price;
}

public void setTorso(int n){
    this.torso = n;
}
public void setHead(int n){
    this.head = n;
}
public void setLocomotor(int n){
    this.locomotor = n;
}
public void setBattery1(int n){
    this.battery1 = n;
}
public void setBattery2(int n){
    this.battery2 = n;
}
public void setBattery3(int n){
    this.battery3 = n;
}
public void setArm1(int n){
    this.arm1 = n;
}
public void setArm2(int n){
    this.arm2 = n;
}

public int getTorso(){
    return this.torso;
}
public int getHead(){
    return this.head;
}
public int getLocomotor(){
    return this.locomotor;
}
public int getBattery1(){
    return this.battery1;
}
public int getBattery2(){
    return this.battery2;
}
public int getBattery3(){
    return this.battery3;
}
public int getArm1(){
    return this.arm1;
}
public int getArms2(){
    return this.arm2;
}

//static double getMaxSpeed()
//{
//    return maxSpeed;
//}

}
