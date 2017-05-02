import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rules here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rules extends World
{

    /**
     * Constructor for objects of class Rules.
     * 
     */
    public Rules()
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
        Rules1 rules1 = new Rules1();
        addObject(rules1, 8, 1);
        rules1.setLocation(8, 2);
        rules1.setLocation(8, 1);
        Rules2 rules2 = new Rules2();
        addObject(rules2, 8, 6);
        rules2.setLocation(9, 5);
        Continue4 continue4 = new Continue4();
        addObject(continue4, 16, 8);
    }
}
