package org.jbt.display;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author jbt
 */
public class GamePanel extends JPanel
{
    //JPanel gamePanel;
    public GamePanel()
    {
        System.out.println("New GamePanel Made");
        //gamePanel = new JPanel();
        this.setDoubleBuffered(true);
        this.setIgnoreRepaint(true);
    }
    
    /*
    public JPanel getPanel()
    {
        this.paintComponents(g);
        return gamePanel;
    }
    */
    
    /*
    @Override 
    public void paintComponent(Graphics g)
    {   
        super.paintComponent(g);
        setBackground(Color.BLUE);
        g.setColor(Color.red);
        g.fillRect(0, 0, 100, 100);
    }
    */
    
    /*
    public Graphics getGraphicsObject()
    {
        return this.getGraphics();
    }
    */
}
