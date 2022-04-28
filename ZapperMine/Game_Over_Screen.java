import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game_Over_Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_Over_Screen extends World
{

    /**
     * Constructor for objects of class Game_Over_Screen.
     * 
     */
    private GreenfootSound gameOverMusic;
    /**
     * Constructor for objects of class Game_Over_Screen.
     * 
     */
    public Game_Over_Screen() 
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1);
        textEdited("GAME OVER!!", 225,350);
        gameOverMusic = new GreenfootSound("gameover.wav");
    }
    public void textEdited(String men,int x, int y){
        GreenfootImage bg = getBackground();
        Font font = new Font(80);
        bg.setFont(font);
        bg.drawString(men, x, y);
        
    }
}
