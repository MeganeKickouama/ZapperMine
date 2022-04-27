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
        transitionToGameLostWorld();
        touchBlock();
        
        
    }
    
    public void eatCoin() {
        
        World currentWorld = getWorld();
        Actor coin = (Actor)getOneIntersectingObject(Coins.class);
        
        if (coin != null) {
            
            currentWorld.removeObject(coin);
        }
        
    }
    
    public void transitionToGameLostWorld() {
    
        
        if (ateLastCoin()) {
            
            Greenfoot.setWorld(new Level_Lost());
        }
    }
    
    public boolean ateLastCoin() {
        
        World world = getWorld();
        int coinCount = world.getObjects(Coins.class).size();
        Actor coin = (Actor)getOneIntersectingObject(Coins.class);
        
        if (coinCount == 1 && coin != null) {
            return true;
        } else return false; // fix later.. Should transition to world when its last coin and its eaten by fang
    }
    
    public void touchBlock() {
        
        Actor horizontal = (Actor)getOneIntersectingObject(Obstacle_Horizontal.class);
        Actor vertical = (Actor)getOneIntersectingObject(Obstacle_Vertical.class);
        
        int num = 1;
        if (horizontal != null) {
            
            if (num % 1 == 0) {
                turn(180);
                //move(2);
                num++;
            }
            if (num % 1 != 0) {
                
                //turn(-90);
                move(-2);
                num++;
            }
            
        }
        if (vertical != null) {
            
            if (num % 1 == 0) {
                
                turn(180);
                setLocation(getX(), getY() - 2);
                num++;
            }
            if (num  % 1 != 0) {
                
                //turn(-45);
                setLocation(getX(), getY() + 2);
                num++;
            }
        }
    }
}
