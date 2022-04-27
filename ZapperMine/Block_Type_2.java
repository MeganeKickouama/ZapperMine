import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block_Type_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block_Type_2 extends Blocks
{
    /**
     * Act - do whatever the Block_Type_2 wants to do. This method is called whenever
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
