import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add your action code here.
        explode();
    }
    
    /**
     * explode plays expolosion sounds, adds 50 Debris to the world and removes Rock 
     * 
     * @param There are no parameters 
     * @return Nothing is returned
     */
    public void explode()
    {
        Greenfoot.playSound("MetalExplosion.wav");
        
        for( int i = 0; i < 50; i++ )
        {
            getWorld().addObject ( new Debris(), getX(), getY() );
        }
        
        getWorld().removeObject(this);
    }
    
}
