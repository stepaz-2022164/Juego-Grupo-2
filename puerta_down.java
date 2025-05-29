import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class puerta_down here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class puerta_down extends Actor
{
    /**
     * Act - do whatever the puerta_down wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public puerta_down(){
        GreenfootImage img = getImage(); 
        img.scale(20, 200);              
        setImage(img); 
        setRotation(90);

    }
    public void act()
    {
        GreenfootImage img = getImage(); 
        img.scale(20, 200);              
        setImage(img); 
        setRotation(90);
        // Add your action code here.
    }
}
