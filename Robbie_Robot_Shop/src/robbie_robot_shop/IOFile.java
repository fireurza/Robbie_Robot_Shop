
package robbie_robot_shop;
import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Jon
 */
public class IOFile { 
    
    private Scanner infile;
    private Formatter outfile;
    
    public void readAll()
    {
        readComponentFile();
    }
    
    public void writeAll()
    {
        writeComponentFile();
    }
    
    public void writeComponentFile()
    {
        int i;
        openFileW("ComponentFile.txt");
        
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
        //outfile.format("\n");
        for(i=0;i<torso.length; i++)
        {
            if(torso[i]!=null)
            {
                outfile.format("%s,%s,%f,%f,%s,%b,%b, %d, %d\n", torso[i].getType(), torso[i].getName(), torso[i].getWeight(), torso[i].getPrice(),
                         torso[i].getDescription(), torso[i].getIsObsolete(), torso[i].getIsApproved(), 
                         torso[i].getBatteryCompartments(), torso[i].getArmSockets());     
            }            
        }
        //outfile.format("\n");
        for(i=0;i<arm.length; i++)
        {
            if(arm[i]!=null)
            {
                outfile.format("%s,%s,%.2f,%.2f,%s,%b,%b,%.2f\n", arm[i].getType(), arm[i].getName(), arm[i].getWeight(), arm[i].getPrice(),
                        arm[i].getDescription(), arm[i].getIsObsolete(), arm[i].getIsApproved(), arm[i].getPowerConsumptionRate());           
            }           
        }
        //outfile.format("\n");
        for(i=0;i<battery.length; i++)
        {
            if(battery[i]!=null)
            {
                outfile.format("%s,%s,%.2f,%.2f,%s,%b,%b\n", battery[i].getType(), battery[i].getName(), battery[i].getWeight(), battery[i].getPrice(),
                        battery[i].getDescription(), battery[i].getIsObsolete(), battery[i].getIsApproved(), battery[i].getEnergy(), battery[i].getMaxPower());
            }           
        }
        //outfile.format("\n");
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
    
    public void readComponentFile()
    {
        
        Component[][] array = Shop.robotParts;
        Head[] head = Shop.getHeadArray(); 
        Torso[] torso = Shop.getTorsoArray();
        Arm[] arm = Shop.getArmArray();
        Battery[] battery = Shop.getBatteryArray();
        Locomotor[] loco = Shop.getLocomotorArray();
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
                        Shop.createHead(result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]),
                            result[4], Boolean.parseBoolean(result[5]), Boolean.parseBoolean(result[6]));
                        break;
                    case "torso":
                        Shop.createTorso(result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]),
                            result[4], Boolean.parseBoolean(result[5]), Boolean.parseBoolean(result[6]), 
                            Integer.parseInt(result[7]), Integer.parseInt(result[8]));
                        break;
                    case "arm":
                           Shop.createArm(result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]),
                            result[4], Boolean.parseBoolean(result[5]), Boolean.parseBoolean(result[6]), Double.parseDouble(result[7]));
                           break;
                    case "battery":
                        Shop.createBattery(result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]),
                            result[4], Boolean.parseBoolean(result[5]), Boolean.parseBoolean(result[6]), 
                            Integer.parseInt(result[7]), Integer.parseInt(result[8]));
                        break;
                    case "locomotor":
                        Shop.createLocomotor(result[1], Double.parseDouble(result[2]), Double.parseDouble(result[3]),
                            result[4], Boolean.parseBoolean(result[5]), Boolean.parseBoolean(result[6]), 
                            Integer.parseInt(result[7]), Integer.parseInt(result[8]));
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
    
    
    private  void openFileW(String fileName)
    {
        try{
        outfile = new Formatter(fileName);
        System.out.println("Open Outfile Successful");
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
