/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlexJ;
import robocode.Robot;
import robocode.ScannedRobotEvent;
/**
 *
 * @author Ni7mo
 */
public class Murphy extends Robot{
      
          public void run(){
        while(true){
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunLeft(360);
            //erstellt1
            turnGunLeft(360);
            //erstellt2
            back(100);
        }
    }
   public void onScannedRobot(ScannedRobotEvent e){
     
   fire(1);
   }  
}
