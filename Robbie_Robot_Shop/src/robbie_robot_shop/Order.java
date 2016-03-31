/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robbie_robot_shop;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Gasser
 */
public class Order {
    private int orderNumber=1;
    private Date date;
    private int quantity;
    private boolean status=false;
    Customer customer;
    SalesAssociate salesAssociate;
    RobotModel robotModel;
    
    public Order(int q){
    this.orderNumber=this.orderNumber++;
    Date d = new Date();
    this.date=d;
    this.quantity=q;
    this.status=true;
    }
    //methods
    
    
}
