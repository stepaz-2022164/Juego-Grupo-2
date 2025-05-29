import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class puerta_up here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class puerta_up extends Actor
{
    /**
     * Act - do whatever the puerta_up wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public puerta_up(){
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
