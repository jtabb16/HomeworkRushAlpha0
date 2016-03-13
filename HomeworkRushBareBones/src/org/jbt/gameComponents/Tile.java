/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbt.gameComponents;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.jbt.synthesizedGameComponents.LevelLoader;

/**
 *
 * @author jbt
 */
public abstract class Tile //Abstract so that it cannot be instantiated. 
{
    private Image image;
    
    private int xCoord, yCoord;
    private final int tileWidth = 100;
    private final int tileHeight = 100;

    public Tile(String tileName, int xC, int yC)
    {
        //loadTileImage(tileName);
        xCoord = xC;
        yCoord = yC;
        System.out.println("New " + tileName + " Tile Made");
    }
    
    //public final Image getImage() { return image; }
    
    
    public final Image loadTileImage(String nameOfTile)
    {
        URL location = LevelLoader.class.getProtectionDomain().getCodeSource().getLocation();
        URL url = null;
        try {
            url = new URL (location + "images/" + nameOfTile);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Tile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ImageIcon ii = new ImageIcon(url);
        image = ii.getImage();
        return image;
    }
    
    public final void drawTile(Graphics g)
    {
        //g.drawImage(image, xCoord, yCoord, null);
        
        if (image == null)
            System.out.println("Drawing Null Image");
        else
        {
            System.out.println("Drawing Image");
            g.drawImage(image, xCoord, yCoord, tileWidth, tileHeight, null);
            System.out.println("XCOORD: " + xCoord + ", YCOORD: " + yCoord);
            //g.setColor(Color.RED);
            //g.fillRect (xCoord, yCoord, tileWidth, tileHeight);
            //g.fillRect (500,700, 100, 100);
        }
        //g.dispose();
    }
}
