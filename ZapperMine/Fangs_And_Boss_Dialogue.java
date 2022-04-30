import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fangs_And_Boss_Dialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fangs_And_Boss_Dialogue extends World
{

    /**
     * Constructor for objects of class Fangs_And_Boss_Dialogue.
     * 
     */
    public Fangs_And_Boss_Dialogue()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Skip_Button skip_Button = new Skip_Button();
        addObject(skip_Button,119,636);
        Previous_Button previous_Button = new Previous_Button();
        addObject(previous_Button,118,553);
        Next_Button next_Button = new Next_Button();
        addObject(next_Button,119,475);
    }
}
