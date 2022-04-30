import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skip_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skip_Button extends Buttons
{
    /**
     * Act - do whatever the Skip_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseMoved(this)) {
            setImage("Skiph.png");
        } 
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            setImage("Skip.png");
        }
        
         if (Greenfoot.mouseClicked(this)) {
            
            Level_1 lvl1 = new Level_1();
            Greenfoot.setWorld(lvl1);
        }
    }
}
