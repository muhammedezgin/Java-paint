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
public class Cizgi extends Sekil{

    public int currentX,currentY,oldX,oldY;

    public Cizgi(int currentX,int currentY,int oldX,int oldY) {
        
        this.currentX=currentX;
        this.currentY=currentY;
        this.oldX=oldX;
        this.oldY=oldY;

    }
    
    
   

    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.drawLine(currentX,currentY,oldX,oldY);
    }
    
}
