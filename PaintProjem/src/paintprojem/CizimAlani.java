/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintprojem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author muham
 */
public class CizimAlani extends Component{
    
     public int currentX,currentY,oldX,oldY;
    
     ArrayList<Sekil> sekiller=new ArrayList<>();
     
    public String sekilTipi="dortgen";
    
    Sekil sekil;
    Color color=Color.BLACK;
    
    boolean dolu=false;
    
    CizimAlani(){
    
        addMouseListener(new MouseAdapter() {

          

            @Override
            public void mousePressed(MouseEvent e) {
                
                currentX=e.getX();
                currentY=e.getY();
               
                
              
                
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
                 System.out.println( oldX + "  " + currentX );
                
                 
                 
                 switch (sekilTipi){
                 case "dortgen":
                   sekil=new Dortgen(currentX, currentY, oldX, oldY,dolu);
                   
                     break;
                     case "oval":
                         sekil=new Oval(currentX, currentY, oldX, oldY,dolu);
                         break;
                         
                         case "cizgi":
                             sekil=new Cizgi(currentX, currentY, oldX, oldY);
                             break;
                 }
                
                
                sekil.setColor(color);
                
               sekiller.add(sekil);
                
                
               
                
                
                repaint();
                
            }

            
            
 
        
        });
        
        
         addMouseMotionListener(new MouseAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {
               
                oldX=e.getX();
                oldY=e.getY();
              
            }

         
         
         });
        
        
    }

    @Override
    public void paint(Graphics g) {
       
        if(sekiller  !=null){
        
            
            for (Sekil sekil1 : sekiller) {
               sekil1.draw(g);
            }
        
        
        }
        
       
        
        
        
        
        
    }
    
    
    
    
    
    
    
   
    
    
}
