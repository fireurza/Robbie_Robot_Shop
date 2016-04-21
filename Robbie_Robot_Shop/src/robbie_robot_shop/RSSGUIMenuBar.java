package robbie_robot_shop;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static java.awt.Component.LEFT_ALIGNMENT;
import javax.swing.event.*;


/**
 *
 * @author Fireurza
 */
public class RSSGUIMenuBar extends JFrame implements MenuListener, KeyListener,  ActionListener
{
    IOFile file = new IOFile();
    JMenuBar menuBar;
    JMenu shop, partOption, modelOption, orderOption, customerOption, employeeOption, reportOption;
    JMenuItem searchParts, browseParts, editParts, newParts, exit,testOption;
    JMenuItem searchModels, browseModels, editModels, newModels;
    JMenuItem searchOrders, browseOrders, editOrders, newOrders;
    JMenuItem searchCustomers, browseCustomers, editCustomer, newCustomer;
    JMenuItem searchEmployees, browseEmployees, editEmployee, newEmployee;
    JMenuItem openReport, searchReport;
    
    int partChoice;
    
    
    //Radio buttons for new parts
    JRadioButton torsoButton = new JRadioButton("New Torso");
    JButton nextPage=new JButton("Next");
    JRadioButton headButton = new JRadioButton("New Head");
    JRadioButton armButton = new JRadioButton("New Arm");
    JRadioButton locoButton = new JRadioButton("New Locomotor");
    
    
    
    
        //New pages buttons
        JButton nextPage2=new JButton("Next");
        JButton modelSubmitPage=new JButton("Create Model");
        JButton orderSubmitPage=new JButton("Create Order");
        JButton custSubmitPage=new JButton("Create Customer");
        JButton empSubmitPage=new JButton("Create Employee");
        
        JLabel mName = new JLabel("Model name:");
        static JTextField modName = new JTextField(20);
        JLabel tNum = new JLabel("Torso number:");
        static JTextField torsNum = new JTextField(20);
        JLabel lNum = new JLabel("Loco number:");
        static JTextField locNum = new JTextField(20);
        JLabel hNum = new JLabel("Head number:");
        static JTextField headNum = new JTextField(20);
        
        JLabel name = new JLabel("Part name:");
        static JTextField pName = new JTextField(20);
        JLabel weight=new JLabel("Weight:");
        static JTextField pWeight = new JTextField(20);
        JLabel price=new JLabel("Price:");
        static JTextField pPrice = new JTextField(20);
        JLabel desc=new JLabel("Description:");
        static JTextField pDesc = new JTextField(20);
        JLabel abs=new JLabel("Absolete part [Y/y/N/n]:");
        static JTextField pAbs = new JTextField(20);
        JLabel aprv=new JLabel("Approved [Y/y/N/n]:");
        static JTextField pAprv = new JTextField(20);
        JLabel batteries=new JLabel("No. of batteries:");
        static JTextField pBatteries = new JTextField(20);
        JLabel armSockets=new JLabel("Arm Sockets:");
        static JTextField pArmSockets = new JTextField(20);

        
        JLabel cNum=new JLabel("Customer Number:");
        static JTextField custNum = new JTextField(20);
        JLabel sNum=new JLabel("Sales Associate Number:");
        static JTextField salNum = new JTextField(20);
        JLabel rNum=new JLabel("Robot Model:");
        static JTextField robNum = new JTextField(20);
        JLabel q=new JLabel("Quantity required:");
        static JTextField quantity = new JTextField(20);

        JLabel ccName=new JLabel("Customer Name:");
        static JTextField cc = new JTextField(20);
         
        JLabel emp=new JLabel("Employee Name:");
        static JTextField empName = new JTextField(20);
        JLabel tt=new JLabel("Customer Type:");
        static JTextField emptype = new JTextField(20);
        
    static Object[][] partsData=new Object[30][9];
    static Object[][] modelsData=new Object[30][12];
    static Object[][] ordersData=new Object[30][8];
    static Object[][] customersData=new Object[30][4];
    static Object[][] employeesData=new Object[30][3];
   
    public static void main(String[] args)
    {
        IOFile file = new IOFile();
        file.readAll();
        RSSGUIMenuBar fr = new RSSGUIMenuBar();
        fr.setVisible(true); 
        
    }
   
