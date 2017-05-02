import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controls extends World
{

    /**
     * Constructor for objects of class Controls.
     * 
     */
    public Controls()
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
        Player1Control player1control = new Player1Control();
        addObject(player1control, 9, 5);
        Player1Controls player1controls = new Player1Controls();
        addObject(player1controls, 8, 2);
        player1controls.setLocation(9, 2);
        Continue2 continue2 = new Continue2();
        addObject(continue2, 16, 8);
    }
}
