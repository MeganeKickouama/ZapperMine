import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
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
    public static int magnetMode = 1;
    final int MAGNET_MODE_MAGNITUDE = 230;
    
    public void act()
    {
        setImage(coinAnimation.getCurrentImage());
        getImage().scale(55, 55);
        
    }
}
