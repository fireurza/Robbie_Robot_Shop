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
    JMenu shop, partOption, modelOption, orderOption, customerOption, employeeOption, reportOption;
    JMenuItem searchParts, browseParts, editParts, newParts, exit;
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
        
        // creat exit menu item
        exit = new JMenuItem("Exit");
        exit.setMnemonic(KeyEvent.VK_X);
        exit.addActionListener(this);
        shop.addSeparator();
        shop.add(exit);
      
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
        if(e.getSource().equals(exit))
        {
            System.exit(0);
        }
        // search parts
        if(e.getSource().equals(searchParts))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(899,699);
            setTitle("Test");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST");
            add(testButton);
        }
        // browse parts
        if(e.getSource().equals(browseParts))
        {
            JPanel a = new JPanel();
            getContentPane().removeAll();
            a.setVisible(true);
            setLayout(new FlowLayout());
            setSize(898,698);
            setTitle("Test2");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("blagh");
            add(testButton);
        }
        // edit parts
        if(e.getSource().equals(editParts))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(897,697);
            setTitle("Test3");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST3");
            add(testButton);
        }
        // new parts
        if(e.getSource().equals(newParts))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(896,696);
            setTitle("Test4");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST4");
            add(testButton);
        }
        // search model
        if(e.getSource().equals(searchModels))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(895,695);
            setTitle("Test5");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST5");
            add(testButton);
        }
        // browse model
        if(e.getSource().equals(browseModels))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(894,694);
            setTitle("Test6");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST6");
            add(testButton);
        }
        // edit model
        if(e.getSource().equals(editModels))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(893,693);
            setTitle("Test7");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST7");
            add(testButton);
        }
        // new model
        if(e.getSource().equals(newModels))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(892,692);
            setTitle("Test8");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST8");
            add(testButton);
        }
        // search order
        if(e.getSource().equals(searchOrders))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(891,691);
            setTitle("Test9");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST9");
            add(testButton);
        }
        // browse order
        if(e.getSource().equals(browseOrders))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(890,690);
            setTitle("Test10");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST10");
            add(testButton);
        }
        // edit order
        if(e.getSource().equals(editOrders))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(889,689);
            setTitle("Test11");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST11");
            add(testButton);
        }
        // new order
        if(e.getSource().equals(newOrders))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(888,688);
            setTitle("Test12");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST12");
            add(testButton);
        }
        // search customer
        if(e.getSource().equals(searchCustomers))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(887,687);
            setTitle("Test13");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST13");
            add(testButton);
        }
        // browse customer
        if(e.getSource().equals(browseCustomers))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(886,686);
            setTitle("Test14");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST14");
            add(testButton);
        }
        // edit customer
        if(e.getSource().equals(editCustomer))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(885,685);
            setTitle("Test15");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST15");
            add(testButton);
        }
        // new customer
        if(e.getSource().equals(newCustomer))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(884,684);
            setTitle("Test16");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST16");
            add(testButton);
        }
        // search employee
        if(e.getSource().equals(searchEmployees))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(883,683);
            setTitle("Test17");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST17");
            add(testButton);
        }
        // browse employee
        if(e.getSource().equals(browseEmployees))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(882,682);
            setTitle("Test18");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST18");
            add(testButton);
        }
        // edit employee
        if(e.getSource().equals(editEmployee))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(881,681);
            setTitle("Test19");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST19");
            add(testButton);
        }
        // new employee
        if(e.getSource().equals(newEmployee))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(880,680);
            setTitle("Test20");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST20");
            add(testButton);
        }
        // open report
        if(e.getSource().equals(openReport))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(879,679);
            setTitle("Test21");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST21");
            add(testButton);
        }
        // search report
        if(e.getSource().equals(searchReport))
        {
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(878,678);
            setTitle("Test22");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            JRadioButton testButton = new JRadioButton("TEST22");
            add(testButton);
        }
        
        
    }

}

    
