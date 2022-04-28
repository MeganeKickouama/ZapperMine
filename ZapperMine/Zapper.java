import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zapper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zapper extends Actor
{
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
    
    // the wonworld is inside of the eatCoin() method because 
    // the point of the game is to get the last coin.
    public void eatCoin() {
        
        World currentWorld = getWorld();
        Actor coin = (Actor)getOneIntersectingObject(Coins.class);
        
        if (coin != null) {
            
            currentWorld.removeObject(coin);
            if (currentWorld.getObjects(Coins.class).size() == 0) {
                
                 Greenfoot.setWorld(new Level_Won());
            }
        }
    }
}
