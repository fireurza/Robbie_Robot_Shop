package robbie_robot_shop;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Fireurza
 */
public class RSSGUIMainFrame extends JFrame
{
    public RSSGUIMainFrame(String title)
    {
        super(title);
        
       setLayout(new FlowLayout());
              
       String[] partsStrings = {"Parts", "Search Parts", "Browse Parts", "Edit Parts", "New Parts"};
       String[] modelsStrings = {"Models", "Search Models", "Browse Models", "Edit Models", "New Models"};
       String[] ordersStrings = {"Order", "Search Orders", "Browse Orders", "Edit Orders", "New Orders"};
       String[] customersStrings = {"Customer", "Search Customers", "Browse Customers", "Edit Customers", "New Customers"};
       String[] employeesStrings = {"Employee", "Search Employees", "Browse Employees", "Edit Employees", "New Employees"};
       String[] reportsStrings = {"Reports", "Open Report", "Open Report"};
       JComboBox partOptions = new JComboBox(partsStrings);
       JComboBox modelOptions = new JComboBox(modelsStrings);
       JComboBox orderOptions = new JComboBox(ordersStrings);
       JComboBox customerOptions = new JComboBox(customersStrings);
       JComboBox employeeOptions = new JComboBox(employeesStrings);
       JComboBox reportOptions = new JComboBox(reportsStrings);
       partOptions.setSelectedIndex(0);
       add(partOptions);
       add(modelOptions);
       add(orderOptions);
       add(customerOptions);
       add(employeeOptions);
       add(reportOptions);
       setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
       
       
    }
}
