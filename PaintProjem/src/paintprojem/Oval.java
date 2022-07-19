/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintprojem;

import java.awt.Graphics;



/**
 *
 * @author muham
 */
public class Oval extends Sekil{

    public int currentX,currentY,oldX,oldY;

    boolean dolu;
    public Oval(int currentX,int currentY,int oldX,int oldY,boolean dolu) {
        
        this.currentX=currentX;
        this.currentY=currentY;
        this.oldX=oldX;
        this.oldY=oldY;
        this.dolu=dolu;

    }
    
    
   

    @Override
    public void draw(Graphics g) {
        
        
        
        g.setColor(this.getColor());
        
        if(dolu){
        
         g.fillOval(Math.min(currentX,oldX), Math.min(oldY, currentY), Math.abs(currentX-oldX), Math.abs(oldY-currentY));
        }else{
        
        g.drawOval(Math.min(currentX,oldX), Math.min(oldY, currentY), Math.abs(currentX-oldX), Math.abs(oldY-currentY));
        
        }
    }
    
}
