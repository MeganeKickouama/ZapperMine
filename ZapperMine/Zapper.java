import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zapper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zapper extends Actor
{
    /**
     * Act - do whatever the Zapper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GifImage zapperLeft = new GifImage("Zapper_Side_View_(left).gif");
    GifImage zapperRight = new GifImage("Zapper_Side_View_(right).gif");
    public void act()
    {
        setImage(zapperLeft.getCurrentImage());
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")) {
            setImage(zapperLeft.getCurrentImage());
        }
        if (Greenfoot.isKeyDown("right")) {
            setImage(zapperRight.getCurrentImage());
        }
        
        getImage().scale(80, 80);
    }
}
