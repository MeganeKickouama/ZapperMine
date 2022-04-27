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
        eatCoin();
        
        setImage(zapperLeft.getCurrentImage());
        getImage().scale(80, 80);
        
        if (Greenfoot.isKeyDown("left")) {
            move(-2);
            setImage(zapperLeft.getCurrentImage());
        }
        if (Greenfoot.isKeyDown("right")) {
            move(2);
            setImage(zapperRight.getCurrentImage());
            getImage().scale(80, 80);
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-2);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+2);
        }
        
    }
    
    public void eatCoin() {
        
        World currentWorld = getWorld();
        Actor coin = (Actor)getOneIntersectingObject(Coins.class);
        
        if (coin != null) {
            
            currentWorld.removeObject(coin);
        }
        
    }
}
