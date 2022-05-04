import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    public void act()
    {
      if(Greenfoot.isKeyDown("a"))
      {
          move(-1);
      }
      if(Greenfoot.isKeyDown("d"))
      {
          move(1);
      }
      if(isTouching(Fries.class))
      {
          removeTouching(Fries.class);
      }
    }
}
