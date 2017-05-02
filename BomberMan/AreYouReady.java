import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AreYouReady here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AreYouReady extends World
{

    /**
     * Constructor for objects of class AreYouReady.
     * 
     */
    public AreYouReady()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(18, 10, 60); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Welcome welcome = new Welcome();
        addObject(welcome, 8, 2);
        removeObject(welcome);
        GetReady getready = new GetReady();
        addObject(getready, 8, 2);
        Play play = new Play();
        addObject(play, 8, 7);

        play.setLocation(8, 5);
        getready.setLocation(8, 1);
        Controller controller = new Controller();
        addObject(controller, 16, 8);
        controller.setLocation(16, 8);
        HowToPlay3 howtoplay3 = new HowToPlay3();
        addObject(howtoplay3, 2, 8);
        howtoplay3.setLocation(1, 8);
    }
}
