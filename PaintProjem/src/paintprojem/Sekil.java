/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintprojem;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author muham
 */
public abstract class Sekil extends Rectangle{
    
    
    
    private Color color=Color.BLACK;
    
    
    
    
    public abstract void draw(Graphics g);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

   
    
}
