import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_3_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_3_Button extends Buttons
{
    /**
     * Act - do whatever the Level_3_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseMoved(this)) {
            setImage("Lvl3h.png");
        } 
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            setImage("Lvl3.png");
        }
        
        if (Greenfoot.mouseClicked(this)) {
            
            Level_3 level3 = new Level_3();
            Greenfoot.setWorld(level3);
        }
    }
}
