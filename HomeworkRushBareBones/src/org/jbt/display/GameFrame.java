package org.jbt.display;

import javax.swing.JFrame;
import org.jbt.management.KeyboardControl;

/**
 *
 * @author jbt
 */
public class GameFrame 
{
    JFrame frame;
    private static final long serialVersionUID = 1L;//Set the default serial number to a default value
    final int frameWidth = 1200;
    final int frameHeight = 700;
    GamePanel gamePanel;
    
    public GameFrame()
    {
        //Setup the frame:
            frame = new JFrame("HomeworkRushBareBones");
            frame.setSize(frameWidth, frameHeight);
            //frame.setUndecorated(true);//Add this when quit button is enabled
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setIgnoreRepaint(true);
        //Add user-made stuff to the frame:
            frame.addKeyListener(new KeyboardControl());
            gamePanel = new GamePanel();
            frame.add(gamePanel);
        //Making the frame visible should always be last:
            frame.setVisible(true);
            
        //Help keep track of what is instantiated:
        System.out.println("New GameFrame Made");
    }
    
    public GamePanel getGamePanel()
    {
        return gamePanel;
    }
}
