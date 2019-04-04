import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stork here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stork extends Birds
{
    /**
     * Act - do whatever the Stork wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-5);
        if (isTouching(AirPlane.class) == true)
        {
            //setImage(_filename_);
        }
    }    
}
