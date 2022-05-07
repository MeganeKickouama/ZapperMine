import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Next_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next_Button extends Buttons
{
    /**
     * Act - do whatever the Next_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseMoved(this)) {
            setImage("Nexth.png");
        } 
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)) {
            setImage("Next.png");
        }

        if (Greenfoot.mouseClicked(this)) {
            
            
            if (getWorld() instanceof Context) {

                Arielle_Dialogue ari = new Arielle_Dialogue();
                Greenfoot.setWorld(ari);

            }   
            if (getWorld() instanceof Arielle_Dialogue) {

                Nathan_Dialogue nath = new Nathan_Dialogue();
                Greenfoot.setWorld(nath);

            }
            if (getWorld() instanceof Nathan_Dialogue) {

                Fangs_And_Boss_Dialogue fangs = new Fangs_And_Boss_Dialogue();
                Greenfoot.setWorld(fangs);

            }
            if (getWorld() instanceof Fangs_And_Boss_Dialogue) {

                Zapper_Dialogue zap = new Zapper_Dialogue();
                Greenfoot.setWorld(zap);

            }
            if (getWorld() instanceof Zapper_Dialogue) {

                Level_1 lvl1 = new Level_1();
                Greenfoot.setWorld(lvl1);

            }
            if (getWorld() instanceof Level_Won) {
                
                getWorld().stopped();
                
                if (Level_4.isBeaten == true) {

                    Greenfoot.setWorld(new Splash_Screen());
                } else if (Level_3.isBeaten == true) {

                    Greenfoot.setWorld(new Level_4());
                } else if (Level_2.isBeaten == true) {

                    Greenfoot.setWorld(new Level_3());
                } else if (Level_1.isBeaten == true) {

                    Greenfoot.setWorld(new Level_2());
                } else {
                    Greenfoot.setWorld(new Splash_Screen());
                }
            }
        }
    }
}
