import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        if (isBumpingTheWorldEdge()) {
            turn(90);
        }
    }
    
    private boolean isBumpingTheWorldEdge() {
        int rotation = getRotation();
        World world = getWorld();
        if ((rotation == 0 || rotation == 180) && (getX() >= world.getWidth()-1 || getX() <= 0)) {
            return true;
        }
        if ((rotation == 90 || rotation == 270) && (getY() >= world.getHeight()-1 || getY() <= 0)) {
            return true;
        }
        
        return false;
    }
}
