/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbt.management;

import java.awt.Color;
import java.awt.Graphics;
//import javax.swing.JPanel;
import org.jbt.display.GamePanel;
import org.jbt.synthesizedGameComponents.TileMap;

/**
 *
 * @author jbt
 */
public class Renderer 
{
    Graphics g;
    TileMap tMap;
    //Make the game panel here
    //GamePanel gamePanel;
    public Renderer(Graphics graphicsObject, TileMap t)
    {
        //gamePanel = gPanel;
        g = graphicsObject;
        tMap = t;
        System.out.println("New Renderer Made");
        
        //Not sure if I need this, but apparently, it makes sure that hardware acceleration is on
        System.setProperty("sun.java2d.opengl","True");
    }
    
    protected void render()
    {
        //gamePanel.
        //g.setColor(Color.BLUE);
        //g.fillRect(0, 0, 100, 100);
        
        tMap.drawTiles(g);
    }
    
    /*
    public Graphics getGraphicsObject()
    {
        return g;
    }
    */
}
