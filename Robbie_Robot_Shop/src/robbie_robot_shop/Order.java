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
    private int customer;
    private int salesAssociate;
    private int lineItem;
    private double bill;
    
    public Order(int customer, int salesAssociate, int lineItem, int quantity, double bill){
    this.orderNumber=Shop.orderCounter;
    Date d = new Date();
    this.date=d;
    this.customer = customer;
    this.salesAssociate = salesAssociate;
    this.lineItem = lineItem;
    this.quantity = quantity;
    this.status=true;
    this.bill = bill;
    }
    
    public int getOrderNumber(){
        return this.orderNumber;
    }
    
    public Date getDate(){
        return this.date;
    }
    
    public int getCustomer(){
        return this.customer;
    }
    
    public int getEmployee(){
        return this.salesAssociate;
    }
    
    public int getLineItem(){
        return this.lineItem;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public double getBill(){
        return this.bill;
    }
    
    public void setBill(double bill){
        this.bill = bill;
    }
}
