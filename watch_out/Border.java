import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Border here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Border extends Actor
{
    /**
     * Act - do whatever the Border wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
                if (isTouching(Eagle.class)== true)
        {

            removeTouching(Eagle.class);
        }   
        if (isTouching(Pigeon.class)== true)
        {

            removeTouching(Pigeon.class);
        }   
        if (isTouching(Stork.class)== true)
        {

            removeTouching(Stork.class);
        } 
    }    
}