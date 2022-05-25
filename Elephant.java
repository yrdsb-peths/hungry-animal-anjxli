import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    GreenfootSound elephantNoise = new GreenfootSound("Monster.mp3");
    GreenfootImage[] elephantPicRight = new GreenfootImage[7];
    GreenfootImage[] elephantPicLeft = new GreenfootImage[7];
    
    //Driection of the elephant is facing
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    // constructor
    public Elephant()
    {
        for(int i = 0; i < elephantPicRight.length; i++)
        {
            elephantPicRight[i] = new GreenfootImage("images/tile" + i + ".png");
            elephantPicRight[i].scale(100, 125);
        }
        
        for(int i = 0; i< elephantPicLeft.length; i++)
        {
            elephantPicLeft[i] = new GreenfootImage("images/tile" + i + ".png");
            elephantPicLeft[i].mirrorHorizontally();
            elephantPicLeft[i].scale(100, 125);
        }
        animationTimer.mark();
        
        //Intial elephant image
        setImage(elephantPicRight[0]);
        
    }
    
    // animate elephant
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() < 200)
        {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right"))
        {
            setImage(elephantPicRight[imageIndex]);
            imageIndex = (imageIndex + 1) % elephantPicRight.length;
        }
        else
        {
           setImage(elephantPicLeft[imageIndex]);
           imageIndex = (imageIndex + 1) % elephantPicLeft.length; 
        }
        
    }
    
    public void act()
    {
      if(Greenfoot.isKeyDown("a"))
      {
          move(-3);
          facing = "left";
      }
      else if(Greenfoot.isKeyDown("d"))
      {
          move(3);
          facing = "right";
      }
      if(Greenfoot.isKeyDown("left"))
      {
          move(-3);
          facing = "left";
      }
      else if(Greenfoot.isKeyDown("right"))
      {
          move(3);
          facing = "right";
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
            elephantNoise.play();
        }
        
    }
}
