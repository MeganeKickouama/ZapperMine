import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Previous_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Previous_Button extends Buttons
{
    /**
     * Act - do whatever the Previous_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseMoved(this)) {
            setImage("Previoush.png");
        } 
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            setImage("Previous.png");
        }
    }
}
