import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back_Button extends Buttons
{
    /**
     * Act - do whatever the Back_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseMoved(this)) {
            setImage("Backh.png");
        } 
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            setImage("Back.png");
        }
        if (Greenfoot.mouseClicked(this)) {
            if (getWorld() instanceof Access_Level) {
                
                Splash_Screen splash = new Splash_Screen();
                Greenfoot.setWorld(splash);
                
                
            }  
            if (getWorld() instanceof Level_Lost) {
                
                Splash_Screen splash = new Splash_Screen();
                Greenfoot.setWorld(splash);
                
            }
            if (getWorld() instanceof Level_Won) {
                
                Splash_Screen splash = new Splash_Screen();
                Greenfoot.setWorld(splash);
                
            }
        }
    }
}
