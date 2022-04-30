import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Context here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Context extends World
{

    /**
     * Constructor for objects of class Context.
     * 
     */
    public Context()
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
        addObject(skip_Button,119,640);
        Previous_Button previous_Button = new Previous_Button();
        addObject(previous_Button,119,568);
        Next_Button next_Button = new Next_Button();
        addObject(next_Button,119,488);
    }
}
