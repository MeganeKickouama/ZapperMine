import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_Won here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_Won extends World
{
    private static GreenfootSound lvlWonSound = new GreenfootSound("ZapSlat_GameWon.mp3");
    /**
     * Constructor for objects of class Level_Won.
     * 
     */
    public Level_Won()
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
        Next_Button next_Button = new Next_Button();
        addObject(next_Button,598,404);
        Restart_Button restart_Button = new Restart_Button();
        addObject(restart_Button,309,403);
        Back_Button back_Button = new Back_Button();
        addObject(back_Button,310,535);
        Acces_Level_Button acces_Level_Button = new Acces_Level_Button();
        addObject(acces_Level_Button,601,535);
    }
    public void started() {
       
        lvlWonSound.playLoop();
    } 
    public void stopped() {
        
        lvlWonSound.stop();
    }
}
