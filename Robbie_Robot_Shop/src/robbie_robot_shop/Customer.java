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
public class Customer {
     private String name;  
     private int customerNumber=1; 
     private double bill;
     Order[] orders=new Order[10000];
     
     public Customer(String name){
     this.name=name;
     this.customerNumber=this.customerNumber++;
     this.bill=0;
     }
     
     
     
     
}
