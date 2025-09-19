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

        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
        }
        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("up") || 
            Greenfoot.isKeyDown("down") || 
            Greenfoot.isKeyDown("right") || 
            Greenfoot.isKeyDown("left")
        ) {
            move(10);
        }
    }
}
