import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int frames = 0;
    
    public void act() 
    {
        frames ++;
        dissapear();
    }  
    private void dissapear()
    {
        if (frames / 60 == 2)
        {
            Sky world = (Sky) getWorld();
            
            getWorld().removeObject(this);
            
        }
    }
}