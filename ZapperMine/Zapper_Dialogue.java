import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zapper_Dialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zapper_Dialogue extends World
{

    /**
     * Constructor for objects of class Zapper_Dialogue.
     * 
     */
    public Zapper_Dialogue()
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
        addObject(skip_Button,120,641);
        Previous_Button previous_Button = new Previous_Button();
        addObject(previous_Button,119,565);
        Next_Button next_Button = new Next_Button();
        addObject(next_Button,116,485);
    }
}
