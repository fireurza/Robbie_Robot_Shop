/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robbie_robot_shop;

/**
 *
 * @author Gasser
 */
public class SalesAssociate {
    private String name;
    private int employeeNumber=1;
    Order[] orders=new Order[100000];
    
    public SalesAssociate(String name){
    this.name=name;
    this.employeeNumber=this.employeeNumber++;
    }
}
