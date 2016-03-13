/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbt.management;

import org.jbt.display.GameFrame;
import org.jbt.synthesizedGameComponents.TileMap;

/**
 *
 * @author jbt
 */
public class GameManager 
{
    GameFrame gFrame;
    Updater updater;
    Renderer renderer;
    TileMap level;
    public GameManager(int levelNum)
    {
        gFrame = new GameFrame();
        
        updater = new Updater();
        level = new TileMap(levelNum);
        
        renderer = new Renderer(gFrame.getGamePanel().getGraphics(), level);
        
        System.out.println("New GameManager Made");
    }
    
    public void startGame()
    {
        boolean runGame = true;
        System.out.println("Game Running");
        while (runGame)
        {
            updater.update();
            renderer.render();
            //System.out.println("Game Running");
        }
    }
}