    public RSSGUIMenuBar()
    {
        //Radio buttons for new parts
        torsoButton.setFont(new Font("Serif", Font.PLAIN, 24));
        torsoButton.addActionListener(this);
        torsoButton.setMnemonic(KeyEvent.VK_B);
        torsoButton.setActionCommand("torso");
        headButton.setFont(new Font("Serif", Font.PLAIN, 24));
        headButton.addActionListener(this);
        armButton.setFont(new Font("Serif", Font.PLAIN, 24));
        armButton.addActionListener(this);
        locoButton.setFont(new Font("Serif", Font.PLAIN, 24));
        locoButton.addActionListener(this);
        nextPage.setFont(new Font("Serif", Font.PLAIN, 24));
        nextPage.setEnabled(false);
        nextPage.setActionCommand("Next");
        nextPage.addActionListener(this);
            
        nextPage2.addActionListener(this);
        modelSubmitPage.addActionListener(this);
        orderSubmitPage.addActionListener(this);
        custSubmitPage.addActionListener(this);
        empSubmitPage.addActionListener(this);  
            
            
            
        
        
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
        shop.setFont(new Font("Serif", Font.PLAIN, 24));
      // shop.addMenuListener(new thisMenuListener());
        menuBar.add(shop);
        
        //sub menu partOption
        partOption = new JMenu("Parts");
        partOption.setFont(new Font("Serif", Font.PLAIN, 24));
        //partOption.addMenuListener(new thisMenuListener());
        shop.add(partOption);
        
        // sub menus of Parts
        searchParts = new JMenuItem("Search Parts");
        searchParts.setFont(new Font("Serif", Font.PLAIN, 22));
        browseParts = new JMenuItem("Browse Parts");
        browseParts.setFont(new Font("Serif", Font.PLAIN, 22));
        editParts = new JMenuItem("Edit Part");
        editParts.setFont(new Font("Serif", Font.PLAIN, 22));
        newParts = new JMenuItem("New Part");
        newParts.setFont(new Font("Serif", Font.PLAIN, 22));
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
        modelOption.setFont(new Font("Serif", Font.PLAIN, 24));
      //  modelOption.addMenuListener(new thisMenuListener());
        shop.add(modelOption);
        
        // sub menus of Models
        searchModels = new JMenuItem("Search Models");
        searchModels.setFont(new Font("Serif", Font.PLAIN, 22));
        browseModels = new JMenuItem("Browse Models");
        browseModels.setFont(new Font("Serif", Font.PLAIN, 22));
        editModels = new JMenuItem("Edit Model");
        editModels.setFont(new Font("Serif", Font.PLAIN, 22));
        newModels = new JMenuItem("New Model");
        newModels.setFont(new Font("Serif", Font.PLAIN, 22));
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
        orderOption.setFont(new Font("Serif", Font.PLAIN, 24));
      //  orderOption.addMenuListener(new thisMenuListener());
        shop.add(orderOption);
        
        // sub menus of Orders
        searchOrders = new JMenuItem("Search Orders");
        searchOrders.setFont(new Font("Serif", Font.PLAIN, 22));
        browseOrders = new JMenuItem("Browse Orders");
        browseOrders.setFont(new Font("Serif", Font.PLAIN, 22));
        editOrders = new JMenuItem("Edit Order");
        editOrders.setFont(new Font("Serif", Font.PLAIN, 22));
        newOrders = new JMenuItem("New Order");
        newOrders.setFont(new Font("Serif", Font.PLAIN, 22));
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
        customerOption.setFont(new Font("Serif", Font.PLAIN, 24));
      //  customerOption.addMenuListener(new thisMenuListener());
        shop.add(customerOption);
        
        // sub menus of Customers
        searchCustomers = new JMenuItem("Search Customers");
        searchCustomers.setFont(new Font("Serif", Font.PLAIN, 22));
        browseCustomers = new JMenuItem("Browse Customers");
        browseCustomers.setFont(new Font("Serif", Font.PLAIN, 22));
        editCustomer = new JMenuItem("Edit Customer");
        editCustomer.setFont(new Font("Serif", Font.PLAIN, 22));
        newCustomer = new JMenuItem("New Customer");
        newCustomer.setFont(new Font("Serif", Font.PLAIN, 22));
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
        employeeOption.setFont(new Font("Serif", Font.PLAIN, 24));
      //  employeeOption.addMenuListener(new thisMenuListener());
        shop.add(employeeOption);
        
        // sub menus of Employees
        searchEmployees = new JMenuItem("Search Employees");
        searchEmployees.setFont(new Font("Serif", Font.PLAIN, 22));
        browseEmployees = new JMenuItem("Browse Employees");
        browseEmployees.setFont(new Font("Serif", Font.PLAIN, 22));
        editEmployee = new JMenuItem("Edit Employee");
        editEmployee.setFont(new Font("Serif", Font.PLAIN, 22));
        newEmployee = new JMenuItem("New Employee");
        newEmployee.setFont(new Font("Serif", Font.PLAIN, 22));
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
        reportOption.setFont(new Font("Serif", Font.PLAIN, 24));
      //  reportOption.addMenuListener(new thisMenuListener());
        shop.add(reportOption);
        
        // sub menus of Reports
        searchReport = new JMenuItem("Search Reports");
        searchReport.setFont(new Font("Serif", Font.PLAIN, 22));
        openReport = new JMenuItem("Open Report");
        openReport.setFont(new Font("Serif", Font.PLAIN, 22));
                     //new JMenuItem("Search Reports", new ImageIcon("images/image.gif));
        searchReport.addActionListener(this);
        openReport.addActionListener(this);
        reportOption.add(searchReport);
        reportOption.add(openReport);
        
        // creat test menu item
        testOption = new JMenuItem("Test");
        testOption.setFont(new Font("Serif", Font.PLAIN, 24));
        testOption.setMnemonic(KeyEvent.VK_X);
        testOption.addActionListener(this);
        shop.addSeparator();
        shop.add(testOption);
        
        // creat exit menu item
        exit = new JMenuItem("Exit");
        exit.setFont(new Font("Serif", Font.PLAIN, 24));
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
            file.writeAll();
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
            setTitle("Browse Parts");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        
            String[] columnNames = {"Part Number", "Name","Description", "Weight","Price","Obsolete","Approved"};
        
        
       for(int i = 0; i<20; i++)
        {
            RSSGUIPartManager.browseAllComponents(i);
        }
        
     
        JTable table = new JTable(partsData, columnNames);
        table.getTableHeader().setFont(new Font("Serif", Font.PLAIN, 22));
        table.setFont(new Font("Serif", Font.PLAIN, 22));
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        table.disable();
        getContentPane().removeAll();
        scrollPane.setVisible(true);
        setLayout(new FlowLayout());
        setSize(893,693);
        setLayout(new GridLayout());
        setLocationRelativeTo(null);
        setLayout(new GridLayout());
        add(scrollPane);
          
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
            setTitle("New Parts");
            
            setLocationRelativeTo(null);
            //add radio buttons to the layout
            add(torsoButton);
            add(headButton);
            add(armButton);
            add(locoButton);
            
            //Add buttons to group so it can un/select buttons automatically
            ButtonGroup group = new ButtonGroup();
            group.add(torsoButton);
            group.add(headButton);
            group.add(armButton);
            group.add(locoButton);
            
            add(nextPage);
            
        }
        
