import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{

    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
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
        Yes yes = new Yes();
        addObject(yes, 13, 7);
        No no = new No();
        addObject(no, 12, 7);
        no.setLocation(11, 7);
        no.setLocation(2, 8);
        yes.setLocation(16, 8);
        yes.setLocation(15, 8);
        Text2 text2 = new Text2();
        addObject(text2, 9, 3);
    }
}
