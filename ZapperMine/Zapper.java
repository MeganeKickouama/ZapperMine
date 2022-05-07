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
    
    private static int coinsEatenLvl1 = 0;
    private static int coinsEatenLvl2 = 0;
    private static int coinsEatenLvl3 = 0;
    private static int coinsEatenLvl4 = 0;
    
    public void act()
        {
        eatCoin();
        eatSilverCoin();
        
        setImage(zapperLeft.getCurrentImage());
        getImage().scale(80, 80);
        
        commands();
        
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
        
        
        Actor coin = (Actor)getOneIntersectingObject(Coins.class);
        
        if (coin != null) {
            
            getWorld().removeObject(coin);
            Actor silver = (Actor)getOneIntersectingObject(Silver_Coin.class);
            Greenfoot.playSound("sound-effects-library-cash-register-sound.mp3");
            
            if (getWorld() instanceof Level_1) {
                    
                    coinsEatenLvl1++;
            }
            if (getWorld() instanceof Level_2) {
                    
                    coinsEatenLvl2++;
            }
            if (getWorld() instanceof Level_3) {
                    
                    coinsEatenLvl3++;
            }
            if (getWorld() instanceof Level_4) {
                    
                    coinsEatenLvl4++;
            }
            // if instance of levels, coinseaten++
            if (getWorld().getObjects(Coins.class).size() == 0 &&
            getWorld().getObjects(Silver_Coin.class).size() == 0) {
                
                getWorld().stopped();
                Level_Won lvlWon = new Level_Won();
                Greenfoot.setWorld(lvlWon);
                lvlWon.started();
                if (getWorld() instanceof Level_1) {
                    
                    Level_1.isBeaten = true;
                    
                }
                if (getWorld() instanceof Level_2) {
                    
                    Level_2.isBeaten = true;
                }
                if (getWorld() instanceof Level_3) {
                    
                    Level_3.isBeaten = true;
                }
                if (getWorld() instanceof Level_4) {
                    
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
            Greenfoot.playSound("sound-effects-library-cash-register-sound.mp3");

            
            if (currentWorld.getObjects(Coins.class).size() == 0 &&
                currentWorld.getObjects(Silver_Coin.class).size() == 0) {
                    
                    Greenfoot.setWorld(new Level_Won());
                    currentWorld.stopped();
                }
            
        }
    }
    public int getCoinsEaten1() {
        
        return coinsEatenLvl1;
    }
    public int getCoinsEaten2() {
        
        return coinsEatenLvl2;
    }
    public int getCoinsEaten3() {
        
        return coinsEatenLvl3;
    }
    public int getCoinsEaten4() {
        
        return coinsEatenLvl4;
    }
}
