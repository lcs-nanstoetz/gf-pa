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

    private SupplyDrop Drop;

    private int secondsAlive = 0;

    private int frames = 0;

    private Border border;

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
        this.addObject(thePlane, 100, 200);
        ThePigeon = new Pigeon();
        this.addObject(ThePigeon,800,Greenfoot.getRandomNumber(400));
        TheStork = new Stork();
        this.addObject(TheStork,800,Greenfoot.getRandomNumber(400));
        Theeagle = new Eagle();
        this.addObject(Theeagle,800,Greenfoot.getRandomNumber(400));
        Drop = new SupplyDrop();
        this.addObject(Drop,100,0);
        border = new Border();
        this.addObject(border,-00,0);
        // Show the initial health
        showText("5", 100, 50);
    }

    /**
     * Act - do whatever the HealthyWorld needs to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Every 60 frames, update the time
        if ((frames % 60) == 0)
        {
            // Show how many seconds have passed
            String timeElapsed = Integer.toString(frames / 60);

            // Reduce seconds left by one
            secondsAlive = secondsAlive + 1;

            // Display seconds left
            String counting = Integer.toString(secondsAlive);
            showText(counting, 50, 50);

        }
        
        if (frames % 1800 == 0)
        {
            addObject(new SupplyDrop(),100,0);  
        }
        if (frames % 30 == 0)
        {
            addObject(new Pigeon(),800,Greenfoot.getRandomNumber(400));
        }   

        if ((frames % 90) == 0)
        {
         addObject(new Stork(),800,Greenfoot.getRandomNumber(400));

        }
        if ((frames % 120) == 0)
        {
            addObject(new Eagle(),800,Greenfoot.getRandomNumber(400));
        }
        frames = frames + 1;
    }
}
