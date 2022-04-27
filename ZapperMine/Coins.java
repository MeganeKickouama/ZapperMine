import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coins extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GifImage coinAnimation = new GifImage("Untitled_Artwork.gif");
    
    public void act()
    {
        setImage(coinAnimation.getCurrentImage());
        getImage().scale(55, 55);
    }
}
