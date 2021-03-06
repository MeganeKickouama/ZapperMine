import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Splash_Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Splash_Screen extends World
{
    private static GreenfootSound gamePlayMusic = new GreenfootSound("Zapslat_GamePlay.wav");
    public Splash_Screen()
    {    
        super(900, 700, 1);
        
        prepare();
        
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Acces_Level_Button acces_Level_Button = new Acces_Level_Button();
        addObject(acces_Level_Button,182,530);
        Play_Button play_Button = new Play_Button();
        addObject(play_Button,460,530);
        Story_Button story_Button = new Story_Button();
        addObject(story_Button,722,527);
    }
    public void started() {
        
        gamePlayMusic.playLoop();
    }
    public void stopped() {
        
        gamePlayMusic.stop();
    }
    
}
