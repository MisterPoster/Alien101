public class Klingon extends Enemy
{
    //VARIABLES
    boolean isFriendly = true;

    //CONSTRUCTOR
    public Klingon ()
    {
        isFriendly = false;
    }

    public Klingon (boolean isFriendly)
    {
        this.isFriendly = isFriendly;
    }

    public Klingon (String name, String weapon, int lives, int health, boolean isFriendly)
    {
        super (name, weapon, lives, health, isFriendly);
    }

    //GETTERS
    @Override
    public String getName ()
    {
        return super.getName ();
    }

    @Override
    public int getHealth ()
    {
        return super.getHealth ();
    }

    @Override
    public String getWeapon ()
    {
        return super.getWeapon ();
    }

    //SETTERS
    public void setFriendly (boolean friendly)
    {
        isFriendly = friendly;
    }

    //BRAIN
    @Override
    public void Attack (int damage, Actor a)
    {
        if (isFriendly)
        {
            System.out.println ("You saw each other and chatted for a bit.");
        }
        else
        {
            System.out.println ("You combat with his weapon, the " + weapon);
        }

        super.Attack (damage, a);
    }

    @Override
    public String toString ()
    {
        return "Klingon(isFriendly = " + isFriendly + ")" +
                "\nLives: " + lives +
                "\nHealth: " + health +
                "\nWeapon: " + weapon;
    }
}
