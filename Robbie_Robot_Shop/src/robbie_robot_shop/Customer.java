
package robbie_robot_shop;


public class Customer {
     private String name;  
     private int customerNumber=1; 
     private double bill;
//     Order[] orders=new Order[10000];
     
     public Customer(String name){
     this.name=name;
     this.customerNumber=this.customerNumber++;
     this.bill=0;
     }
     
     public void setName(String name){
         this.name = name;
     }
     
     public String getName(){
         return this.name;
     }
     
     public void setBill(double bill){
         this.bill = bill;
     }
     
     public double getBill(){
         return this.bill;
     }
}
