import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_Lost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_Lost extends World
{
    private static GreenfootSound lvlLostMusic = new GreenfootSound("Zapslat_GameOver.wav");
    
    public Level_Lost()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1);
        prepare();
        started();
        
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Back_Button back_Button = new Back_Button();
        addObject(back_Button,294,563);
        Restart_Button restart_Button = new Restart_Button();
        addObject(restart_Button,295,444);
        Acces_Level_Button acces_Level_Button = new Acces_Level_Button();
        addObject(acces_Level_Button,608,442);
        back_Button.setLocation(458,557);
    }
    public void started() {
        
        lvlLostMusic.play();
    }
    public void stopped() {
        
        lvlLostMusic.stop();
    }
}
