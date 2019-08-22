import javax.annotation.PostConstruct;

public class Enemy implements Actor
{
    //VARIABLES
    int lives = 0, health = 0;
    String name = "", weapon = "";
    boolean isFriendly = false;
    //CONSTRUCTOR
    public Enemy ()
    {
        name = "kilg";
        weapon = "balcony";
    }

    public Enemy (String name, String weapon, int lives, int health, boolean isFriendly)
    {
        this.name = name;
        this.weapon = weapon;

        this.lives = lives;
        this.health = health;

        this.isFriendly = isFriendly;
    }

    //GETTERS
    public String getName ()
    {
        return name;
    }

    public String getWeapon ()
    {
        return weapon;
    }

    @Override
    public int getHealth ()
    {
        return health;
    }

    //SETTERS
    @Override
    public void setHealth (int health)
    {
        this.health = health;
    }

    //BRAIN
    @Override
    public void Attack (int damage, Actor a)
    {
        System.out.println ("Enemy A attacked with " + weapon);
    }

    @Override
    public String toString ()
    {
        return "Name: " + name +
                "\nFriendly: " + isFriendly +
                "\nWeapon: " + weapon +
                "\nHealth: " + health;
    }
}
