import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_4_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_4_Button extends Buttons
{
    /**
     * Act - do whatever the Level_4_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseMoved(this)) {
            setImage("Lvl4h.png");
        } 
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            setImage("Lvl4.png");
        }
        
        if (Greenfoot.mouseClicked(this)) {
            
            Level_4 level4 = new Level_4();
            Greenfoot.setWorld(level4);
        }
    }
}
