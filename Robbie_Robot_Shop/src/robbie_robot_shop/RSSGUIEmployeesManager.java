/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robbie_robot_shop;

import static robbie_robot_shop.RSSGUIMenuBar.employeesData;

/**
 *
 * @author Gasser
 */
public class RSSGUIEmployeesManager {
    
     public static void browseAllEmployees(){
        Employee[] employees = Shop.getEmployees();
        
            
        for(int i = 0; i < Shop.employeeCounter; i++){
            if(employees[i] != null){
                int j=0;
                employeesData[i][j++]=employees[i].getEmployeeNumber();
                employeesData[i][j++]=employees[i].getName();
            }
        }
    }

    static void createNewEmployee() {
         String empName = RSSGUIMenuBar.empName.getText();
        String tt=RSSGUIMenuBar.emptype.getText();
        Shop.newEmployee(empName+tt, tt);
    
    }
    
}
