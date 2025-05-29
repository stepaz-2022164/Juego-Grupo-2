import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class puerta_derecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class puerta_derecha extends Actor
{
    /**
     * Act - do whatever the puerta_derecha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public puerta_derecha(){
         GreenfootImage img = getImage(); 
        img.scale(20, 200);              
        setImage(img);                
    }
    public void act()
    {
        GreenfootImage img = getImage(); 
        img.scale(20, 200);              
        setImage(img);  
        // Add your action code here.
    }
}
