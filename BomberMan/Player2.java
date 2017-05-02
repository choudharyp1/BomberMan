import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Actor
{
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    int timeToMove = 0;
    int speedup = 10;
            public void act() 
        {
         // stopAtWalls();
              if (Greenfoot.isKeyDown("up")){
                   if (canMove(getX(),getY() - 1))  {            
                if (timeToMove == 0){                                    
                    setLocation(getX(), getY() - 1);
                    timeToMove = speedup;
            }
        }
        setImage("Player3.png");
        }
        
        else if (Greenfoot.isKeyDown("down")){
            if (canMove(getX(), getY() + 1)){
                if (timeToMove == 0){
                
                setLocation(getX(), getY() + 1);
                timeToMove = speedup;
            }            
        }
        setImage("Player4.png");
        }
         else if (Greenfoot.isKeyDown("left")){
            if (canMove(getX() -1, getY())){
                  if (timeToMove == 0){
                        
                setLocation(getX() - 1, getY());
                timeToMove = speedup;
            }            
        }
        setImage("Player2.png");
        }
    
         else if (Greenfoot.isKeyDown("right")){
             if (canMove(getX() + 1, getY())){
              if (timeToMove == 0){
           
            setLocation(getX() + 1, getY());
            timeToMove = speedup;
        }
        }
         setImage("Player.png");
        }
            if (timeToMove == 0){
        }
        else{
            timeToMove--;
        }
    
        if (BombsCanBePlanted()){
            if ("p".equalsIgnoreCase(TheWorld.thekey)){
                Bomb2 bombs = new Bomb2();
                getWorld().addObject(bombs, getX(), getY());
                Bomb2.totalPlanted++;
                bombs.bombIsPlanted = true;
            }
        }      
        if(isthereSpeed()){
            removeSpeed();
            speedup--;
        }
        
        if (isthereLife()){
            removeLife();
            Explosion.Player2Lives++;
        }
        if( isthereBombUpgrade()){
            removeBombUpgrade();
            Bomb2.numberOfBombs++;
        }
        if (isthereRadiusOfBomb()){
            removeRadiusOfBomb();
            Bomb2.bombradius++;
        }

    }
    
    public boolean BombsCanBePlanted(){
        if (Bomb2.numberOfBombs == Bomb2.totalPlanted){
            return false;
        }
        
            return true;
        
    }
    boolean canMove(int x, int y){
        ArrayList<HorizontalBrick> HBrick = (ArrayList<HorizontalBrick>)getWorld().getObjectsAt(x, y, HorizontalBrick.class);
        if(HBrick.size() != 0){
            return false;
        }
        ArrayList<VerticalBrick> VBrick = (ArrayList<VerticalBrick>)getWorld().getObjectsAt(x, y, VerticalBrick.class);
        if(VBrick.size() != 0){
            return false;
        }        
        ArrayList<Barrier1> barrier1 = (ArrayList<Barrier1>)getWorld().getObjectsAt(x, y, Barrier1.class);
        if(barrier1.size() != 0){
            return false;
        }
        ArrayList<Barrier2> barrier2 = (ArrayList<Barrier2>)getWorld().getObjectsAt(x, y, Barrier2.class);
        if(barrier2.size() != 0){
            return false;
        }        
        ArrayList<Barrels> barrels = (ArrayList<Barrels>)getWorld().getObjectsAt(x, y, Barrels.class);
        if(barrels.size() != 0){
            return false;
        }
        ArrayList<Bomb1> bomb1 = (ArrayList<Bomb1>)getWorld().getObjectsAt(x, y, Bomb1.class);
        if(bomb1.size() != 0){
            return false;
        }
        ArrayList<Bomb2> bomb2 = (ArrayList<Bomb2>)getWorld().getObjectsAt(x, y, Bomb2.class);
        if(bomb2.size() != 0){
            return false;
        }
        
        return true;
        
    }
    public boolean isthereSpeed(){
        Actor Speed = getOneIntersectingObject(Speed.class);
        if (Speed!= null){
            return true;
        }
        return false;
    }
    public void removeSpeed(){
        Actor Speed = getOneIntersectingObject(Speed.class);
        if (Speed!= null){           
                getWorld().removeObject(Speed);
            }
        }
        public boolean isthereLife(){
        Actor Life = getOneIntersectingObject(Life.class);
        if (Life!= null){
            return true;
        }
        return false;
    }
    public void removeLife(){
        Actor Life = getOneIntersectingObject(Life.class);
        if (Life!= null){           
                getWorld().removeObject(Life);
            }
        }
        public boolean isthereBombUpgrade(){
        Actor BombUpgrade = getOneIntersectingObject(BombUpgrade.class);
        if (BombUpgrade!= null){
            return true;
        }
        return false;
    }
    public void removeBombUpgrade(){
        Actor BombUpgrade = getOneIntersectingObject(BombUpgrade.class);
        if (BombUpgrade!= null){           
                getWorld().removeObject(BombUpgrade);
            }
        }
        public boolean isthereRadiusOfBomb(){
        Actor RadiusOfBomb = getOneIntersectingObject(RadiusOfBomb.class);
        if (RadiusOfBomb!= null){
            return true;
        }
        return false;
    }
    public void removeRadiusOfBomb(){
        Actor RadiusOfBomb = getOneIntersectingObject(RadiusOfBomb.class);
        if (RadiusOfBomb!= null){           
                getWorld().removeObject(RadiusOfBomb);
            }
        }
        
    }

