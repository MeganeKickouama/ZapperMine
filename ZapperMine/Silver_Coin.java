import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Silver_Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Silver_Coin extends Actor
{
    GifImage silverCoin = new GifImage("SilverCoin.gif");
    /**
     * Act - do whatever the Silver_Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(silverCoin.getCurrentImage());
        getImage().scale(55, 55);
    }
}
