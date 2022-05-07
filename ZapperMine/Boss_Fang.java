import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss_Fang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss_Fang extends Fangs
{
    GifImage bossFangGIF = new GifImage("Boss_Fang_Animation.gif");
    int coinsEaten = 0;
    public void act()
    {
        setImage(bossFangGIF.getCurrentImage());
        getImage().scale(80, 80);
        
        move(2);
        eatCoin();
        touchBlock();
        eatZapper();
        
    }
    
    public void eatCoin() {
        
        World currentWorld = getWorld();
        Actor coin = (Actor)getOneIntersectingObject(Coins.class);
        Actor silverCoin = (Actor)getOneIntersectingObject(Silver_Coin.class);
        
        if (coin != null) {
            
            currentWorld.removeObject(coin);
            if (currentWorld.getObjects(Coins.class).size() == 0) {
                
                 Splash_Screen splash = new Splash_Screen();
                 splash.stopped();
                 
                 Level_Lost level = new Level_Lost();
                 Greenfoot.setWorld(level);
                 level.started();
            }
        }
        
        if (silverCoin != null) { // when the fangs touch a silver coin, the game is automatically over. this makes the silver coin important to protect.
            
            currentWorld.removeObject(silverCoin);
            Level_Lost levelLost = new Level_Lost();
            Greenfoot.setWorld(levelLost);
            levelLost.started();
        }
    }
    
    public void touchBlock() {
        
        Actor vertical = (Actor)getOneIntersectingObject(Obstacle_Vertical.class);
        
        int num = 1;
        if (vertical != null) {
            
            if (num % 1 == 0) {
                
                turn(180);
                setLocation(getX(), getY() - 2);
                num++; // fix later
            }
            if (num  % 1 != 0) {
                
                //turn(-45);
                setLocation(getX(), getY() + 2);
                num++;
            }
        }
    }
    
    public void eatZapper() {
        
        Actor zapper = (Actor)getOneIntersectingObject(Zapper.class);
        if (zapper != null) {
            
            World world = getWorld();
            world.removeObject(zapper);
        }
    }
}
