import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart_Button extends Buttons
{
    /**
     * Act - do whatever the Restart_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseMoved(this)) {
            setImage("Restarth.png");
        } 
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            setImage("Restart.png");
        }
        
        if (Greenfoot.mouseClicked(this)) {
            if (getWorld() instanceof Level_Lost) {
                 
                if (Level_3.isBeaten == true) {
                    
                    Greenfoot.setWorld(new Level_4());
                } else if (Level_3.isBeaten != true && Level_2.isBeaten == true) {
                    
                    Greenfoot.setWorld(new Level_3());
                } else if (Level_2.isBeaten != true && Level_1.isBeaten == true) {
                    
                    Greenfoot.setWorld(new Level_2());
                } else if (Level_1.isBeaten != true) {
                    
                    Greenfoot.setWorld(new Level_1());
                }
            }
            
            if (getWorld() instanceof Level_Won) {
                 
                if (Level_4.isBeaten == true) {
                    
                    Greenfoot.setWorld(new Level_4());
                } else if (Level_3.isBeaten == true) {
                    
                    Greenfoot.setWorld(new Level_3());
                } else if (Level_2.isBeaten == true) {
                    
                    Greenfoot.setWorld(new Level_2());
                } else {
                    
                    Greenfoot.setWorld(new Level_1());
                }
            }
        }
    }
}

