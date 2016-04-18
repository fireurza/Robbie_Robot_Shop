/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robbie_robot_shop;

import static robbie_robot_shop.RSSGUIMenuBar.customersData;

/**
 *
 * @author Gasser
 */
public class RSSGUICustomerManager {
    
    public static void browseAllCustomers(){
        Customer[] customers = Shop.getCustomers();
        
            
        for(int i = 0; i < Shop.customerCounter; i++){
            if(customers[i] != null){
                int j=0;
                customersData[i][j++]=customers[i].getCustomerNumber();
                customersData[i][j++]=customers[i].getName();
                customersData[i][j++]=customers[i].getBill();
                
            }
        }
    }
}
