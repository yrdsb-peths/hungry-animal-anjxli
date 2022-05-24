import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fries extends Actor
{
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
        
        // no apple and print game over
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
