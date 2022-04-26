import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss_Fang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss_Fang extends Actor
{
    GifImage bossFangGIF = new GifImage("Boss_Fang_Animation.gif");
    public void act()
    {
        setImage(bossFangGIF.getCurrentImage());
        getImage().scale(80, 80);
    }
    
    public void eatCoin() {
        
        World currentWorld = getWorld();
        Actor coin = getOneIntersectingObject(Coin.class);
        
        if (coin != null) {
            
            currentWorld.removeObject(coin);
        }
        
    }
}
