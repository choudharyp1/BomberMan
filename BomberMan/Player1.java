import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Assassin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    
    /**
     * Act - do whatever the Assassin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   static int lives = 3;
   int timeToMove = 0;
   int speedup = 10;
    public void act() 
    {
        
        
            if (Greenfoot.isKeyDown("w")){
               if (canMove(getX(),getY() - 1))  {   
                if (timeToMove == 0){                                   
                setLocation(getX(), getY() - 1);
                timeToMove = speedup;
            }
        }
        setImage("Assassins3.png");
        }
        
        else if (Greenfoot.isKeyDown("s")){
                if (canMove(getX(), getY()+1)){
                if (timeToMove == 0){
                
                setLocation(getX(), getY() + 1);
                timeToMove = speedup;
            }
        }
        setImage("Assassins4.png");
        }
         else if (Greenfoot.isKeyDown("a")){
                 if (canMove(getX() - 1, getY())){
                  if (timeToMove == 0){
                        
                setLocation(getX() - 1, getY());
                timeToMove = speedup;
            }   
        }
        setImage("Assassins2.png");
        }
    
         else if (Greenfoot.isKeyDown("d")){
                 if (canMove(getX() + 1, getY())){
                  if (timeToMove == 0){
                
                setLocation(getX() + 1, getY());
                timeToMove = speedup;
            }
            }
            setImage("Assassin.png");
        }
            if (timeToMove == 0){
        }
        else{
            timeToMove--;
        }
        
        if (BombsCanBePlanted()){
            if ("`".equalsIgnoreCase(TheWorld.thekey)){
                Bomb1 bomb = new Bomb1();
                getWorld().addObject(bomb, getX(), getY());
                Bomb1.totalPlanted++;
                bomb.bombIsPlanted = true;
            }
        }
        
        if(isthereSpeed()){
            removeSpeed();
            speedup--;
        }
        
        if (isthereLife()){
            removeLife();
            Explosion.Player1Lives++;
        }
        if( isthereBombUpgrade()){
            removeBombUpgrade();
            Bomb1.numberOfBombs++;
        }
        if (isthereRadiusOfBomb()){
            removeRadiusOfBomb();
            Bomb1.bombradius++;
        }

        }
   
    
    
    public boolean BombsCanBePlanted(){
        if (Bomb1.numberOfBombs == Bomb1.totalPlanted){
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
