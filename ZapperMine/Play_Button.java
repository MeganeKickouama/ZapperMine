import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play_Button extends Buttons
{
    /**
     * Act - do whatever the Play_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (Greenfoot.mouseMoved(this)) {
            setImage("Playh.png");
        } 
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            setImage("Play.png");
        }
        
        if (Greenfoot.mouseClicked(this)) {
            
            Level_1 level1 = new Level_1();
            Greenfoot.setWorld(level1);
        }
    }
}
