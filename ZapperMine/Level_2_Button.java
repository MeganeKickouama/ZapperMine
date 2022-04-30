import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_2_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_2_Button extends Buttons
{
    /**
     * Act - do whatever the Level_2_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseMoved(this)) {
            setImage("Lvl2h.png");
        } 
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            setImage("Lvl2.png");
        }
        
        if (Greenfoot.mouseClicked(this)) {
            
            Level_2 level2 = new Level_2();
            Greenfoot.setWorld(level2);
        }
    }
}
