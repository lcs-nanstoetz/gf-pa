import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AirPlane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirPlane extends Actor
{
    
    /**
     * Constructor
     * 
     * Must initialize all fields (instance variables).
     */
    public AirPlane()
    {

        turn(90);
    }
    /**
     * Act - do whatever the AirPlane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
              if (Greenfoot.isKeyDown("up") == true)
        {
            
            move(-10);
        }
        if (Greenfoot.isKeyDown("down") == true)
        {
            move(10);
        }  
    }    
}
