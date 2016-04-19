
package robbie_robot_shop;
import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Jon
 */
public class IOFile { 
    
    private Scanner input;

    private Formatter outfile;
    
    public void readAll()
    {

        readComponentFile();
        readModelFile();
        readCustomerFile();
        readEmployeeFile();
        readOrderFile();
    }
    
    public void writeAll()
    {
        writeComponentFile();
        writeModelFile();
        writeCustomerFile();
        writeEmployeeFile();
        writeOrderFile();
    }
    
    public void writeComponentFile()
    {
        int i;
        openFile("ComponentFile.txt");
        
        Component[][] array = Shop.robotParts;
        Head[] head = Shop.getHeadArray(); 
        Torso[] torso = Shop.getTorsoArray();
        Arm[] arm = Shop.getArmArray();
        Battery[] battery = Shop.getBatteryArray();
        Locomotor[] loco = Shop.getLocomotorArray();  
        
        for(i=0; i<head.length; i++)
        {
            if(head[i]!=null)
            {
                
                outfile.format("%s,%s,%.2f,%.2f,%s,%b,%b\n", head[i].getType(), head[i].getName(), head[i].getWeight(), head[i].getPrice(),
                        head[i].getDescription(), head[i].getIsObsolete(), head[i].getIsApproved());
            }
            
        }   
        outfile.format("\n");
        for(i=0;i<torso.length; i++)
        {
            if(torso[i]!=null)
            {

                outfile.format("%s,%s,%f,%f,%s,%b,%b,%d,%d\n", torso[i].getType(), torso[i].getName(), torso[i].getWeight(), torso[i].getPrice(),
                         torso[i].getDescription(), torso[i].getIsObsolete(), torso[i].getIsApproved(), 
                         torso[i].getBatteryCompartments(), torso[i].getArmSockets());     
            }            
        }
        outfile.format("\n");
        for(i=0;i<arm.length; i++)
        {
            if(arm[i]!=null)
            {
                outfile.format("%s,%s,%.2f,%.2f,%s,%b,%b,%.2f\n", arm[i].getType(), arm[i].getName(), arm[i].getWeight(), arm[i].getPrice(),
                        arm[i].getDescription(), arm[i].getIsObsolete(), arm[i].getIsApproved(), arm[i].getPowerConsumptionRate());           
            }           
        }
        outfile.format("\n");
        for(i=0;i<battery.length; i++)
        {
            if(battery[i]!=null)
            {
                outfile.format("%s,%s,%.2f,%.2f,%s,%b,%b,%.2f,%.2f\n", battery[i].getType(), battery[i].getName(), battery[i].getWeight(), battery[i].getPrice(),
                        battery[i].getDescription(), battery[i].getIsObsolete(), battery[i].getIsApproved(), battery[i].getEnergy(), battery[i].getMaxPower());
            }           
        }
        outfile.format("\n");
        for(i=0;i<loco.length; i++)
        {
            if(loco[i]!=null)
            {
                outfile.format("%s,%s,%.2f,%.2f,%s,%b,%b,%.2f,%.2f\n", loco[i].getType(), loco[i].getName(), loco[i].getWeight(), loco[i].getPrice(),
                        loco[i].getDescription(), loco[i].getIsObsolete(), loco[i].getIsApproved(), loco[i].getMaxSpeed(), loco[i].getPowerConsumtionRate());               
            }
        }
        outfile.close();
    }
    

    private  void openFile(String fileName)
    {
        try{
        outfile = new Formatter(fileName);
        System.out.println("Open Successful");
        }
        catch(FileNotFoundException e){
            //TODO Do Something Here
        }
    }

