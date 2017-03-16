import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadWorld here.
 * 
 * Name: Emmanuel Olaniyanu
 * Teacher: Mr. Hardman
 * Lab #2, Assignment 2 Explosions
 * Date Last Modified: 3/16/2017 
 */
public class BadWorld extends World
{

    /**
     * Constructor for objects of class BadWorld.
     * 
     */
    public BadWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act()
    {

         if ( Greenfoot.isKeyDown("Space") )
         {
             addObject ( new Explosion(), Greenfoot.getRandomNumber(12)*50+25, Greenfoot.getRandomNumber(8)*50+25);
             addObject ( new Rock(), Greenfoot.getRandomNumber(12)*50+25, Greenfoot.getRandomNumber(8)*50+25);
         }
         
    }
    
}
