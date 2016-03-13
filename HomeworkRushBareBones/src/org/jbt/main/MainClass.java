/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbt.main;

import org.jbt.management.GameManager;

/**
 *
 * @author jbt
 */
public class MainClass 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Hello Jack. Let's get started. :)");
        
        int levelNum = 0;
        GameManager gM = new GameManager(levelNum);
        gM.startGame();
    }
    
}
