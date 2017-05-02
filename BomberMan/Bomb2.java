import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Bomb2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb2 extends Actor
{
    /**
     * Act - do whatever the Bomb2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       
       boolean bombIsPlanted = false;
        int timeToExplode = 0;
       static int bombradius = 2;
       static int BombsPlanted = 0;
       static int numberOfBombs = 1;
       static int totalPlanted = 0;
        public void act() 
    {
       
        explode();
    }    
    
           void explode(){
        if(bombIsPlanted == true && timeToExplode < 70){
            timeToExplode++;
            boolean down = true, up = true, left = true, right = true;
            
            if (timeToExplode == 70){
                timeToExplode = 0;    
                BombsPlanted = 0;
                getWorld().addObject(new Explosion (), getX(), getY());
                for (int i = 1; i < bombradius; i++){
                    if (right == true){
                    if (canMove(getX()+ i, getY())){
                        getWorld().addObject(new Explosion(),getX() + i, getY());
                       
                    }
                    else right = false;
                }
                if (isBarrel(getX() + i, getY())){
                    right = false;
                }
               
                if (left == true){
                    if (canMove(getX() - i, getY())){
                        getWorld().addObject(new Explosion(), getX() - i, getY());
                        
                    }
                    else left = false;
                }
                 if (isBarrel(getX() - i, getY())){
                    left = false;
                }
                if (up == true){
                    if (canMove(getX(), getY() - i)){
                            getWorld().addObject(new Explosion(), getX(), getY() - i);
                        
                        }
                        else up = false;
                    }
                     if (isBarrel(getX(), getY() - i)){
                    up = false;
                }
                    if (down == true){
                    if (canMove(getX(), getY() + i)){
                        getWorld().addObject(new Explosion(), getX(), getY() + i);
                        
                    }
                    else down = false;
                }
                     if (isBarrel(getX(), getY() + i)){
                    down = false;
                }
                }
                
                getWorld().removeObject(this);
                bombIsPlanted = false;
                totalPlanted--;
            }        
           
        }   
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
        
        
        return true;
        
    }
     boolean isBarrel(int x, int y){
        ArrayList<Barrels> barrels = (ArrayList<Barrels>)getWorld().getObjectsAt(x, y, Barrels.class);
        if(barrels.size() != 0){
            return true;
        }
        
        return false;
    }   
}
