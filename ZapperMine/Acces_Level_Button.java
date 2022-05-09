import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Acces_Level_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Acces_Level_Button extends Buttons
{
    /**
     * Act - do whatever the Acces_Level_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage("Levelsh.png");
        } 
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            setImage("Levels.png");
        } // if mouse clicked, access levels
        
        if (Greenfoot.mouseClicked(this)) {
            
            Access_Level Levels = new Access_Level();
            Greenfoot.setWorld(Levels);
            getWorld().stopped();
        }
    }
}
