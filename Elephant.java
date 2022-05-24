import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    public void act()
    {
      if(Greenfoot.isKeyDown("a"))
      {
          move(-3);
      }
      else if(Greenfoot.isKeyDown("d"))
      {
          move(3);
      }
      if(Greenfoot.isKeyDown("left"))
      {
          move(-3);
      }
      else if(Greenfoot.isKeyDown("right"))
      {
          move(3);
      }
      eat();
    }
    
    public void eat()
    {
        if(isTouching(Fries.class))
        {
            removeTouching(Fries.class);
            MyWorld world = (MyWorld)getWorld();
            world.spawnFries();
            world.increaseScore();
        }
        
    }
}
