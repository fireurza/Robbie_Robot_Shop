package robbie_robot_shop;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;


/**
 *
 * @author Fireurza
 */
public class RSSGUIMenuBar extends JFrame implements MenuListener, KeyListener,  ActionListener
{
    JMenuBar menuBar;
    JMenu shop, partOption, modelOption, orderOption, customerOption, employeeOption, reportOption, exit;
    JMenuItem searchParts, browseParts, editParts, newParts;
    JMenuItem searchModels, browseModels, editModels, newModels;
    JMenuItem searchOrders, browseOrders, editOrders, newOrders;
    JMenuItem searchCustomers, browseCustomers, editCustomer, newCustomer;
    JMenuItem searchEmployees, browseEmployees, editEmployee, newEmployee;
    JMenuItem openReport, searchReport;
    
    public static void main(String[] args)
    {
        RSSGUIMenuBar fr = new RSSGUIMenuBar();
        fr.setVisible(true);             
    }
    
    public RSSGUIMenuBar()
    {
        setLayout(new FlowLayout());
        setSize(900,700);
        setTitle("Robbie Robot Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // listens when key pressed
        this.addKeyListener(this);
        
        // Create menu bar
        menuBar = new JMenuBar();
        
        //build the first heading on menu bar
        shop = new JMenu("Shop");
      // shop.addMenuListener(new thisMenuListener());
        menuBar.add(shop);
        
        // creat exit menu item
        exit = new JMenu("Exit");
        exit.setMnemonic(KeyEvent.VK_X);
        exit.addMenuListener(this);
        menuBar.add(exit);
        
        //sub menu partOption
        partOption = new JMenu("Parts");
        //partOption.addMenuListener(new thisMenuListener());
        shop.add(partOption);
        
        // sub menus of Parts
        searchParts = new JMenuItem("Search Parts");
        browseParts = new JMenuItem("Browse Parts");
        editParts = new JMenuItem("Edit Part");
        newParts = new JMenuItem("New Part");
                     //new JMenuItem("SearchParts", new ImageIcon("images/image.gif));
        searchParts.addActionListener(this);
        browseParts.addActionListener(this);
        editParts.addActionListener(this);
        newParts.addActionListener(this);
        partOption.add(searchParts);
        partOption.add(browseParts);
        partOption.add(editParts);
        partOption.add(newParts);
        
        
        // sub menu modelOption
        modelOption = new JMenu("Models");
      //  modelOption.addMenuListener(new thisMenuListener());
        shop.add(modelOption);
        
        // sub menus of Models
        searchModels = new JMenuItem("Search Models");
        browseModels = new JMenuItem("Browse Models");
        editModels = new JMenuItem("Edit Model");
        newModels = new JMenuItem("New Model");
                     //new JMenuItem("SearchModels", new ImageIcon("images/image.gif));
        searchModels.addActionListener(this);
        browseModels.addActionListener(this);
        editModels.addActionListener(this);
        newModels.addActionListener(this);
        modelOption.add(searchModels);
        modelOption.add(browseModels);
        modelOption.add(editModels);
        modelOption.add(newModels);
        
        // sub menu orderOption
        orderOption = new JMenu("Orders");
      //  orderOption.addMenuListener(new thisMenuListener());
        shop.add(orderOption);
        
        // sub menus of Orders
        searchOrders = new JMenuItem("Search Orders");
        browseOrders = new JMenuItem("Browse Orders");
        editOrders = new JMenuItem("Edit Order");
        newOrders = new JMenuItem("New Order");
                     //new JMenuItem("Search Orders", new ImageIcon("images/image.gif));
        searchOrders.addActionListener(this);
        browseOrders.addActionListener(this);
        editOrders.addActionListener(this);
        newOrders.addActionListener(this);
        orderOption.add(searchOrders);
        orderOption.add(browseOrders);
        orderOption.add(editOrders);
        orderOption.add(newOrders);
        
        //sub menu customerOption
        customerOption = new JMenu("Customers");
      //  customerOption.addMenuListener(new thisMenuListener());
        shop.add(customerOption);
        
        // sub menus of Customers
        searchCustomers = new JMenuItem("Search Customers");
        browseCustomers = new JMenuItem("Browse Customers");
        editCustomer = new JMenuItem("Edit Customer");
        newCustomer = new JMenuItem("New Customer");
                     //new JMenuItem("Search Customers", new ImageIcon("images/image.gif));
        searchCustomers.addActionListener(this);
        browseCustomers.addActionListener(this);
        editCustomer.addActionListener(this);
        newCustomer.addActionListener(this);
        customerOption.add(searchCustomers);
        customerOption.add(browseCustomers);
        customerOption.add(editCustomer);
        customerOption.add(newCustomer);
        
        // sub menu employeeOption
        employeeOption = new JMenu("Employees");
      //  employeeOption.addMenuListener(new thisMenuListener());
        shop.add(employeeOption);
        
        // sub menus of Employees
        searchEmployees = new JMenuItem("Search Employees");
        browseEmployees = new JMenuItem("Browse Employees");
        editEmployee = new JMenuItem("Edit Employee");
        newEmployee = new JMenuItem("New Employee");
                     //new JMenuItem("Search Employees", new ImageIcon("images/image.gif));
        searchEmployees.addActionListener(this);
        browseEmployees.addActionListener(this);
        editEmployee.addActionListener(this);
        newEmployee.addActionListener(this);
        employeeOption.add(searchEmployees);
        employeeOption.add(browseEmployees);
        employeeOption.add(editEmployee);
        employeeOption.add(newEmployee);
        
        // sub menu reportOption
        reportOption = new JMenu("Reports");
      //  reportOption.addMenuListener(new thisMenuListener());
        shop.add(reportOption);
        
        // sub menus of Reports
        searchReport = new JMenuItem("Search Reports");
        openReport = new JMenuItem("Open Report");
                     //new JMenuItem("Search Reports", new ImageIcon("images/image.gif));
        searchReport.addActionListener(this);
        openReport.addActionListener(this);
        reportOption.add(searchReport);
        reportOption.add(openReport);
      
        // add menu bar to frame
        this.setJMenuBar(menuBar);
        
    }
    // needed for implements
    @Override
    public void menuSelected(MenuEvent me)
    {
        if (me.getSource().equals(exit))
        {
            System.exit(0);
        }
    }
    
    @Override
    public void menuDeselected(MenuEvent me)
    {
        //not used but must exist
    }
    
    @Override
    public void menuCanceled(MenuEvent me)
    {
        //not used but must exist
    }
    
    @Override
    public void keyTyped(KeyEvent ke)
    {
        //not used but must exist
    }
    
    @Override
    public void keyPressed(KeyEvent ke)
    {
        if(ke.getKeyChar() == 'x')
        {
            System.exit(0);
        }
    }
    
    @Override
    public void keyReleased(KeyEvent ke)
    {
        //not used but must exist
    }
    
    // These are the action listeners
    public void actionPerformed(ActionEvent e)
    {
        // search parts
        if(e.getSource().equals(searchParts))
        {
            
        }
        // browse parts
        if(e.getSource().equals(browseParts))
        {
            
        }
        // edit parts
        if(e.getSource().equals(editParts))
        {
            
        }
        // new parts
        if(e.getSource().equals(newParts))
        {
            
        }
        // search model
        if(e.getSource().equals(searchModels))
        {
            
        }
        // browse model
        if(e.getSource().equals(browseModels))
        {
            
        }
        // edit model
        if(e.getSource().equals(editModels))
        {
            
        }
        // new model
        if(e.getSource().equals(newModels))
        {
            
        }
        // search order
        if(e.getSource().equals(searchOrders))
        {
            
        }
        // browse order
        if(e.getSource().equals(browseOrders))
        {
            
        }
        // edit order
        if(e.getSource().equals(editOrders))
        {
            
        }
        // new order
        if(e.getSource().equals(newOrders))
        {
            
        }
        // search customer
        if(e.getSource().equals(searchCustomers))
        {
            
        }
        // browse customer
        if(e.getSource().equals(browseCustomers))
        {
            
        }
        // edit customer
        if(e.getSource().equals(editCustomer))
        {
            
        }
        // new customer
        if(e.getSource().equals(newCustomer))
        {
            
        }
        // search employee
        if(e.getSource().equals(searchEmployees))
        {
            
        }
        // browse employee
        if(e.getSource().equals(browseEmployees))
        {
            
        }
        // edit employee
        if(e.getSource().equals(editEmployee))
        {
            
        }
        // new employee
        if(e.getSource().equals(newEmployee))
        {
            
        }
        // open report
        if(e.getSource().equals(openReport))
        {
            
        }
        // search report
        if(e.getSource().equals(searchReport))
        {
            
        }
        
        
    }
    
}
