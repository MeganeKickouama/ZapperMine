import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fang extends Actor
{
    public Fang() {
        
        GifImage fangColourBlue = new GifImage("Fang_Animation_Blue.gif");
        GifImage fangColourGreen = new GifImage("Fang_Animation_Green.gif");
        GifImage fangColourOrange = new GifImage("Fang_Animation_Orange.gif");
        
        int colourID = Greenfoot.getRandomNumber(3);
        if (colourID == 0) {
            
            setImage(fangColourBlue.getCurrentImage());
        } else if (colourID == 1) {
            
            setImage(fangColourGreen.getCurrentImage());
        } else {
            
            setImage(fangColourOrange.getCurrentImage());
        }
        
        getImage().scale(80, 80);
        
        // fix gif not moving later
    }
    
    
    public void act()
    {
        
    }
}
