package org.jbt.management;

/**
 *
 * @author jbt
 */
public class Updater 
{
    InputProcessor input;
    public Updater()
    {
        input = new InputProcessor();
        System.out.println("New Updater Made");
    }
    
    protected void update()
    {
        input.performKeys();//Check the user input
    }
    
    private void updatePhysics()
    {
        
    }
    
    private void updateBoundaryDetection()
    {
        
    }
    
    private void updateDamageAndHealth()
    {
        
    }
}