        if(e.getSource().equals(torsoButton)||e.getSource().equals(locoButton)||e.getSource().equals(headButton)||e.getSource().equals(armButton)){
        nextPage.setEnabled(true);
        }
        
        if(armButton.isSelected()==true){
            partChoice=2;
            }
        if(torsoButton.isSelected()==false){
            partChoice=1;
            }
        if(locoButton.isSelected()==true){
            partChoice=4;
            }
        if(headButton.isSelected()==true){
            partChoice=0;
            }
        
        
        if(e.getSource().equals(nextPage)){
           JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            //setLayout(new FlowLayout());
            setSize(899,699);
            setTitle("New Parts");
            setLocationRelativeTo(null);
            setLayout(new GridLayout(9,4,10,10)); 
            
            pName.setHorizontalAlignment(SwingConstants.LEFT);
            add(name);
            name.setHorizontalAlignment(SwingConstants.LEFT);
            add(pName);
            add(weight);
            weight.setHorizontalAlignment(SwingConstants.LEFT);
            add(pWeight);
            add(price);
            price.setHorizontalAlignment(SwingConstants.LEFT);
            add(pPrice);
            add(desc);
            desc.setHorizontalAlignment(SwingConstants.LEFT);
            add(pDesc);
            add(abs);
            abs.setHorizontalAlignment(SwingConstants.LEFT);
            add(pAbs);
            add(aprv);
            aprv.setHorizontalAlignment(SwingConstants.LEFT);
            add(pAprv);
            add(batteries);
            batteries.setHorizontalAlignment(SwingConstants.LEFT);
            add(pBatteries);
            add(armSockets);
            armSockets.setHorizontalAlignment(SwingConstants.LEFT);
            add(pArmSockets);
            add(nextPage2,LEFT_ALIGNMENT);
        }
        if(e.getSource().equals(nextPage2)){
            RSSGUIPartManager.createNewPart(partChoice);
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(895,695);
            setTitle("Home Page");
            setLocationRelativeTo(null);
            JOptionPane.showMessageDialog(null, "Part has been created");
        
           
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
            JPanel a = new JPanel();
            getContentPane().removeAll();
            a.setVisible(true);
            setLayout(new FlowLayout());
            setSize(898,698);
            setTitle("Browse Models");
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            String[] columnNames = {"Name","Torso", "Battery1","Battery2","Battery3","Arm1","Arm2","Locomotor","Head"};
        
        
       for(int i = 0; i<20; i++)
        {
            RSSGUIModelManager.browseAllModels();
        }
        
     
        JTable table = new JTable(modelsData, columnNames);   
        table.getTableHeader().setFont(new Font("Serif", Font.PLAIN, 22));
        table.setFont(new Font("Serif", Font.PLAIN, 22));
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        table.disable();
        getContentPane().removeAll();
        scrollPane.setVisible(true);
        setLayout(new FlowLayout());
        setSize(893,693);
        setLayout(new GridLayout());
        setLocationRelativeTo(null);
        add(scrollPane);
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
            //setLayout(new FlowLayout());
            setSize(898,689);
            setTitle("New Model");
            setLocationRelativeTo(null);
            setLayout(new GridLayout(9,4,10,10)); 
            
            mName.setHorizontalAlignment(SwingConstants.LEFT);
            add(mName);
            modName.setHorizontalAlignment(SwingConstants.LEFT);
            add(modName);
            add(tNum);
            tNum.setHorizontalAlignment(SwingConstants.LEFT);
            add(torsNum);
            add(lNum);
            lNum.setHorizontalAlignment(SwingConstants.LEFT);
            add(locNum);
            add(hNum);
            hNum.setHorizontalAlignment(SwingConstants.LEFT);
            add(headNum);
            add(modelSubmitPage);
            
        }
        
