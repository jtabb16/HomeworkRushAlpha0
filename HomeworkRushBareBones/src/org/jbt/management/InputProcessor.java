/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbt.management;

import java.awt.event.KeyEvent;
import java.util.HashSet;

/**
 *
 * @author jbt
 */
public class InputProcessor 
{
    public InputProcessor()
    {
        System.out.println("New InputProcessor Made");
    }
    
    protected void performKeys()
    {
        HashSet<Integer> currentKeys = KeyboardControl.getActiveKeys();
        if (currentKeys.contains(KeyEvent.VK_W))
        {
            System.out.println("W");
        }
        if (currentKeys.contains(KeyEvent.VK_A))
        {
            System.out.println("A");
        }
        if (currentKeys.contains(KeyEvent.VK_S))
        {
            System.out.println("S");
        }
        if (currentKeys.contains(KeyEvent.VK_D))
        {
            System.out.println("D");
        }
    }
}
