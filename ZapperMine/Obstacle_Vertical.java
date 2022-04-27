import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle_Vertical here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle_Vertical extends Blocks
{
    /**
     * Act - do whatever the Obstacle_Vertical wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        killZapper();
    }
    
    public void killZapper() {
        
        World currentWorld = getWorld();
        Actor zapper = (Actor)getOneIntersectingObject(Zapper.class);
        
        if (zapper != null) {
            
            currentWorld.removeObject(zapper);
        }
        
    }
}
