import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class monedas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monedas extends Actor
{
    /**
     * Act - do whatever the monedas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    MyWorld mundo = (MyWorld) getWorld();
    public boolean puedesalir = false;
    
    int y_mas = 0;
    int y_men = 0;
    int x_mas = 0;
    int x_men = 0;
    public void act()
    {
        disparo();
        input();
        puertas();
        cambiar_sala();
        
        
    }
    public void puertas(){
        if(puedesalir){
            
        }else{
            if (isTouching(puerta.class)) {
            setLocation(getX() - 5, getY()); 
        }else if(isTouching(puerta_derecha.class)){
            setLocation(getX() + 5, getY());    
        }else if(isTouching(puerta_down.class)){
            setLocation(getX(), getY()+5);
        }else if(isTouching(puerta_up.class)){
            setLocation(getX(), getY()-5);
        }
        }
        
    }
    public void cambiar_sala(){
        
    }
    public void input(){
         if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()- 5);
        }
         if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+ 5);
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 5, getY());
        }
        if(Greenfoot.isKeyDown("a")||Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("d")||Greenfoot.isKeyDown("s")){
            
        }else{
             if (Greenfoot.isKeyDown("left")) {
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("up")) {
            setRotation(0);
        }
         if (Greenfoot.isKeyDown("down")) {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("right")) {
            setRotation(90);
        }
        }
    }
    public void disparo(){
         if (Greenfoot.isKeyDown("a")) {
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("w")) {
            setRotation(0);
        }
         if (Greenfoot.isKeyDown("s")) {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("d")) {
            setRotation(90);
        }
    }
}