    private void readComponentFile()
    {
        String line;
        
        try{
            Scanner scanner = new Scanner(new FileReader("ComponentFile.txt"));
            
            while(scanner.hasNextLine())
            {
                //System.out.println("In readComponentFile() while loop");
                line = scanner.nextLine();
                String[] result = line.split(",");
            
                switch(result[0])
                {
                    case "head":
                        try{
                            Shop.createHead(result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]),
                            result[4], Boolean.parseBoolean(result[5]), Boolean.parseBoolean(result[6]));
                            //System.out.println("Head component read sucessfully");
                        }
                        catch(Exception e)
                        {
                            System.out.println("Head not read");
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "torso":
                        try{
                            Shop.createTorso(result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]),
                            result[4], Boolean.parseBoolean(result[5]), Boolean.parseBoolean(result[6]), 
                            Integer.parseInt(result[7]), Integer.parseInt(result[8]));
                            //System.out.println("torso read sucessfully");
                        }
                        catch(Exception e)
                        {
                            System.out.println("torso not read");
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "arm":
                        try{
                            Shop.createArm(result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]),
                            result[4], Boolean.parseBoolean(result[5]), Boolean.parseBoolean(result[6]), Double.parseDouble(result[7]));
                            //System.out.println("arm read sucessfully");
                        }
                        catch(Exception e)
                        {
                            System.out.println("arm not read");
                            System.out.println(e.getMessage());
                        }
                           break;
                    case "battery":
                        try{
                            Shop.createBattery(result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]),
                            result[4], Boolean.parseBoolean(result[5]), Boolean.parseBoolean(result[6]), 
                            Double.parseDouble(result[7]), Double.parseDouble(result[8]));
                            //System.out.println("battery read sucessfully");
                        }
                        catch(Exception e)
                        {
                            System.out.println("battery not read");
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "locomotor":
                        try{
                            Shop.createLocomotor(result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]),
                            result[4], Boolean.parseBoolean(result[5]), Boolean.parseBoolean(result[6]), 
                            Double.parseDouble(result[7]), Double.parseDouble(result[8]));
                            //System.out.println("locomotor read sucessfully");
                        }
                        catch(Exception e)
                        {
                            System.out.println("locomotor not read");
                            System.out.println(e.getMessage());
                        }
                        break;
                }
            }
            scanner.close();
            }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void writeModelFile()
    {
        int i;
        openFileW("ModelFile.txt");
        
        RobotModel[] array = Shop.getRobotModels();
        
        for(i=0; i<array.length; i++)
        {
            if (array[i] != null)
            {
                outfile.format("%s,%d,%d,%d,%d,%d,%d,%d,%d\n", array[i].getName(), array[i].getTorso(), array[i].getBattery1(), array[i].getBattery2(),
                               array[i].getBattery3(), array[i].getArm1(), array[i].getArm2(), array[i].getLocomotor(), array[i].getHead());
            }
        }
        outfile.close();
    }
    
    private void readModelFile()
    {
        try{
            Scanner scanner = new Scanner(new FileReader("ModelFile.txt"));
            
            String line;
            while(scanner.hasNextLine())
            {
                line = scanner.nextLine();
                String[] result = line.split(",");
                
                try{
                    Shop.createModel(result[0], Integer.parseInt(result[1]), Integer.parseInt(result[2]), Integer.parseInt(result[3]), Integer.parseInt(result[4]), 
                                     Integer.parseInt(result[5]), Integer.parseInt(result[6]), Integer.parseInt(result[7]), Integer.parseInt(result[8]));
                }
                catch(Exception e){
                    System.out.println("Model not read");
                    System.out.println(e.getMessage());
                }
            }
            scanner.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void writeOrderFile()
    {
        int i;
        openFileW("OrderFile.txt");
        
        Order[] array = Shop.getOrders();
        
        for(i=0; i<array.length; i++)
        {
            if (array[i] != null)
            {
                outfile.format("%d,%d,%d,%d,%.2f\n", array[i].getCustomer(), array[i].getEmployee(), array[i].getLineItem(), array[i].getQuantity(),
                               array[i].getBill());
            }
        }
        outfile.close();
    }
    
    private void readOrderFile()
    {
        try{
            Scanner scanner = new Scanner(new FileReader("OrderFile.txt"));
            
            String line;
            while(scanner.hasNextLine())
            {
                line = scanner.nextLine();
                String[] result = line.split(",");
                
                try{
                    Shop.newOrder(Integer.parseInt(result[0]), Integer.parseInt(result[1]), Integer.parseInt(result[2]), Integer.parseInt(result[3]), 
                                  Double.parseDouble(result[4]));
                }
                catch(Exception e){
                    System.out.println("Order not read");
                    System.out.println(e.getMessage());
                }
            }
            scanner.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void writeCustomerFile()
    {
        int i;
        openFileW("CustomerFile.txt");
        
        Customer[] array = Shop.getCustomers();
        
        for(i=0; i<array.length; i++)
        {
            if (array[i] != null)
            {
                outfile.format("%s\n", array[i].getName());
            }
        }
        outfile.close();
    }
    
    public void readCustomerFile()
    {
        try{
            Scanner scanner = new Scanner(new FileReader("CustomerFile.txt"));
            
            String line;
            while(scanner.hasNextLine())
            {
                line = scanner.nextLine();
                String[] result = line.split(",");
                
                try{
                    Shop.newCustomer(result[0]);
                }
                catch(Exception e){
                    System.out.println("Customer not read");
                    System.out.println(e.getMessage());
                }
            }
            scanner.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void writeEmployeeFile()
    {
        int i;
        openFileW("EmployeeFile.txt");
        
        Employee[] array = Shop.getEmployees();
        
        for(i=0; i<array.length; i++)
        {
            if (array[i] != null)
            {
                outfile.format("%s,%s\n", array[i].getName(), array[i].getType());
            }
        }
        outfile.close();
    }
    
    private void readEmployeeFile()
    {
        try{
            Scanner scanner = new Scanner(new FileReader("EmployeeFile.txt"));
            
            String line;
            while(scanner.hasNextLine())
            {
                line = scanner.nextLine();
                String[] result = line.split(",");
                
                try{
                    Shop.newEmployee(result[0], result[1]);
                }
                catch(Exception e){
                    System.out.println("Employee not read");
                    System.out.println(e.getMessage());
                }
            }
            scanner.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private  void openFileW(String fileName)
    {
        try{
        outfile = new Formatter(fileName);
        //System.out.println("Open " + fileName+ " Successful");
        }
        catch(Exception e){
            System.out.println("File not Found");
        }
    }
    
    /*private  void openFileR(String fileName)
    {
        try{
        infile = new Scanner(fileName);
        System.out.println("Open Infile Successful");
        }
        catch(Exception e){
            System.out.println("File not Found");
        }
    }*/
    
}