        if(e.getSource().equals(modelSubmitPage)){
            RSSGUIModelManager.createNewModel();
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(897,692);
            setTitle("Home Page");
            setLocationRelativeTo(null);
            JOptionPane.showMessageDialog(null, "Model has been created");
        
           
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
            JPanel a = new JPanel();
            getContentPane().removeAll();
            a.setVisible(true);
            setLayout(new FlowLayout());
            setSize(898,698);
            setTitle("Browse Orders");
            setLocationRelativeTo(null);
            String[] columnNames = {"Order Number","Date order placed","Customer","Sales Associate","Robot Model","Quantity","Status"};
        
        
       for(int i = 0; i<20; i++)
        {
            RSSGUIOrderManager.browseAllOrders();
        }
        
     
        JTable table = new JTable(ordersData, columnNames);  
        table.getTableHeader().setFont(new Font("Serif", Font.PLAIN, 22));
        table.setFont(new Font("Serif", Font.PLAIN, 22));
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        table.disable();
        setLayout(new GridLayout());
        getContentPane().removeAll();
        scrollPane.setVisible(true);
        setLayout(new FlowLayout());
        setSize(893,693);
        setLayout(new GridLayout());
        setLocationRelativeTo(null);
        add(scrollPane);
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
            //setLayout(new FlowLayout());
            setSize(893,699);
            setTitle("New Orders");
            setLocationRelativeTo(null);
            setLayout(new GridLayout(9,4,10,10)); 
            
            add(cNum);
            cNum.setHorizontalAlignment(SwingConstants.LEFT);
            add(custNum);
            add(sNum);
            sNum.setHorizontalAlignment(SwingConstants.LEFT);
            add(salNum);
            add(rNum);
            rNum.setHorizontalAlignment(SwingConstants.LEFT);
            add(robNum);
            add(q);
            q.setHorizontalAlignment(SwingConstants.LEFT);
            add(quantity);
            add(orderSubmitPage);
            
        }
        
