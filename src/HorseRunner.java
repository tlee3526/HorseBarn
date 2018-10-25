public class HorseRunner {
    public static void main (String[] args)
    {
        Horse horse1 = new mustang("Secretariat",12000);
        Horse horse2 = new mustang("Dusty Trail",22000);
        Horse horse3 = new newmustang("Silver",12000);

        Horse[] horses = new Horse[6];

        Horse[1] = horse1;
        Horse[3] = horse2;
        Horse[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println("Dustry Trail is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println("Dusty Trail is now in space:" + barn.findHorseSpace("Dusty Trail"));
    }
}
