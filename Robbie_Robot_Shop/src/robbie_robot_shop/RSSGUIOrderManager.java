package robbie_robot_shop;

import robbie_robot_shop.Customer;
import robbie_robot_shop.Employee;
import robbie_robot_shop.Order;
import robbie_robot_shop.RobotModel;
import robbie_robot_shop.Shop;



import static robbie_robot_shop.RSSGUIMenuBar.ordersData;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gasser
 */
public class RSSGUIOrderManager {
    
    public static void browseAllOrders(){
        Order[] orders = Shop.getOrders();
        Customer customers[] = Shop.getCustomers();
        Employee employees[] = Shop.getEmployees();
        RobotModel robots[] = Shop.getRobotModels();
        
        for(int i = 0; i < Shop.orderCounter; i++){
            if(orders[i] != null){
                int j=0;
                ordersData[i][j++]=orders[i].getOrderNumber();
                ordersData[i][j++]=orders[i].getDate();
                ordersData[i][j++]=customers[orders[i].getCustomer()].getName();
                ordersData[i][j++]=employees[orders[i].getEmployee()].getName();
                ordersData[i][j++]=robots[orders[i].getLineItem()].getName();
                ordersData[i][j++]=orders[i].getQuantity();
                ordersData[i][j++]=orders[i].getStatus();
            }
        }
    }
}
