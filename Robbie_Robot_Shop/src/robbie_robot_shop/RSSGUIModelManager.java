/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robbie_robot_shop;

import static robbie_robot_shop.RSSGUIMenuBar.modelsData;

/**
 *
 * @author Gasser
 */
public class RSSGUIModelManager {
    
    
    public static void browseAllModels(){
        RobotModel[] robotModels = Shop.getRobotModels();
                  
        for(int i = 0; i < Shop.modelCounter; i++){
            
            if(robotModels[i] != null){
            int j=0;
            modelsData[i][j++]=robotModels[i].getName();
          
            modelsData[i][j++]=robotModels[i].getTorso();

            modelsData[i][j++]=robotModels[i].getBattery1();

            modelsData[i][j++]=robotModels[i].getBattery2();

            modelsData[i][j++]=robotModels[i].getBattery3();
   
            modelsData[i][j++]=robotModels[i].getArm1();

            modelsData[i][j++]=robotModels[i].getArm2();
     
            modelsData[i][j++]=robotModels[i].getLocomotor();

            modelsData[i][j++]=robotModels[i].getHead();
            }
        }
    }

    static void createNewModel() {
        String mname = RSSGUIMenuBar.modName.getText();
        int tnum = Integer.parseInt(RSSGUIMenuBar.torsNum.getText());
        int lnum =  Integer.parseInt(RSSGUIMenuBar.locNum.getText());
        int hnum =  Integer.parseInt(RSSGUIMenuBar.headNum.getText());
        Shop.createModel(mname, tnum, 1, 2, 3, 1, 2, lnum, hnum);
    }
    }