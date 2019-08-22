public interface Actor
{
    int health = 0, lives = 0;
    String name = "", weapon = "";

    public void Attack ( int damage, Actor a);

    public void setHealth (int health);

    public int getHealth ();

} //END OF INTERFACE
