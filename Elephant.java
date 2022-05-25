import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    GreenfootSound elephantNoise = new GreenfootSound("name of the file");
    GreenfootImage[] elephantPic = new GreenfootImage[8];
    
    // constructor
    public Elephant()
    {
        for(int i = 0; i < elephantPic.length; i++)
        {
            elephantPic[i] = new GreenfootImage("name of the file" + i + ".png");
        }
        setImage(elephantPic[0]);
        
    }
    
    // animate elephant
    int imageIndex = 0;
    public void animateElephant()
    {
        setImage(elephantPic[imageIndex]);
        imageIndex = (imageIndex + 1) % elephantPic.length;
    }
    
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
      //animate the elephant
      animateElephant();
    }
    
    public void eat()
    {
        if(isTouching(Fries.class))
        {
            removeTouching(Fries.class);
            MyWorld world = (MyWorld)getWorld();
            world.spawnFries();
            world.increaseScore();
            elephantNoise();
        }
        
    }
}
