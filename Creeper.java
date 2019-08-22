public class Creeper extends Enemy
{
    //VARIABLES
    boolean isAggressive = true;

    //CONSTRUCTOR
    public Creeper ()
    {
        isAggressive = false;
    }

    public Creeper (String name, String weapon, int lives, int health, boolean isFriendly)
    {
        super(name, weapon, lives, health, isFriendly);
        isAggressive = false;
    }

    public Creeper (String name, String weapon, int lives, int health, boolean isFriendly, boolean isAggressive)
    {
        super (name, weapon, lives, health, isFriendly);
        this.isAggressive = isAggressive;
    }

    //GETTERS

    public boolean isAggressive ()
    {
        return isAggressive;
    }

    @Override
    public int getHealth ()
    {
        return super.getHealth ();
    }

    //SETTERS
    public void setAggressive (boolean aggressive)
    {
        isAggressive = aggressive;
    }

    //BRAIN METHODS
    @Override
    public void Attack (int damage, Actor a)
    {
        if(isAggressive)
        {
            health -= damage;
        }
        else
        {
            System.out.println ("Ur cat saved u");
        }
    }

    @Override
    public String toString ()
    {
        return super.toString ();
    }
} //END OF CREEPER
