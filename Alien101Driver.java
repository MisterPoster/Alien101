public class Alien101Driver
{
    public static void main (String[] args)
    {
        Fighter Shinji = new Fighter ("Third Child EVA Pilot", "Shinji Ikari", "Evangelion Unit 1", 14, 200, 1, 100);
        Fighter Asuka = new Fighter ("Second Child EVA Pilot", "Akusa Langley Soryu", "Evangelion Unit 2", 14, 125, 1, 100);

        Klingon Steve = new Klingon ("Steve", "Plasma Sword", 1, 45, true);
        Creeper notSteve = new Creeper ("Not Steve", "None", 1, 20, false);
        Creeper notNotSteve = new Creeper ();

        Shinji.Attack (50, notSteve);
        Shinji.Attack (75, Steve);
        Shinji.Attack (20, notNotSteve);

        Actor[] theCast = {Shinji, Asuka, Steve, notSteve, notNotSteve};

        for(Actor a : theCast)
        {
            System.out.println (a.toString () );
            System.out.println ("---------------------");
        }



    } //END OF MAIN
} //END OF ALIEN101DRIVER
