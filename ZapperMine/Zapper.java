import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
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
    
    int magnetChance_LVL1 = 1;
    public void act()
    {
        eatCoin();
        eatSilverCoin();
        
        setImage(zapperLeft.getCurrentImage());
        getImage().scale(80, 80);
        
        commands();
        if (canUseMagnet_LVL1()) {
            magnet();
        }
        
    }
    
    public void commands() {
        
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
                
                currentWorld.stopped();
                Level_Won lvlWon = new Level_Won();
                Greenfoot.setWorld(lvlWon);
                lvlWon.started();
                if (currentWorld instanceof Level_1) {
                    
                    Level_1.isBeaten = true;
                }
                if (currentWorld instanceof Level_2) {
                    
                    Level_2.isBeaten = true;
                }
                if (currentWorld instanceof Level_3) {
                    
                    Level_3.isBeaten = true;
                }
                if (currentWorld instanceof Level_4) {
                    
                    Level_4.isBeaten = true;
                }
            }
        }
    }
    
    public void eatSilverCoin() {
        
        World currentWorld = getWorld();
        Actor silver = (Actor)getOneIntersectingObject(Silver_Coin.class);
        
        if (silver != null) {
            
            currentWorld.removeObject(silver);
            Actor coin = (Actor)getOneIntersectingObject(Coins.class);
            
            if (currentWorld.getObjects(Coins.class).size() == 0 &&
                currentWorld.getObjects(Silver_Coin.class).size() == 0) {
                    
                    Greenfoot.setWorld(new Level_Won());
                }
            
        }
    }
    
    public void magnet() {
        
        List<Coins> coin = getObjectsInRange(200, Coins.class);
        if (Greenfoot.isKeyDown("m") && (!coin.isEmpty())) {
            for (int i = 0; i < coin.size(); i++) {
                
                coin.get(i).turnTowards(getX(), getY());
                coin.get(i).move(2);
                //Vector2D coinToZapper = new Vector2D(coin.get(i).getX() - getX(), coin.get(i).getY() - getY());
                //coinToZapper.normalize();
                
                //coin.move(coinToZapper*2);
            }
            
            magnetChance_LVL1--;
        }
    }
    
    public boolean canUseMagnet_LVL1() {
        
        return (magnetChance_LVL1 >= 0);
    }
}
