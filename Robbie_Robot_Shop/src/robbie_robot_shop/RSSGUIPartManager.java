/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robbie_robot_shop;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import static robbie_robot_shop.RSSGUIMenuBar.partsData;


/**
 *
 * @author Gasser
 */
public class RSSGUIPartManager extends JFrame {
    
            public static void browseAllComponents(int PartType)
    {
        Component[][] ArrayOfParts = Shop.robotParts; 
        Component[] Heads = ArrayOfParts[0];
        Component[] Torso = ArrayOfParts[1];
        Component[] Arm = ArrayOfParts[2];
        Component[] Battery = ArrayOfParts[3];
        Component[] Locomotor = ArrayOfParts[4];
        
        String name = "";
        
        
            switch(PartType){
                case 0: 
                    name = "Heads";
                    break;
                case 1:
                    name = "Torsos";
                    break;
                case 2:
                    name = "Arms";
                    break;
                case 3:
                    name = "Batteries";
                    break;
                case 4:
                    name = "Locomotors";
                    break;
                default:
                    return;
            }
            
            
            for(int j = 0; j<ArrayOfParts[PartType].length; j++)
            {
                if(ArrayOfParts[PartType][j] != null){
                int i=0;
                partsData[PartType][i++]=ArrayOfParts[PartType][j].getPartNumber();
                partsData[PartType][i++]=ArrayOfParts[PartType][j].getName();
                partsData[PartType][i++]=ArrayOfParts[PartType][j].getDescription();
                partsData[PartType][i++]=ArrayOfParts[PartType][j].getWeight();
                partsData[PartType][i++]=ArrayOfParts[PartType][j].getPrice();
                partsData[PartType][i++]=ArrayOfParts[PartType][j].getIsObsolete();
                partsData[PartType][i++]=ArrayOfParts[PartType][j].getIsApproved();
                }
            }
        
        
    }
            public static void createNewPart(int PartType){
            
        String pname = RSSGUIMenuBar.pName.getText();
        double weight = Double.parseDouble(RSSGUIMenuBar.pWeight.getText());
        double price =  Double.parseDouble(RSSGUIMenuBar.pPrice.getText());
        String description = RSSGUIMenuBar.pDesc.getText();
        String abs = RSSGUIMenuBar.pAbs.getText();
        String aprv = RSSGUIMenuBar.pAprv.getText();
        boolean obsolete=false;
        boolean approved = false;
        
        if(abs.equals("y")||abs.equals("Y"))
            obsolete = true;
        if(aprv.equals("y")||aprv.equals("Y"))
            approved = true;
            
        Shop.createHead(pname, weight, price, description, obsolete, approved);
            }
}
