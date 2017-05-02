import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controls2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controls2 extends World
{

    /**
     * Constructor for objects of class Controls2.
     * 
     */
    public Controls2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(18,10,60); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Player2Controls player2controls = new Player2Controls();
        addObject(player2controls, 8, 3);
        player2controls.setLocation(8, 2);
        Player2Control player2control = new Player2Control();
        addObject(player2control, 8, 5);
        Continue3 continue3 = new Continue3();
        addObject(continue3, 15, 8);
        Continue3 continue32 = new Continue3();
        addObject(continue32, 15, 6);
        removeObject(continue32);
    }
}
