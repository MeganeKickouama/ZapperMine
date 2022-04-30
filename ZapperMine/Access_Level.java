import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

// the right one
/**
 * Write a description of class Access_Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Access_Level extends World
{

    /**
     * Constructor for objects of class Access_Level.
     * 
     */
    public Access_Level()
    {    
        super(900, 555, 1);

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Level_1_Button level_1_Button = new Level_1_Button();
        addObject(level_1_Button,151,267);
        Level_2_Button level_2_Button = new Level_2_Button();
        addObject(level_2_Button,357,265);
        Level_3_Button level_3_Button = new Level_3_Button();
        addObject(level_3_Button,565,265);
        Level_4_Button level_4_Button = new Level_4_Button();
        addObject(level_4_Button,775,262);
        level_4_Button.setLocation(772,265);
        Back_Button back_Button = new Back_Button();
        addObject(back_Button,144,479);
        Story_Button story_Button = new Story_Button();
        addObject(story_Button,144,405);
    }
}
