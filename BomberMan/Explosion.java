import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.\
     */
    
    int howtoExplode = 0;
    static int Player1Lives = 3;
    static int Player2Lives = 3;
    int whatupgrade = 0;
    public void act() 
    {
       if (howtoExplode < 3){
     setImage("Explosion.png");
     if (isthereBarrel()){
        removeBarrel();
    }
    if (istherePlayer1()){
        removePlayer1();
    }
    if (istherePlayer2()){
        removePlayer2();
    }
        }
        else if (howtoExplode >= 3 && howtoExplode <= 6){
            setImage("Explosion1.png");
        }
        else if (howtoExplode > 6 && howtoExplode < 10){
        setImage("Explosion2.png");
        
    }
    else{
   
        getWorld().removeObject(this);
    }
    
    
    
    howtoExplode++;
    }    
    
    public boolean isthereBarrel(){
        Actor Barrels = getOneIntersectingObject(Barrels.class);
        if (Barrels!= null){
            return true;
        }
        return false;
    }
    public void removeBarrel(){
        Actor Barrels = getOneIntersectingObject(Barrels.class);        
        if (Barrels!= null){
           whatupgrade = Greenfoot.getRandomNumber(20);
           getWorld().removeObject(Barrels);
           if (whatupgrade == 0 || whatupgrade == 1){
               getWorld().addObject(new Life(), getX(), getY());             
            }
            else if(whatupgrade == 2 || whatupgrade == 3){
                getWorld().addObject(new Speed(),getX(), getY());
            }
            else if(whatupgrade == 4 || whatupgrade == 5){
                getWorld().addObject(new RadiusOfBomb(), getX(), getY());
            }
            else if(whatupgrade == 6 || whatupgrade == 7){
                getWorld().addObject(new BombUpgrade(), getX(), getY());
            }
        }
        
    }
    public boolean istherePlayer1(){
        Actor Player1 = getOneIntersectingObject(Player1.class);
        if (Player1!= null){
            return true;
        }
        return false;
    }
    public void removePlayer1(){
        Actor Player1 = getOneIntersectingObject(Player1.class);
        if (Player1!= null){
           if (Player1Lives > 0){
               Player1Lives--;
               Player1.setLocation(1, 1);
               if (istherePlayer1()){
                   dontremovePlayer1();
                }
            }
            else{
                getWorld().removeObject(Player1);
                 getWorld().addObject(new Player2Wins(), 9, 3);
                 Greenfoot.stop();
            }
        }
        
    }
     public void dontremovePlayer1(){
        Actor Player1 = getOneIntersectingObject(Player1.class);
        if (Player1!= null){
           
        }
        
    }
    public boolean istherePlayer2(){
        Actor Player2 = getOneIntersectingObject(Player2.class);
        if (Player2!= null){
            return true;
        }
        return false;
    }
    public void removePlayer2(){
        Actor Player2 = getOneIntersectingObject(Player2.class);
        if (Player2!= null){
           if (Player2Lives > 0){
               Player2Lives--;
               Player2.setLocation(16, 8);
               if (istherePlayer2()){
                   dontremovePlayer2();
                }
            }
            else{
                getWorld().removeObject(Player2);
                getWorld().addObject(new Player1Wins(), 9, 3);
                Greenfoot.stop();
            }
        }
        
    }
    public void dontremovePlayer2(){
        Actor Player2 = getOneIntersectingObject(Player2.class);
        if (Player2!= null){
            
    }    
    
}
}