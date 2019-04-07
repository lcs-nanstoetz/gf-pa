
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AirPlane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirPlane extends Actor
{
    private int healthValue;
    /**
     * Constructor
     * 
     * Must initialize all fields (instance variables).
     */
    public AirPlane()
    {
        healthValue = 5;
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
        if (isTouching(Eagle.class)== true)
        {
            changeHealthValueBy(-1);
            removeTouching(Eagle.class);
        }   
        if (isTouching(Pigeon.class)== true)
        {
            changeHealthValueBy(-1);
            removeTouching(Pigeon.class);
        }   
        if (isTouching(Stork.class)== true)
        {
            changeHealthValueBy(-1);
            removeTouching(Stork.class);
        }   
        if (isTouching(SupplyDrop.class)== true)
        {
            changeHealthValueBy(1);
            removeTouching(SupplyDrop.class);
        } 
        checkForRemoval();
    }

    private void changeHealthValueBy(int thisMuch)
    {
        healthValue += thisMuch;        
        String healthUpdate = Integer.toString(healthValue);
        getWorld().showText(healthUpdate, 100, 50);
    } 

    private void checkForRemoval()
    {
        if (healthValue < 1)
        {
            Sky world = (Sky) getWorld();
            Explosion newExplosion = new Explosion();
            getWorld().addObject(newExplosion, getX(), getY());
            
            getWorld().showText("GAME OVER", 400,200);
            getWorld().removeObject(this);
            Greenfoot.stop();
            
        }   
    }
}