        if(e.getSource().equals(orderSubmitPage)){
            RSSGUIOrderManager.createNewOrder();
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(897,692);
            setTitle("Home Page");
            setLocationRelativeTo(null);
            JOptionPane.showMessageDialog(null, "Order has been created");
        
           
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
            JPanel a = new JPanel();
            getContentPane().removeAll();
            a.setVisible(true);
            setLayout(new FlowLayout());
            setSize(898,698);
            setTitle("Browse Customers");
            setLocationRelativeTo(null);
            String[] columnNames = {"Customer Number", "Name", "Bill"};
        
        
       for(int i = 0; i<20; i++)
        {
            RSSGUICustomerManager.browseAllCustomers();
        }
        
     
        JTable table = new JTable(customersData, columnNames);   
        table.getTableHeader().setFont(new Font("Serif", Font.PLAIN, 22));
        table.setFont(new Font("Serif", Font.PLAIN, 22));
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        table.disable();
        setLayout(new GridLayout());
        getContentPane().removeAll();
        scrollPane.setVisible(true);
        setLayout(new FlowLayout());
        setSize(893,693);
        setLayout(new GridLayout());
        setLocationRelativeTo(null);
        add(scrollPane);
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
            //setLayout(new FlowLayout());
            setSize(888,690);
            setTitle("New Customer");
            setLocationRelativeTo(null);
            setLayout(new GridLayout(9,4,10,10)); 
            
            add(ccName);
            ccName.setHorizontalAlignment(SwingConstants.LEFT);
            add(cc);
            add(custSubmitPage);
            
        }
        
        if(e.getSource().equals(custSubmitPage)){
            RSSGUICustomerManager.createNewCustomer();
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(897,692);
            setTitle("Home Page");
            setLocationRelativeTo(null);
            JOptionPane.showMessageDialog(null, "Customer has been added");
        
           
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
            JPanel a = new JPanel();
            getContentPane().removeAll();
            a.setVisible(true);
            setLayout(new FlowLayout());
            setSize(898,698);
            setTitle("Browse Employees");
            setLocationRelativeTo(null);
            String[] columnNames = {"Employee Number", "Name"};
        
        
       for(int i = 0; i<20; i++)
        {
            RSSGUIEmployeesManager.browseAllEmployees();
        }
        
     
        JTable table = new JTable(employeesData, columnNames);   
        table.getTableHeader().setFont(new Font("Serif", Font.PLAIN, 22));
        table.setFont(new Font("Serif", Font.PLAIN, 22));
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        table.disable();
        setLayout(new GridLayout());
        getContentPane().removeAll();
        scrollPane.setVisible(true);
        setLayout(new FlowLayout());
        setSize(893,693);
        setLayout(new GridLayout());
        setLocationRelativeTo(null);
        add(scrollPane);
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
            //setLayout(new FlowLayout());
            setSize(881,691);
            setTitle("New Employee");
            setLocationRelativeTo(null);
            setLayout(new GridLayout(9,4,10,10)); 
            
            add(emp);
            emp.setHorizontalAlignment(SwingConstants.LEFT);
            add(empName);
            add(tt);
            tt.setHorizontalAlignment(SwingConstants.LEFT);
            add(emptype);
            add(empSubmitPage);
            
        }
        
        if(e.getSource().equals(empSubmitPage)){
            RSSGUIEmployeesManager.createNewEmployee();
            JPanel f = new JPanel();
            getContentPane().removeAll();
            f.setVisible(true);
            setLayout(new FlowLayout());
            setSize(897,692);
            setTitle("Home Page");
            setLocationRelativeTo(null);
            JOptionPane.showMessageDialog(null, "Employee has been added");
        
           
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
        
        if(e.getSource().equals(testOption))
        {
            //Creating Test Data
            RRSCLI.createTestData();
            
            // Prints to a dialog box 
             JOptionPane.showMessageDialog(null, "TEST Parts, Model, Customer, & Employees have been created");
            
        }
        
        
    }

}

    
