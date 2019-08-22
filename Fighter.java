public class Fighter implements Actor
{
    //VARIABLES
    int level = 0, xp = 0, lives = 0, health = 0;
    String rank = "", name = "", weapon = "";

    final int allLevels = 3;

    //CONSTRUCTOR
    public Fighter ()
    {
        level = 0;
        xp = 0;
        lives = 0;
        health = 0;
        rank = "Private";
        name = "John/Jane Doe";
        weapon = "Ramen";
    }

    public Fighter (String rank, String name, String weapon, int level, int xp, int lives, int health)
    {
        this.rank = rank;
        this.name = name;
        this.weapon = weapon;

        this.rank = rank;
        this.level = level;
        this.xp = xp;
        this.health = health;
    }

    //GETTERS
    public int getLevel ()
    {
        return level;
    }

    public String getWeapon ()
    {
        return weapon;
    }

    public String getName ()
    {
        return name;
    }

    public int getHealth ()
    {
        return health;
    }

    //SETTERS
    public void setName (String name)
    {
        this.name = name;
    }

    public void setXp (int xp)
    {
        this.xp = xp;
    }

    public void setWeapon (String weapon)
    {
        this.weapon = weapon;
    }

    @Override
    public void setHealth (int health)
    {
        this.health = health;
    }

    //BRAIN
    @Override
    public void Attack (int damage, Actor e)
    {
        System.out.println (name + " got into " + weapon + " and fought " + e.getClass ().getName ());

        health -= 50;
        int a = e.getHealth () ;

        e.setHealth (a - damage);

        if(e.getHealth () <= 0)
        {
            System.out.println ("The enemy lost.");
        }
    }

    @Override
    public String toString ()
    {
        return "Name: " + name +
                "\nFighter: " + rank +
                "\nWeapon: " + weapon +
                "\nLevel: " + level +
                "\nXP: " + xp;
    }
} //END OF FIGHTER
