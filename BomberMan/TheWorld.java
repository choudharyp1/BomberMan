import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheWorld extends World
{
    static String thekey = "";
    /**
     * Constructor for objects of class TheWorld.
     * 
     */
    
    
    public TheWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(18,10,60);
        
        

        prepare();
    }

    
    public void act(){
        thekey = Greenfoot.getKey();
    
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        Player1 player1 = new Player1();
        addObject(player1, 1, 1);
        Player2 player2 = new Player2();
        addObject(player2, 16, 8);
        player1.setLocation(1, 1);
        HorizontalBrick horizontalbrick = new HorizontalBrick();
        addObject(horizontalbrick, 0, 9);
        HorizontalBrick horizontalbrick2 = new HorizontalBrick();
        addObject(horizontalbrick2, 1, 9);
        HorizontalBrick horizontalbrick3 = new HorizontalBrick();
        addObject(horizontalbrick3, 2, 9);
        HorizontalBrick horizontalbrick4 = new HorizontalBrick();
        addObject(horizontalbrick4, 3, 9);
        HorizontalBrick horizontalbrick5 = new HorizontalBrick();
        addObject(horizontalbrick5, 4, 9);
        HorizontalBrick horizontalbrick6 = new HorizontalBrick();
        addObject(horizontalbrick6, 6, 9);
        HorizontalBrick horizontalbrick7 = new HorizontalBrick();
        addObject(horizontalbrick7, 5, 9);
        HorizontalBrick horizontalbrick8 = new HorizontalBrick();
        addObject(horizontalbrick8, 7, 9);
        HorizontalBrick horizontalbrick9 = new HorizontalBrick();
        addObject(horizontalbrick9, 8, 9);
        HorizontalBrick horizontalbrick10 = new HorizontalBrick();
        addObject(horizontalbrick10, 9, 9);
        HorizontalBrick horizontalbrick11 = new HorizontalBrick();
        addObject(horizontalbrick11, 10, 9);
        HorizontalBrick horizontalbrick12 = new HorizontalBrick();
        addObject(horizontalbrick12, 11, 9);
        HorizontalBrick horizontalbrick13 = new HorizontalBrick();
        addObject(horizontalbrick13, 12, 9);
        HorizontalBrick horizontalbrick14 = new HorizontalBrick();
        addObject(horizontalbrick14, 13, 9);
        HorizontalBrick horizontalbrick15 = new HorizontalBrick();
        addObject(horizontalbrick15, 15, 9);
        HorizontalBrick horizontalbrick16 = new HorizontalBrick();
        addObject(horizontalbrick16, 14, 9);
        HorizontalBrick horizontalbrick17 = new HorizontalBrick();
        addObject(horizontalbrick17, 16, 9);
        HorizontalBrick horizontalbrick18 = new HorizontalBrick();
        addObject(horizontalbrick18, 17, 9);
        HorizontalBrick horizontalbrick19 = new HorizontalBrick();
        addObject(horizontalbrick19, 0, 0);
        HorizontalBrick horizontalbrick20 = new HorizontalBrick();
        addObject(horizontalbrick20, 1, 0);
        HorizontalBrick horizontalbrick21 = new HorizontalBrick();
        addObject(horizontalbrick21, 2, 0);
        HorizontalBrick horizontalbrick22 = new HorizontalBrick();
        addObject(horizontalbrick22, 4, 0);
        HorizontalBrick horizontalbrick23 = new HorizontalBrick();
        addObject(horizontalbrick23, 3, 0);
        HorizontalBrick horizontalbrick24 = new HorizontalBrick();
        addObject(horizontalbrick24, 6, 0);
        HorizontalBrick horizontalbrick25 = new HorizontalBrick();
        addObject(horizontalbrick25, 5, 0);
        HorizontalBrick horizontalbrick26 = new HorizontalBrick();
        addObject(horizontalbrick26, 7, 0);
        HorizontalBrick horizontalbrick27 = new HorizontalBrick();
        addObject(horizontalbrick27, 8, 0);
        HorizontalBrick horizontalbrick28 = new HorizontalBrick();
        addObject(horizontalbrick28, 10, 0);
        HorizontalBrick horizontalbrick29 = new HorizontalBrick();
        addObject(horizontalbrick29, 9, 0);
        HorizontalBrick horizontalbrick30 = new HorizontalBrick();
        addObject(horizontalbrick30, 11, 0);
        HorizontalBrick horizontalbrick31 = new HorizontalBrick();
        addObject(horizontalbrick31, 12, 0);
        HorizontalBrick horizontalbrick32 = new HorizontalBrick();
        addObject(horizontalbrick32, 13, 0);
        HorizontalBrick horizontalbrick33 = new HorizontalBrick();
        addObject(horizontalbrick33, 15, 0);
        HorizontalBrick horizontalbrick34 = new HorizontalBrick();
        addObject(horizontalbrick34, 14, 0);
        HorizontalBrick horizontalbrick35 = new HorizontalBrick();
        addObject(horizontalbrick35, 16, 0);
        HorizontalBrick horizontalbrick36 = new HorizontalBrick();
        addObject(horizontalbrick36, 17, 0);
        VerticalBrick verticalbrick = new VerticalBrick();
        addObject(verticalbrick, 17, 1);
        VerticalBrick verticalbrick2 = new VerticalBrick();
        addObject(verticalbrick2, 17, 0);
        VerticalBrick verticalbrick3 = new VerticalBrick();
        addObject(verticalbrick3, 17, 2);
        VerticalBrick verticalbrick4 = new VerticalBrick();
        addObject(verticalbrick4, 17, 4);
        VerticalBrick verticalbrick5 = new VerticalBrick();
        addObject(verticalbrick5, 17, 5);
        VerticalBrick verticalbrick6 = new VerticalBrick();
        addObject(verticalbrick6, 17, 3);
        VerticalBrick verticalbrick7 = new VerticalBrick();
        addObject(verticalbrick7, 17, 6);
        VerticalBrick verticalbrick8 = new VerticalBrick();
        addObject(verticalbrick8, 17, 7);
        VerticalBrick verticalbrick9 = new VerticalBrick();
        addObject(verticalbrick9, 17, 8);
        VerticalBrick verticalbrick10 = new VerticalBrick();
        addObject(verticalbrick10, 17, 9);
        VerticalBrick verticalbrick11 = new VerticalBrick();
        addObject(verticalbrick11, 0, 0);
        VerticalBrick verticalbrick12 = new VerticalBrick();
        addObject(verticalbrick12, 0, 1);
        VerticalBrick verticalbrick13 = new VerticalBrick();
        addObject(verticalbrick13, 0, 2);
        VerticalBrick verticalbrick14 = new VerticalBrick();
        addObject(verticalbrick14, 0, 3);
        VerticalBrick verticalbrick15 = new VerticalBrick();
        addObject(verticalbrick15, 0, 4);
        VerticalBrick verticalbrick16 = new VerticalBrick();
        addObject(verticalbrick16, 0, 5);
        VerticalBrick verticalbrick17 = new VerticalBrick();
        addObject(verticalbrick17, 0, 5);
        verticalbrick17.setLocation(0, 6);
        verticalbrick16.setLocation(0, 5);
        VerticalBrick verticalbrick18 = new VerticalBrick();
        addObject(verticalbrick18, 0, 7);
        VerticalBrick verticalbrick19 = new VerticalBrick();
        addObject(verticalbrick19, 0, 8);
        VerticalBrick verticalbrick20 = new VerticalBrick();
        addObject(verticalbrick20, 0, 9);
        Barrier1 barrier1 = new Barrier1();
        addObject(barrier1, 2, 2);
        Barrier1 barrier12 = new Barrier1();
        addObject(barrier12, 3, 2);
        Barrier1 barrier13 = new Barrier1();
        addObject(barrier13, 4, 2);
        Barrier1 barrier14 = new Barrier1();
        addObject(barrier14, 5, 2);
        Barrier1 barrier15 = new Barrier1();
        addObject(barrier15, 6, 2);
        Barrier1 barrier16 = new Barrier1();
        addObject(barrier16, 2, 7);
        Barrier1 barrier17 = new Barrier1();
        addObject(barrier17, 3, 7);
        Barrier1 barrier18 = new Barrier1();
        addObject(barrier18, 4, 7);
        Barrier1 barrier19 = new Barrier1();
        addObject(barrier19, 5, 7);
        Barrier1 barrier110 = new Barrier1();
        addObject(barrier110, 6, 7);
        Barrier1 barrier111 = new Barrier1();
        addObject(barrier111, 15, 2);
        Barrier1 barrier112 = new Barrier1();
        addObject(barrier112, 14, 2);
        Barrier1 barrier113 = new Barrier1();
        addObject(barrier113, 13, 2);
        Barrier1 barrier114 = new Barrier1();
        addObject(barrier114, 12, 2);
        Barrier1 barrier115 = new Barrier1();
        addObject(barrier115, 11, 2);
        Barrier1 barrier116 = new Barrier1();
        addObject(barrier116, 15, 7);
        Barrier1 barrier117 = new Barrier1();
        addObject(barrier117, 14, 7);
        Barrier1 barrier118 = new Barrier1();
        addObject(barrier118, 12, 7);
        Barrier1 barrier119 = new Barrier1();
        addObject(barrier119, 13, 7);
        Barrier1 barrier120 = new Barrier1();
        addObject(barrier120, 11, 7);
        Barrier2 barrier2 = new Barrier2();
        addObject(barrier2, 2, 2);
        Barrier2 barrier22 = new Barrier2();
        addObject(barrier22, 2, 3);
        Barrier2 barrier23 = new Barrier2();
        addObject(barrier23, 2, 4);
        Barrier2 barrier24 = new Barrier2();
        addObject(barrier24, 2, 5);
        Barrier2 barrier25 = new Barrier2();
        addObject(barrier25, 2, 6);
        Barrier2 barrier26 = new Barrier2();
        addObject(barrier26, 2, 7);
        Barrier2 barrier27 = new Barrier2();
        addObject(barrier27, 15, 2);
        Barrier2 barrier28 = new Barrier2();
        addObject(barrier28, 15, 3);
        Barrier2 barrier29 = new Barrier2();
        addObject(barrier29, 16, 4);
        barrier29.setLocation(15, 4);
        Barrier2 barrier210 = new Barrier2();
        addObject(barrier210, 15, 5);
        Barrier2 barrier211 = new Barrier2();
        addObject(barrier211, 15, 6);
        Barrier2 barrier212 = new Barrier2();
        addObject(barrier212, 15, 7);
        Barrier2 barrier213 = new Barrier2();
        addObject(barrier213, 11, 2);
        Barrier2 barrier214 = new Barrier2();
        addObject(barrier214, 11, 3);
        Barrier2 barrier215 = new Barrier2();
        addObject(barrier215, 11, 7);
        Barrier2 barrier216 = new Barrier2();
        addObject(barrier216, 11, 6);
        Barrier2 barrier217 = new Barrier2();
        addObject(barrier217, 6, 2);
        Barrier2 barrier218 = new Barrier2();
        addObject(barrier218, 6, 3);
        Barrier2 barrier219 = new Barrier2();
        addObject(barrier219, 7, 7);
        Barrier2 barrier220 = new Barrier2();
        addObject(barrier220, 7, 6);
        barrier219.setLocation(6, 7);
        barrier220.setLocation(6, 6);
        Barrels barrels = new Barrels();
        addObject(barrels, 16, 4);
        Barrels barrels2 = new Barrels();
        addObject(barrels2, 16, 4);
        Barrels barrels3 = new Barrels();
        addObject(barrels3, 16, 5);
        Barrels barrels4 = new Barrels();
        addObject(barrels4, 16, 3);
        Barrels barrels5 = new Barrels();
        addObject(barrels5, 16, 6);
        Barrels barrels6 = new Barrels();
        addObject(barrels6, 1, 3);
        Barrels barrels7 = new Barrels();
        addObject(barrels7, 1, 4);
        Barrels barrels8 = new Barrels();
        addObject(barrels8, 1, 5);
        Barrels barrels9 = new Barrels();
        addObject(barrels9, 1, 6);
        Barrels barrels10 = new Barrels();
        addObject(barrels10, 3, 8);
        Barrels barrels11 = new Barrels();
        addObject(barrels11, 4, 8);
        Barrels barrels12 = new Barrels();
        addObject(barrels12, 5, 8);
        Barrels barrels13 = new Barrels();
        addObject(barrels13, 3, 1);
        Barrels barrels14 = new Barrels();
        addObject(barrels14, 4, 1);
        Barrels barrels15 = new Barrels();
        addObject(barrels15, 5, 1);
        Barrels barrels16 = new Barrels();
        addObject(barrels16, 12, 1);
        Barrels barrels17 = new Barrels();
        addObject(barrels17, 14, 1);
        Barrels barrels18 = new Barrels();
        addObject(barrels18, 15, 1);
        Barrels barrels19 = new Barrels();
        addObject(barrels19, 13, 1);
        barrels18.setLocation(12, 3);
        Barrels barrels20 = new Barrels();
        addObject(barrels20, 13, 4);
        Barrels barrels21 = new Barrels();
        addObject(barrels21, 14, 3);
        Barrels barrels22 = new Barrels();
        addObject(barrels22, 13, 5);
        Barrels barrels23 = new Barrels();
        addObject(barrels23, 12, 6);
        Barrels barrels24 = new Barrels();
        addObject(barrels24, 14, 6);
        Barrels barrels25 = new Barrels();
        addObject(barrels25, 12, 5);
        barrels25.setLocation(11, 4);
        Barrels barrels26 = new Barrels();
        addObject(barrels26, 11, 5);
        Barrels barrels27 = new Barrels();
        addObject(barrels27, 6, 4);
        Barrels barrels28 = new Barrels();
        addObject(barrels28, 6, 5);
        Barrels barrels29 = new Barrels();
        addObject(barrels29, 4, 3);
        Barrels barrels30 = new Barrels();
        addObject(barrels30, 3, 4);
        Barrels barrels31 = new Barrels();
        addObject(barrels31, 5, 4);
        Barrels barrels32 = new Barrels();
        addObject(barrels32, 4, 5);
        barrels30.setLocation(3, 3);
        barrels31.setLocation(5, 3);
        barrels29.setLocation(4, 4);
        Barrels barrels33 = new Barrels();
        addObject(barrels33, 3, 6);
        Barrels barrels34 = new Barrels();
        addObject(barrels34, 5, 6);
        Barrels barrels35 = new Barrels();
        addObject(barrels35, 7, 2);
        Barrels barrels36 = new Barrels();
        addObject(barrels36, 8, 2);
        Barrels barrels37 = new Barrels();
        addObject(barrels37, 9, 2);
        Barrels barrels38 = new Barrels();
        addObject(barrels38, 10, 2);
        Barrels barrels39 = new Barrels();
        addObject(barrels39, 9, 3);
        Barrels barrels40 = new Barrels();
        addObject(barrels40, 8, 3);
        Barrels barrels41 = new Barrels();
        addObject(barrels41, 8, 4);
        Barrels barrels42 = new Barrels();
        addObject(barrels42, 9, 4);
        Barrels barrels43 = new Barrels();
        addObject(barrels43, 9, 5);
        Barrels barrels44 = new Barrels();
        addObject(barrels44, 8, 5);
        Barrels barrels45 = new Barrels();
        addObject(barrels45, 8, 6);
        Barrels barrels46 = new Barrels();
        addObject(barrels46, 9, 6);
        Barrels barrels47 = new Barrels();
        addObject(barrels47, 9, 7);
        Barrels barrels48 = new Barrels();
        addObject(barrels48, 8, 7);
        Barrels barrels49 = new Barrels();
        addObject(barrels49, 7, 7);
        Barrels barrels50 = new Barrels();
        addObject(barrels50, 10, 7);
        Barrels barrels51 = new Barrels();
        addObject(barrels51, 12, 8);
        Barrels barrels52 = new Barrels();
        addObject(barrels52, 13, 8);
        Barrels barrels53 = new Barrels();
        addObject(barrels53, 14, 8);
        barrels2.setLocation(10, 8);
        removeObject(barrels2);
    }
}