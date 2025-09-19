import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public void act()
    {
        String key = Greenfoot.getKey();
        if (key == null) {
            return;
        }
        if (key.equals("up")) {
            setRotation(270);
        }
        if (key.equals("down")) {
            setRotation(90);
        }
        if (key.equals("right")) {
            setRotation(0);
        }
        if (key.equals("left")) {
            setRotation(180);
        }
        move(10);
    }
}
