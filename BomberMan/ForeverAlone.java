import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ForeverAlone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForeverAlone extends World
{

    /**
     * Constructor for objects of class ForeverAlone.
     * 
     */
    public ForeverAlone()
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
        alone alone = new alone();
        addObject(alone, 8, 5);
        alone alone2 = new alone();
        addObject(alone2, 3, 3);
        alone alone3 = new alone();
        addObject(alone3, 15, 7);
        alone alone4 = new alone();
        addObject(alone4, 15, 2);
        alone alone5 = new alone();
        addObject(alone5, 3, 7);
        alone3.setLocation(15, 6);
        alone3.setLocation(15, 7);
        alone4.setLocation(15, 3);
        alone.setLocation(9, 5);
    }
}
