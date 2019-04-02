import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends World
{
    private AirPlane thePlane;

    private Eagle Theeagle;
    
    private Pigeon ThePigeon;
    
    private Stork TheStork;
    
    private int healthValue = 5;
    
    private SupplyDrop Drop;
    
    /**
     * Constructor for objects of class HealthyWorld.
     * 
     */
    public Sky()
    {   
        // Create a new world with 800x400
        super(800, 400, 1);

        // Create the plane pigeon stork and eagle class
        thePlane = new AirPlane();
        this.addObject(thePlane, 0, 200);
        ThePigeon = new Pigeon();
        this.addObject(ThePigeon,800,Greenfoot.getRandomNumber(400));
        TheStork = new Stork();
        this.addObject(TheStork,800,Greenfoot.getRandomNumber(400));
        Theeagle = new Eagle();
        this.addObject(Theeagle,800,Greenfoot.getRandomNumber(400));
        Drop = new SupplyDrop();
        this.addObject(Drop,0,200);
    }

}
