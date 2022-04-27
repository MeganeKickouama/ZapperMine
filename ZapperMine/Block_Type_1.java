import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block_Type_12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block_Type_1 extends Blocks
{
    /**
     * Act - do whatever the Block_Type_12 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Block_Type_1(int chosenRotation) {
        
        switch (chosenRotation) {
            
            case 1: turn(90);
            case 2: turn (180);
            case 3: turn(270);
            default: turn(0);
    }
}

    public void act()
    {
        // Add your action code here.
        killZapper();
        transitionToLevelWon();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mouseDragged(this)) {
            
            setLocation(mouse.getX(), mouse.getY());
        }

    
    }
    
    public void killZapper() {
            
            World currentWorld = getWorld();
            Actor zapper = (Actor)getOneIntersectingObject(Zapper.class);
            
            if (zapper != null) {
                currentWorld.removeObject(zapper);
                
            }
            
        }
        
    public boolean isZapperDead() {
        
        World world = getWorld();
        int zapperCount = world.getObjects(Zapper.class).size();
        
        if (zapperCount == 0) {
            return true;
        } else return false;
    }
    
    public void transitionToLevelWon() {
        
        if (isZapperDead()) {
            Greenfoot.setWorld(new Level_Won());
        }
    }

    
}
